package main_package;

import io.quarkus.arc.Unremovable;
import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
@Startup
@Unremovable
public class MainService {

    public List<String> getList() {
        return List.of("a", "b", "c", "d", "b", "b", "h", "a");
    }
}
