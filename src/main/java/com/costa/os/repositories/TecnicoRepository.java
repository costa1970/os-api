package com.costa.os.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.costa.os.domain.Tecnico;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

	@Query("SELECT obj FROM Tecnico obj WHERE obj.cpf =:cpf ")
	Tecnico findBYCPF(@Param("cpf")  String cpf);
}
