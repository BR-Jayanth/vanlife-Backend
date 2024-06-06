package com.example.vanlife_server;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserModal , ObjectId> {
    Optional<UserModal> findByEmail(String email);
    Optional<UserModal> findByPassword(String email);
}
