package com.ExampleValcode.valcode.model.repository;

import com.ExampleValcode.valcode.model.entity.Pagamentos;
import com.ExampleValcode.valcode.service.PagamentoFilter;
import com.ExampleValcode.valcode.service.dto.PagamentoDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PagamentoRepository extends JpaRepository <Pagamentos, Integer> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM PAGAMENTOS WHERE pagamentos_doc_cli = ?1"
    )
    List<Pagamentos> getByDocCli(String docCli);

}
