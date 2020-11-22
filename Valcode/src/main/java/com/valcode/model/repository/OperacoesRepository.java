package com.valcode.model.repository;

import com.valcode.model.entity.Operacoes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacoesRepository extends JpaRepository<Operacoes, Integer> {
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM OPERACOES WHERE operacoes_doc_cli = ?1"
    )
    List<Operacoes> getByDocCli(String docCli);
}
