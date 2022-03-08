/**
 * 
 */
package com.eden.ElonBookStore.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eden.ElonBookStore.model.dto.Users;

/**
 * @author shima
 *
 */

@Repository
public interface UserRepository extends JpaRepository<Users, String> {
//reset password Query
//UPDATE ElonBookStore.tbl_users t SET t.password = '12345' WHERE t.user_id LIKE 'u222' ESCAPE '#'

}
