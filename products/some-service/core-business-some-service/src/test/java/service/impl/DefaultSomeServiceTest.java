package service.impl;

import static org.mockito.Mockito.when;

import exodus.demo.commons.core.something.SomeCommonBusinessUtil;
import exodus.demo.core.business.some.service.impl.DefaultSomeService;
import exodus.demo.core.repositories.some.repo.SomeRepository;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.stereotype.Service;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSomeServiceTest {

    @InjectMocks
    private DefaultSomeService service;
    @Mock
    private SomeRepository someRepository;

    @Test
    public void processSomething() {
        when(someRepository.doSomething()).thenReturn("something something");
        service.processSomething();
    }
}
