package fr.univlittoral.javaquarium.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univlittoral.javaquarium.dao.IPoissonDAO;
import fr.univlittoral.javaquarium.dao.PoissonStubDAO;
import fr.univlittoral.javaquarium.dto.PoissonsDTO;
import fr.univlittoral.javaquarium.model.PoissonDO;
import fr.univlittoral.javaquarium.repository.IPoissonRepository;

@Component
public class PoissonsService implements IPoissonsService{
	
	@Autowired
	private IPoissonRepository poissonRepo;
	
	//private IPoissonDAO poissonDAO;

	/**
	 * @return
	 */
	@Override
	public List<PoissonsDTO> getPoissons() {
		final List<PoissonDO> poissons = poissonRepo.findAll();
		final List<PoissonsDTO> liste = new ArrayList<>();

		for (final PoissonDO poissonDO : poissons) {
			final PoissonsDTO poissonDTO = new PoissonsDTO();
			
			poissonDTO.setNom(poissonDO.getEspece());
			poissonDTO.setDescription(poissonDO.getDesc1());
			poissonDTO.setCouleur(poissonDO.getCouleur());
			poissonDTO.setDimension(poissonDO.getLongueur() + " x " + poissonDO.getLargeur());

			liste.add(poissonDTO);
		}

		return liste;
	}
	
	public void create(PoissonsDTO poisson) {
		PoissonDO pDO= new PoissonDO();
		
		//Attention : matcher les clés de l'objet avec les attributs du DTO
		
		pDO.setEspece(poisson.getNom());
		pDO.setCouleur(poisson.getCouleur());
		
		poissonRepo.save(pDO);
	}
	
	public void update(PoissonsDTO poisson) {
		//poissonRepo.findById().save(); //idee a suivre
	}
	
	public boolean exist(PoissonsDTO poisson) {
		return !poissonRepo.findByEspece(poisson.getNom()).isEmpty();
	}
}
