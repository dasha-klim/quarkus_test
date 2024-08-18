package secondaries;

import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Startup
public class SecondaryTwo extends SecondaryAbstract {

    @Override
    protected String getName() {
        return "TWO";
    }

    @PostConstruct
    public void init() {
        System.out.println("Postconstract in SecondaryTwo");
    }
}
