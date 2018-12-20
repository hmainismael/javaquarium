package fr.univlittoral.javaquarium.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.univlittoral.javaquarium.bo.IPoissonsService;
import fr.univlittoral.javaquarium.dto.PoissonsDTO;
import fr.univlittoral.javaquarium.model.PoissonDO;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/poissons")
@Component
public class PoissonsController {
	
	@Autowired
	private IPoissonsService poissonsService;
	
	@GetMapping()
	public List<PoissonsDTO> displayFishes() {
		return poissonsService.getPoissons();
	}
	
	@PostMapping()
    @ResponseBody
    public ResponseEntity saveFish(@RequestBody PoissonsDTO poisson) {
		
		if (!poissonsService.exist(poisson)) {
			poissonsService.create(poisson);

	        return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
	
	@PutMapping()
	public ResponseEntity updateFish(@RequestBody PoissonsDTO poisson) {
		
		if (!poissonsService.exist(poisson)) {
			poissonsService.update(poisson);

	        return ResponseEntity.status(HttpStatus.OK).build();
		}
		
		return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
	}

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {
		return ;
	}
	
}
