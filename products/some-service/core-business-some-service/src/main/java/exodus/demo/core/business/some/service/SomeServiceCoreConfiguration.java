package exodus.demo.core.business.some.service;

import exodus.demo.commons.core.CommonConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(CommonConfiguration.class)
public class SomeServiceCoreConfiguration {

}
