package exodus.demo.commons.core.something;

import exodus.demo.commons.core.something.SomeCommonBusinessUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeCommonBusinessUtilTest {

    @Test
    public void test() {
        SomeCommonBusinessUtil.doSomethingUtilly();
    }

}