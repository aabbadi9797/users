package com.users.test.repository;

import com.users.test.model.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * User Repository (extends MongoRepository)
 */
@Repository
public interface UserRepository extends MongoRepository<User,String> {
/**
 * @param username
 * @return boolean, checks if user username already exists
 */
    boolean existsByUsername(String username);
}
