package ma.bajeddi.controle1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.bajeddi.controle1.entities.Categorie;
import ma.bajeddi.controle1.services.CategorieService;

@RestController
@RequestMapping("/api/v1/categories")
public class CategorieController {

	@Autowired
	private CategorieService service;

	@GetMapping
	public List<Categorie> findAllCategorie() {
		return service.findAll();
	}

	@PostMapping
	public Categorie createCategorie(@RequestBody Categorie categorie) {
		categorie.setId(0);
		return service.create(categorie);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable int id) {
		Categorie categorie = service.findById(id);
		if (categorie == null) {
			return new ResponseEntity<Object>("Categorie avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
		} else {
			return ResponseEntity.ok(categorie);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updateCategorie(@PathVariable int id, @RequestBody Categorie newCategorie) {
		Categorie oldCategorie = service.findById(id);
		if (oldCategorie == null) {
			return new ResponseEntity<Object>("Categorie avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
		} else {
			newCategorie.setId(id);
			return ResponseEntity.ok(service.update(newCategorie));
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteCategorie(@PathVariable int id) {
		Categorie categorie = service.findById(id);
		if (categorie == null) {
			return new ResponseEntity<Object>("Categorie avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
		} else {
			service.delete(categorie);
			return ResponseEntity.ok("filière supprimée");
		}
	}
	@PostMapping("/filterByCategorie")
	public List<Categorie> findByCategorie(@RequestBody Categorie categorie) {
		return service.findByCategorie(categorie);
	}	
}
