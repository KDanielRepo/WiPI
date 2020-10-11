package Spring;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SpringRest {
    private final SpringService springService;

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
