package cataloguer_books.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoCatalogo {
	
	public static void main(String[] args) {
		
		//contexto a traves de un xml
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextJA.xml");
		//contexto a traves de una clase
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(CataloguerConfig.class); 
		CatalogoDeLibros cdl_1 = contexto.getBean("catalogoDeLibros", CatalogoDeLibros.class); 
		
		cdl_1.buscarLibros();
	
		contexto.close();
	}
}
