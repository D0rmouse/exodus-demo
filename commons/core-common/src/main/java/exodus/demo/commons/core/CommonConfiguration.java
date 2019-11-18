package exodus.demo.commons.core;


import exodus.demo.commons.core.something.SomeCommonUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {


    @Bean
    public Object someBean() {
        return SomeCommonUtil.fabricateSomeString();
    }
}
