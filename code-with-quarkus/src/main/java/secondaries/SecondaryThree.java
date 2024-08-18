package secondaries;

import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Startup
public class SecondaryThree extends SecondaryAbstract {

    @Override
    protected void init() {
        System.out.println("Postconstract in SecondaryThree");
    }

    @Override
    protected String getName() {
        return "THREE";
    }
}
