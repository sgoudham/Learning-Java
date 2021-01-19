package conference.service;

import conference.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
