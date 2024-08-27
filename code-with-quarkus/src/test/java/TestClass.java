import io.quarkus.arc.All;
import io.quarkus.test.component.QuarkusComponentTest;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import main_package.MainService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import secondaries.Secondary;
import secondaries.SecondaryOne;
import secondaries.SecondaryThree;
import secondaries.SecondaryTwo;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@QuarkusComponentTest({SecondaryTwo.class, SecondaryOne.class, SecondaryThree.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClass {

    @Inject
    MainService mainService;

    @Inject
    @All
    List<Secondary> secondaries;

    Map<String, Secondary> secondaryMap;

//    Instance<Secondary> secondaryInstance;

    @BeforeAll
    public void beforeAllTests() {
        System.out.println("Before all tests ");
        System.out.println("secondaries map " + mainService.getSecondariesMap());

        secondaryMap = secondaries.stream().collect(Collectors.toMap(Secondary::getName, Function.identity()));

        System.out.println("secondaries map " + mainService.getSecondariesMap());


    }

    @Test
    public void test() {
        System.out.println("in test");
    }
}
