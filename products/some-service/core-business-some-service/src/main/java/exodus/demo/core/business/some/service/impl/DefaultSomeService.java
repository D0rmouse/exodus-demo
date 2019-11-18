package exodus.demo.core.business.some.service.impl;

import exodus.demo.commons.core.something.SomeCommonBusinessUtil;
import exodus.demo.core.business.some.service.api.SomeService;
import exodus.demo.core.repositories.some.repo.SomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultSomeService implements SomeService {

    private final SomeRepository someRepository;

    public void processSomething() {
        SomeCommonBusinessUtil.doSomethingUtilly();
        if (someRepository.doSomething().isEmpty()) {
            throw new IllegalStateException("something is wrong here...");
        }
    }
}
