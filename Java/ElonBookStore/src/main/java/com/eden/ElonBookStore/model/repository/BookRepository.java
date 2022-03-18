package com.eden.ElonBookStore.model.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eden.ElonBookStore.model.dto.Books;


@Repository
public interface BookRepository extends JpaRepository<Books, String> {
	
	@Query(
			  value = "SELECT * from tbl_books tb where tb.title LIKE %:title", 
			  nativeQuery = true)
				List<Books> findByTitle(@Param("title") String title);
	
}
