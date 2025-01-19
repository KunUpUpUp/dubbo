import com.seasugar.TestStarter;
import com.seasugar.service.Consumer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TestStarter.class)
public class ConsumerTest {

    @Autowired
    private Consumer consumerTest;

    @Test
    public void contextLoads() {
        consumerTest.test();
    }
}
