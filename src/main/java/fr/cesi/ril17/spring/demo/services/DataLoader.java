package fr.cesi.ril17.spring.demo.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cesi.ril17.spring.demo.entities.Client;
import fr.cesi.ril17.spring.demo.repositories.ClientRepository;

@Service
public class DataLoader {

	private ClientRepository clientRepo;

	@Autowired
	public DataLoader(ClientRepository clientRepo) {
		super();
		this.clientRepo = clientRepo;
	}
	
	@PostConstruct
	private void loadData() {
		// create client 
		Client client1 = new Client(null, "Boris", "Ngam", "", null);
		clientRepo.save(client1);
	}
	
}
