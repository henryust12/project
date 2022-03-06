/**
 * 
 */
package com.eden.ElonBookStore.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eden.ElonBookStore.model.entity.TestUser;

/**
 * @author shima
 *
 */
@Repository
public interface TestUserRepository extends JpaRepository<TestUser, String> {

}
