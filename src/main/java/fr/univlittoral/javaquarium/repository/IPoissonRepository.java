package fr.univlittoral.javaquarium.repository;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import fr.univlittoral.javaquarium.model.PoissonDO;

@Repository
public interface IPoissonRepository extends JpaRepository<PoissonDO, Integer> {
	
	/**
	 * 
	 * @param espece
	 * @return
	 */
	Set<PoissonDO> findByEspece(final String espece);
}
