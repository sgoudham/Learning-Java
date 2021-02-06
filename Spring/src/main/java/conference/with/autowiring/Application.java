package conference.with.autowiring;

import conference.with.autowiring.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);

        showObjectAddress(applicationContext.getBean("speakerService", SpeakerService.class));
        System.out.println(service.findAll().get(0).getForename());
        showObjectAddress(applicationContext.getBean("speakerService", SpeakerService.class));
    }

    private static void showObjectAddress(SpeakerService speakerService) {
        System.out.println(speakerService);
    }
}
