package se.coderdojostockholm.mentor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.coderdojostockholm.mentor.model.Mentor;
import se.coderdojostockholm.mentor.repository.MentorRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by: Erik Olsson (eolsson@gmail.com)
 * Date: 2014-10-18
 * Time: 16:54
 */
@Service
public class MentorServiceImpl implements MentorService {

    private MentorRepository mentorRepository;

    @Autowired
    public MentorServiceImpl(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    @Override
    public void saveMentor(Mentor mentor) {
        mentorRepository.save(mentor);
    }

    @Override
    public Mentor getMentor(String id) {
        return mentorRepository.findOne(id);
    }

    @Override
    public List<Mentor> getMentors() {
        return StreamSupport.stream(mentorRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
