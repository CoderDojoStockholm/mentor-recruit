package se.coderdojostockholm.mentor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.coderdojostockholm.mentor.model.Mentor;

/**
 * Created by: Erik Olsson (eolsson@gmail.com)
 * Date: 2014-10-18
 * Time: 16:45
 */
public interface MentorRepository extends MongoRepository<Mentor, String> {
}
