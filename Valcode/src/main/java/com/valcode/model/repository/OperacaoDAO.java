package com.valcode.model.repository;

import com.valcode.model.entity.Operacoes;

import com.valcode.service.OperacaoCriteria;
import com.valcode.service.OperacaoQueryService;

import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Repository
public class OperacaoDAO {
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Operacoes> searchOperacoes(OperacaoCriteria params){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Operacoes> query = builder.createQuery(Operacoes.class);
        Root r = query.from(Operacoes.class);

        Predicate predicate = builder.conjunction();
        OperacaoQueryService operacaoCriteria = new OperacaoQueryService(predicate, builder, r);
        operacaoCriteria.accept(params);
        predicate = operacaoCriteria.getPredicate();
        query.where(predicate);

        List<Operacoes> result = entityManager.createQuery(query).getResultList();
        return result;
    }

}
