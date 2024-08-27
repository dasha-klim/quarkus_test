package secondaries;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Startup
@Unremovable
public class SecondaryThree extends SecondaryAbstract {

    @Override
    protected void init() {
        System.out.println("Postconstract in SecondaryThree");
    }

    @Override
    public String getName() {
        return "THREE";
    }
}
