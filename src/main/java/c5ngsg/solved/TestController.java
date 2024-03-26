package c5ngsg.solved;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/CI")
    public String ci() {
        return "CI Test";
    }
}
