package cataloguer_books.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("cataloguer_books.model")
@PropertySource("classpath:mysql.prop")
public class CataloguerConfig {
	
	
}
