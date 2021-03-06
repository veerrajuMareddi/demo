package auto.prop;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="auto.prop")
@PropertySource("classpath:inserting.properties")
public class Config 
{

}
