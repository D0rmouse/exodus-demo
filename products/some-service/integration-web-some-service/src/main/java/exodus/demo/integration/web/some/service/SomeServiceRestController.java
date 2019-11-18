package exodus.demo.integration.web.some.service;

import exodus.demo.core.business.some.service.impl.DefaultSomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SomeServiceRestController {

    private final DefaultSomeService someService;

    @PostMapping("/some/service")
    public void callSomeService() {
        someService.processSomething();
    }
}
