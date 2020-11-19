package com.ExampleValcode.valcode.service;

import com.ExampleValcode.valcode.model.entity.Pagamentos;
import com.ExampleValcode.valcode.model.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import javax.websocket.Session;
import java.util.ArrayList;
import java.util.List;
@Repository
public class PagamentoQueryService{

    @PersistenceContext
    EntityManager em;

    public Page<Pagamentos> resume(PagamentoFilter filter, Pageable pageable) {

        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Pagamentos> criteria = builder.createQuery(Pagamentos.class);
        Root<Pagamentos> root = criteria.from(Pagamentos.class);
        Predicate predicates = addRestrict(filter, builder, root);
        criteria.where(predicates);
        TypedQuery<Pagamentos> query = em.createQuery(criteria);
        return new PageImpl<>(query.getResultList(), pageable, total(filter));
    }

    private Long total(PagamentoFilter filter){
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<Pagamentos> root = criteria.from(Pagamentos.class);
        Predicate predicates = addRestrict(filter, builder, root);
        criteria.where(predicates);
        criteria.select(builder.count(root));
        return em.createQuery(criteria).getSingleResult();
    }

    private Predicate addRestrict(PagamentoFilter filter, CriteriaBuilder cb, Root root) {
        List<Predicate> predicates = new ArrayList<>();
        if (!StringUtils.isEmpty(filter.getDocCli())) {
            predicates.add(cb.like(cb.lower(root.get("pagamento_doc_cli")),
                    "%" + filter.getDocCli().toLowerCase() + "%"));
        }
        return cb.and(predicates.toArray(new Predicate[0]));
    }

    public boolean checkIfEmpty(String phrase) {
        if (phrase.equals("")) {
            return true;
        } else {
            return false;
        }
    }
}
