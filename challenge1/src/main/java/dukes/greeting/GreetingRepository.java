package dukes.greeting;

import java.util.List;

import jakarta.enterprise.context.Dependent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Dependent
public class GreetingRepository {
    @PersistenceContext(unitName = "default")
    private EntityManager entityManager;

    public List<Greeting> getAll() {
        return entityManager.createQuery("SELECT g FROM Greeting g", Greeting.class).getResultList();
    }
}
