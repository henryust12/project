/**
 * 
 */
package com.eden.ElonBookStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eden.ElonBookStore.model.dto.Buys;
import com.eden.ElonBookStore.model.repository.BuyRepository;

/**
 * @author shima
 *
 */

@Service
@Transactional
public class BuyService {
	@Autowired
	private BuyRepository buyRepository;

	//CRUD
	//Select *
	public List<Buys> loadAllBuys(){
		return (List<Buys>) buyRepository.findAll();
	}
	//select where
	public Buys loadBuyById(int id) {
		return buyRepository.findById(id).get();
	}
	// insert into
	public Buys saveBuy(Buys buy) {
		buyRepository.save(buy);
		return loadBuyById(buy.getId());
	}
	// delete
	public void deleteBuy(int id) {
		buyRepository.deleteById(id);
	}
	// update
	public Buys updateBook(Buys buy) {
		return buyRepository.save(buy);
	}
}
