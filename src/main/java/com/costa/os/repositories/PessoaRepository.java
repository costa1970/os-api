package com.costa.os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.costa.os.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

	@Query("SELECT obj FROM Pessoa obj WHERE obj.cpf =:cpf ")
	Pessoa findBYCPF(@Param("cpf")  String cpf);
}
