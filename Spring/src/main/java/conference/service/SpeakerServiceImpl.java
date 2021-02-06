package conference.service;

import conference.model.Speaker;
import conference.repository.SpeakerRepository;

import javax.annotation.PostConstruct;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @PostConstruct
    private void initialise() {
        System.out.println("Initialisation After Constructors");
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
