package se.coderdojostockholm.mentor.service;

import se.coderdojostockholm.mentor.model.Mentor;

import java.util.List;

/**
 * Created by: Erik Olsson (eolsson@gmail.com)
 * Date: 2014-10-18
 * Time: 16:53
 */
public interface MentorService {

    void saveMentor(Mentor mentor);

    Mentor getMentor(String id);

    List<Mentor> getMentors();

}
