package secondaries;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import main_package.MainService;

@ApplicationScoped
@Startup
@Unremovable
public class SecondaryOne extends SecondaryAbstract {

    @Override
    public String getName() {
        return "ONE";
    }

    @Override
    public void init() {
        System.out.println("Postconstract in SecondaryOne");
    }
}
