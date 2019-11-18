package exodus.demo.commons.core.something;


import static org.assertj.core.api.Assertions.assertThat;

import exodus.demo.commons.core.something.SomeCommonUtil;
import org.junit.Test;

public class SomeCommonUtilTest {

    @Test
    public void test() {
        assertThat(SomeCommonUtil.fabricateSomeString()).isEqualTo("some string");
    }
}