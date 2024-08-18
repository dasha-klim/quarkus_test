import io.quarkus.arc.All;
import io.quarkus.test.component.QuarkusComponentTest;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import main_package.MainService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import secondaries.Secondary;

import java.util.List;

@QuarkusComponentTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClass {

    @Inject
    MainService mainService;

    @Inject
    @All
    List<Secondary> secondaries;

//    Instance<Secondary> secondaryInstance;

    @BeforeAll
    public void beforeAllTests() {
        System.out.println("Before all tests");
        System.out.println("secondaries size " + secondaries.size());

    }

    @Test
    public void test() {
        System.out.println("in test");
    }
}
