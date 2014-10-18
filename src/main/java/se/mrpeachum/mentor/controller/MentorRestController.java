package se.mrpeachum.mentor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import se.mrpeachum.mentor.model.Mentor;
import se.mrpeachum.mentor.service.MentorService;

import javax.validation.Valid;
import java.util.Collection;

/**
 * Created by: Erik Olsson (eolsson@gmail.com)
 * Date: 2014-10-18
 * Time: 16:51
 */
@RestController
@RequestMapping(value = "/api", produces = "application/json; utf-8")
public class MentorRestController {

    private MentorService mentorService;

    @Autowired
    public MentorRestController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @RequestMapping(value = "/mentors", method = RequestMethod.GET)
    public Collection<Mentor> getMentors() {
        return mentorService.getMentors();
    }

    @RequestMapping(value = "/mentors/{mentorId}", method = RequestMethod.GET)
    public Mentor getMentor(@PathVariable String mentorId) {
        return mentorService.getMentor(mentorId);
    }

    @RequestMapping(value = "/mentors", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createMentor(@Valid @RequestBody Mentor mentor) {
        mentorService.saveMentor(mentor);
    }

}
