package dukes.greeting;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless(name = "greetingService", description = "A stateless session bean for greeting operations")
public class GreetingService {
    @Inject
    private GreetingRepository greetingRepository;

    public String getMessage() {
        return !greetingRepository.getAll().isEmpty() ? greetingRepository.getAll().get(0).getMessage()
                : "Hello, World!";
    }
}
