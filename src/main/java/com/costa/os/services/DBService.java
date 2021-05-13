package com.costa.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costa.os.domain.Cliente;
import com.costa.os.domain.OS;
import com.costa.os.domain.Tecnico;
import com.costa.os.domain.enuns.Prioridade;
import com.costa.os.domain.enuns.Status;
import com.costa.os.repositories.ClienteRepository;
import com.costa.os.repositories.OSRepository;
import com.costa.os.repositories.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private OSRepository osRepository;	
	
	public void instanciaDB() {
		Tecnico t1 = new Tecnico(null, "Sergio Costa", "666.376.480-27", "(41)3408-0999");
		Tecnico t2 = new Tecnico(null, "Dunga Silva", "050.999.000-20", "(41) 9999-8888");
		Cliente c1 = new Cliente(null, "Maria Jose", "442.136.300-64", "(41)9999-8888");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);
		
		t1.getList().add(os1);
		c1.getList().add(os1);
		
		tecnicoRepository.saveAll(Arrays.asList(t1,t2));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}
}
