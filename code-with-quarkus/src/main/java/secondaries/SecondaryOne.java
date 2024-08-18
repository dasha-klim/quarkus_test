package secondaries;

import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Startup
public class SecondaryOne extends SecondaryAbstract {

    @Override
    protected String getName() {
        return "ONE";
    }

    @PostConstruct
    public void init() {
        System.out.println("Postconstract in SecondaryOne");
    }
}
