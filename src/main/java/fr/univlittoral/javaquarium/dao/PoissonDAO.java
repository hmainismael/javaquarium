package fr.univlittoral.javaquarium.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.univlittoral.javaquarium.model.PoissonDO;

public class PoissonDAO implements IPoissonDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<PoissonDO> findAll() {
		return em.createQuery("from PoissonDO as p order by p.id").getResultList();
	};
}
