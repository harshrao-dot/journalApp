package net.harshdev.journalApp.repository;

import net.harshdev.journalApp.entity.JournalEntry;
import net.harshdev.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);

    void deleteByUserName(String username);
}
