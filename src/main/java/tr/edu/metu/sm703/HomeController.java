package tr.edu.metu.sm703;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.Collections;
import java.util.Map;

@Controller
public class HomeController {
//test-1
    @Get
    public Map<String, Object> index() {
        return Collections.singletonMap("message", "Hello World from qa1");
    }
}
