package fr.cesi.ril17.spring.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Length(min = 3, max = 100)
	private String firstname;
	private String laststname;
	@Column(columnDefinition="TEXT")
	private String bio;
	@OneToMany(mappedBy="client")
	private List<Invoice> invoices;
	
}
