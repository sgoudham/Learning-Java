package conference.with.autowiring.repository;

import conference.with.autowiring.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
