package exodus.demo.core.delivery.some.service;

import exodus.demo.core.business.some.service.SomeServiceCoreConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SomeServiceCoreConfiguration.class)
public class SomeServiceApplication {

}
