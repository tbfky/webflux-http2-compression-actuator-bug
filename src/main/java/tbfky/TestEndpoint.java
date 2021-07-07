package tbfky;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
@WebEndpoint(id = "test")
public class TestEndpoint {

    @ReadOperation(produces = {MediaType.ALL_VALUE})
    public String test() {
        return "test";
    }

}