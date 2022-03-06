/**
 * 
 */
package com.eden.ElonBookStore.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eden.ElonBookStore.model.entity.Genres;
import com.eden.ElonBookStore.service.GenreService;

/**
 * @author shima
 *
 */

@RestController
@RequestMapping("/genres")
public class GenreController {
	
	@Autowired
	private GenreService genreService;
	
//	@GetMapping
//	public Genres create(@RequestBody Genres genres) {
//		genres.setGenreName("testgenre");
//		Date d = new Date();
//		genres.setCreated(d);
//		genres.setUpdated(d);
//		
//		return genreService.save(genres);
//	}
//	
//	public Iterable<Genres> findAll(){
//		return genreService.findAll();
//	}

}
