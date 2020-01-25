package cataloguer_books.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CargarLibrosDesdeBaseDeDatosEstructuradaMySQL  implements IManejoDeLibros{
	
	@Value("${nombreBaseDeDatos}")
	private String nombreBaseDeDatos;
	@Value("${claveBaseDatos}")
	private String claveBaseDatos;

	public ArrayList<Libro> cargarLibros() {
		// TODO Auto-generated method stub
		System.out.println("Cargando libros desde una base de datos estructurada MySQL");
		return null;
	}

	public String getNombreBaseDeDatos() {
		return nombreBaseDeDatos;
	}

	public void setNombreBaseDeDatos(String nombreBaseDeDatos) {
		this.nombreBaseDeDatos = nombreBaseDeDatos;
	}

	public String getClaveBaseDatos() {
		return claveBaseDatos;
	}

	public void setClaveBaseDatos(String claveBaseDatos) {
		this.claveBaseDatos = claveBaseDatos;
	}
	
	

}
