package main_package;

import io.quarkus.runtime.Startup;
import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.vertx.ext.web.RoutingContext;
import jakarta.inject.Inject;
import secondaries.Secondary;

import java.util.Map;

@RouteBase(path = "/v1")
@Startup
public class MainController {

    @Inject
    MainService mainService;

    @Route(path = "test", methods = Route.HttpMethod.GET)
    public void getSecondaries(RoutingContext context) {
        Map<String, Secondary> secondariesMap = mainService.getSecondariesMap();
        secondariesMap.forEach((name, service) -> {
            System.out.println("Name " + name + "; service " + service.getDescription());
        });

    }
}
