import com.misaka.test.User;
import org.junit.Assert;
import org.junit.Test;

public class TestUser {

    @Test
    public void TestAdd() {
        System.out.println("执行");
        User user = new User();
        int re = user.add(10, 20);
        Assert.assertEquals(30, re);
    }
}
