package com.example.vanlife_server;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VansRepository extends MongoRepository<VansModal , ObjectId> {
    List<Optional<VansModal>> findByHostId(String id);
    List<Optional<VansModal>> findByVanId(String id);

}
