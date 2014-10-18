package se.coderdojostockholm.mentor.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by: Erik Olsson (eolsson@gmail.com)
 * Date: 2014-10-18
 * Time: 15:53
 */
@Configuration
@ComponentScan("se.coderdojostockholm.mentor")
@EnableMongoRepositories("se.coderdojostockholm.mentor.repository")
@EnableAutoConfiguration
public class MentorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MentorApplication.class, args);
    }

}
