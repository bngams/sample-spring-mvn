package fr.cesi.ril17.spring.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cesi.ril17.spring.demo.entities.Client;
import fr.cesi.ril17.spring.demo.repositories.ClientRepository;

@Service
public class ClientService {
	
	private ClientRepository clientRepo;

	@Autowired
	public ClientService(ClientRepository clientRepo) {
		super();
		this.clientRepo = clientRepo;
	}
	
	public Optional<Client> findByName(String name) {
		return Optional.of(clientRepo.findByLastname(name).get(0));
	}

}
