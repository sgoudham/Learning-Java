package conference.with.autowiring.repository;

import conference.with.autowiring.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        return new ArrayList<>() {{
            add(new Speaker("Goudham", "Suresh"));
        }};
    }
}
