package tr.edu.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {
//Hot Fix Test Commit-10
    @Get
    public Map<String, Object> index() {
        return Collections.singletonMap("message", "Hello World from prod");
    }
}
