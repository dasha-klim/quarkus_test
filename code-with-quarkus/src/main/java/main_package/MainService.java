package main_package;

import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import secondaries.Secondary;

import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
@Startup
public class MainService {

    private final Map<String, Secondary> secondariesMap = new HashMap<>();

    @PostConstruct
    public void init() {
        System.out.println("Postconstract MainService");
    }

    public void putSecondaryToMap(String name, Secondary secondary) {
        secondariesMap.put(name, secondary);
    }

    public Map<String, Secondary> getSecondariesMap() {
        return secondariesMap;
    }
}
