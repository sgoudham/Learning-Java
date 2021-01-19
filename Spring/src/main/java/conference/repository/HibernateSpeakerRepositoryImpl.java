package conference.repository;

import conference.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        return new ArrayList<>() {{
            add(new Speaker("Goudham", "Suresh"));
        }};
    }
}
