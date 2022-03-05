/**
 * 
 */
package eden.training.ElonBookStore.service;

import org.springframework.data.repository.CrudRepository;

import eden.training.ElonBookStore.service.UserService;

/**
 * @author shima
 *
 */
public interface UserRepository extends CrudRepository<UserService, Integer> {

}
