package com.indracompany.treinamento.model.repository;

import java.util.List;

import com.indracompany.treinamento.model.entity.Cliente;

public interface ClienteRepository extends GenericCrudRepository<Cliente, Long>{
	
	Cliente findTopByCpfOrderByIdDesc(String cpf);
	
	List<Cliente> findByCpf(String cpf);
	
	List<Cliente> findByNomeContaining(String nome);
	

}
