package fr.univlittoral.javaquarium.bo;

import java.util.List;

import javax.annotation.Resource;

import fr.univlittoral.javaquarium.dto.PoissonsDTO;

/**
 * @author ismael
 *
 */
public interface IPoissonsService {
	
	/**
	 * @return
	 */
	List<PoissonsDTO> getPoissons();
	
	void create(PoissonsDTO poisson);
	
	void update(PoissonsDTO poisson);
	
	boolean exist(PoissonsDTO poisson);
}
