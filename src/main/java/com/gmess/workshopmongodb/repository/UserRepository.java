package com.gmess.workshopmongodb.repository;

import com.gmess.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
