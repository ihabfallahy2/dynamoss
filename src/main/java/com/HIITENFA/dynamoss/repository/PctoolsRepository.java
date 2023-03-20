package com.HIITENFA.dynamoss.repository;

import com.HIITENFA.dynamoss.model.Pctools;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PctoolsRepository extends MongoRepository<Pctools, String>{

}
