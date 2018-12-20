package fr.univlittoral.javaquarium.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import fr.univlittoral.javaquarium.model.PoissonDO;

@Component
public class PoissonStubDAO implements IPoissonDAO {

	@Override
	public List<PoissonDO> findAll() {
		List<PoissonDO> poissons = new LinkedList<>();

		/*poissons.add(new PoissonDO("Anostomus", "Characides americains", "Rouge", 12.2f, 15.36f));
		poissons.add(new PoissonDO("Anostomus", "Characides americains", "Rouge", 12.2f, 15.36f));
		poissons.add(new PoissonDO("Anostomus", "Characides americains", "Rouge", 12.2f, 15.36f));
		poissons.add(new PoissonDO("Anostomus", "Characides americains", "Rouge", 12.2f, 15.36f));
		poissons.add(new PoissonDO("Anostomus", "Characides americains", "Rouge", 12.2f, 15.36f));*/

		return poissons;
	}
}
