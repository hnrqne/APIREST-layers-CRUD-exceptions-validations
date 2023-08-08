package com.hnrqne.crudclient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hnrqne.crudclient.dto.ClientDTO;
import com.hnrqne.crudclient.entities.Client;
import com.hnrqne.crudclient.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findByid(Long id) {
		
		Client client = repository.findById(id).get();
		return new ClientDTO(client);
	}
}
