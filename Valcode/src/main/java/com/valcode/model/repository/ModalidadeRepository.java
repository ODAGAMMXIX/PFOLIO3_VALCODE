package com.valcode.model.repository;

import com.valcode.model.entity.Modalidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeRepository extends JpaRepository<Modalidade, String> {
}
