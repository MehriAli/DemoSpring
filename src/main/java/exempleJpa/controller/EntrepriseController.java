package exempleJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import exempleJpa.entity.Entreprise;
import exempleJpa.repositories.EntrepriseRepository;

@RestController
public class EntrepriseController {

	@Autowired
	private EntrepriseRepository entrepriseRepo;
	
	@GetMapping("/entreprises")
	public List<Entreprise> getAllCompanies(){
		return entrepriseRepo.findAll();
	}
	
	@PostMapping("/entreprise")
	public Entreprise addEntreprise(@RequestBody Entreprise entreprise) {
		return entrepriseRepo.save(entreprise);
	}
	
	@PutMapping("/entreprise/{id}")
	public Entreprise updateEntreprise(@RequestBody Entreprise entreprise ,@PathVariable Long id) {
		Entreprise en= entrepriseRepo.findById(id).get();
		en.setName(entreprise.getName());
		en.setPersonalsize(entreprise.getPersonalsize());
		entrepriseRepo.save(en);
		return entrepriseRepo.save(en);
	}
	
	@DeleteMapping("/entreprise/{id}")
	public String deleteEntreprise(@PathVariable Long id) {
		entrepriseRepo.deleteById(id);
		return "success";
	}
	
}
