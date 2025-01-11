import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpeedTest {

    @Test
    public void test() {
        long start = System.currentTimeMillis();
        getUser("zkp");
        System.out.println(System.currentTimeMillis() - start);
    }


    public String getUser(String name) {
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        return "Hello " + name;
    }
}
