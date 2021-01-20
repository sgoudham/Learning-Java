package conference.with.autowiring.service;

import conference.with.autowiring.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
