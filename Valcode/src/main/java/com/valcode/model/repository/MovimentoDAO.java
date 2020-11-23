package com.valcode.model.repository;

import com.valcode.model.entity.Movimentos;
import com.valcode.service.MovimentoCriteria;
import com.valcode.service.MovimentoQueryService;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Repository
public class MovimentoDAO {
	@PersistenceContext
    private EntityManager entityManager;
    
    public List<Movimentos> searchMovimentos(MovimentoCriteria params){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Movimentos> query = builder.createQuery(Movimentos.class);
        Root r = query.from(Movimentos.class);

        Predicate predicate = builder.conjunction();
        MovimentoQueryService MovimentoCriteria = new MovimentoQueryService(predicate, builder, r);
        MovimentoCriteria.accept(params);
        predicate = MovimentoCriteria.getPredicate();
        query.where(predicate);

        List<Movimentos> result = entityManager.createQuery(query).getResultList();
        return result;
    }

}
