/**
 * 
 */
package com.eden.ElonBookStore.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.eden.ElonBookStore.model.entity.Genres;

/**
 * @author shima
 *
 */
public interface GenreRepo extends CrudRepository<Genres, Integer> {

}
