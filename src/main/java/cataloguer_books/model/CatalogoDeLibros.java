package cataloguer_books.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatalogoDeLibros {
	
	private ArrayList<Libro> libros;
	@Autowired
	private IBuscadorDeLibros<ArrayList<Libro>> bucadorDeLibros;
	
	public void buscarLibros() {
		this.buscarLibros();
	}
}
