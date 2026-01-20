package net.harshdev.journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableTransactionManagement
public class JournalApplication {


	public static void main(String[] args) {

		SpringApplication.run(JournalApplication.class, args);
	}

	@Bean
	public PlatformTransactionManager falana(MongoDatabaseFactory dbFactory){
		return new MongoTransactionManager(dbFactory);
	}

}
