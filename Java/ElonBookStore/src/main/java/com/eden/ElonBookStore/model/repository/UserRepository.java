/**
 * 
 */
package com.eden.ElonBookStore.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
//	@Query(nativeQuery = true,
//	           value = "select * from tbl_users where user_id='?1' "+
//	        		   "and password='?2' and user_level='?3';")
//	Users loadUserLogin(String userId, String password, char userLevel); 
	
	//@Query(nativeQuery = true, value = "select * from tbl_users;")
//	Users loadUserLogin(@Param("uid") String userId,@Param("psw") String password,@Param("ul") char userLevel);
	//Users loadUserLogin();
	@Query(nativeQuery = true, value = "select * from tbl_users;")
	public List<Users> loadUserLogin();
}
