package watt.learning.Hello;

import org.springframework.data.repository.CrudRepository;

import watt.learning.Hello.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}