package cataloguer_books.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BusquedaSimpleDeLibros implements IBuscadorDeLibros{
	
	
	private String etiquetaDeBusqueda;
	private ArrayList<Libro> coleccionBusquedaSimpleDeLibros;
	@Autowired
	@Qualifier("cargarLibrosDesdeBaseDeDatosEstructuradaMySQL")
	private IManejoDeLibros descargaDeLibrosMySQL;
	

	
	public void buscarLibros() {
		this.coleccionBusquedaSimpleDeLibros =  descargaDeLibrosMySQL.cargarLibros();
	}


	public String getEtiquetaDeBusqueda() {
		return etiquetaDeBusqueda;
	}


	public void setEtiquedaDeBusqueda(String etiquetaDeBusqueda) {
		this.etiquetaDeBusqueda = etiquetaDeBusqueda;
	}


	public ArrayList<Libro> getColeccionBusquedaSimpleDeLibros() {
		return coleccionBusquedaSimpleDeLibros;
	}


	public void setColeccionBusquedaSimpleDeLibros(ArrayList<Libro> coleccionBusquedaSimpleDeLibros) {
		this.coleccionBusquedaSimpleDeLibros = coleccionBusquedaSimpleDeLibros;
	}
	
	
}
