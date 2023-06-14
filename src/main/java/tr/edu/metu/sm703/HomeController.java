package tr.edu.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {
//Hot Fix Test Commit-4

    @Get
    public Map<String, Object> index() {

        String username = "user";
        String password = "123456";

        // Simulating a potential security vulnerability
        if (username.equals("admin") && password.equals("123456")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        return Collections.singletonMap("message", "Hello World from prod");
    }
}
