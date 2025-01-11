import com.seasugar.GoodStarter;
import com.seasugar.api.service.GoodService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GoodStarter.class)
public class SpeedTest {

    @Autowired
    private GoodService goodService;

    // 300-500ms
    @Test
    public void testJdbc() {
        long start = System.currentTimeMillis();
        goodService.getGoodById(1L);
        System.out.println(System.currentTimeMillis() - start);
    }
}
