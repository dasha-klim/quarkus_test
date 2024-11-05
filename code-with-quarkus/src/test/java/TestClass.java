import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import main_package.MainService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@QuarkusTest
public class TestClass {

    @Inject
    MainService mainService;

    private static Map<String, Long> map = new HashMap<>();


    @BeforeAll
    public void beforeAllTests() {
        List<String> list = mainService.getList();
        map = list.stream().collect(Collectors.groupingBy(k -> k,Collectors.counting()));
        System.out.println("Map in @BeforeAll" + map);

    }

    @ParameterizedTest
    @MethodSource("getData")
    public void test(String key) {
        System.out.println("Key " + key);
    }

    public Set<String> getData() {
        System.out.println("Map in getData " + map);
        return map.keySet();
    }
}
