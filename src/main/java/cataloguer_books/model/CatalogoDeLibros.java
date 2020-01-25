package cataloguer_books.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatalogoDeLibros {
	
	private ArrayList<Libro> librosDeCatalogo;
	@Autowired
	private IBuscadorDeLibros bucadorDeLibros;
	
	public void buscarLibros() {
		this.bucadorDeLibros.buscarLibros();
		System.out.println("Libros del catalogo: "+ this.librosDeCatalogo);
	}
}
