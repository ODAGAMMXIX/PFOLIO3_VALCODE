package com.valcode.model.repository;

import com.valcode.model.entity.Pagamentos;
import com.valcode.model.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
	
	Optional<Usuario> findByUsername(String username);	
	
}
