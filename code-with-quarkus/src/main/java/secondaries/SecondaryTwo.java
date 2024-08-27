package secondaries;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Startup
@Unremovable
public class SecondaryTwo extends SecondaryAbstract {

    @Override
    public String getName() {
        return "TWO";
    }

    @Override
    public void init() {
        System.out.println("Postconstract in SecondaryTwo");
    }
}
