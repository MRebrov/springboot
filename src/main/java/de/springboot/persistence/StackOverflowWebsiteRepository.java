package de.springboot.persistence;

import de.springboot.model.StackOverflowWebsite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StackOverflowWebsiteRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<StackOverflowWebsite> findAll() {
        return mongoTemplate.findAll(StackOverflowWebsite.class);
    }
}
