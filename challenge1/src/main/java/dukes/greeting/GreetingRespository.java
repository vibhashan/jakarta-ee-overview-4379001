package dukes.greeting;

// Give the repository an appropriate CDI scope. Hint: You can also use the pseudo-scope @Dependent
public class GreetingRespository {

    // define an EntityManager
    // Hint: Use the @PersistenceContext qualifier
    // Hint: Check the persistence.xml file for the unitName

    // Create a method that retrieves all greetings from the database. Return type should be List<Greeting>

    // Hint: Check out the Criteria Language for building queries
    // CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
    // cq.select(cq.from(Greeting.class));
    // return em.createQuery(cq).getResultList();
}