package dubbo.provider.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
@ImportResource("classpath*:dubbo-provider.xml")
@PropertySource("classpath:dubbo.properties")
public class DubboConf {

}
