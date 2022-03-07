/**
 * 
 */
package com.eden.ElonBookStore.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eden.ElonBookStore.model.dto.Buys;

/**
 * @author shima
 *
 */

@Repository
public interface BuyRepository extends JpaRepository<Buys, Integer> {

}
