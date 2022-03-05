/**
 * 
 */
package com.eden.ElonBookStore.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.ElonBookStore.model.entity.Genres;
import com.eden.ElonBookStore.model.repository.GenreRepo;

/**
 * @author shima
 *
 */
@Service
@Transactional
public class GenreService {
	
	@Autowired
	private GenreRepo genreRepo;
	
	
	//insert dan update
	//jika id suda terdaftar maka akan di update
	public Genres save(Genres genres) {
		return genreRepo.save(genres);
	}
	
	public Genres findOne(int id) {
		return genreRepo.findById(id).get();
	}
	
	public Iterable<Genres> findAll(){
		return genreRepo.findAll();
	}
	
	public void removeOne(int id) {
		genreRepo.deleteById(id);
	}
	
}
