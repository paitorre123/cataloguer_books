package cataloguer_books.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BusquedaDeLibrosSimple<T> implements IBuscadorDeLibros<T>{
	
	private String etiquedaDeBusqueda;
	
	
	public T buscarLibros() {
		// TODO Auto-generated method stub
		return (T) ("Busqueda de libro por coicidencia: "+ this.etiquedaDeBusqueda);
	}


	public String getEtiquedaDeBusqueda() {
		return etiquedaDeBusqueda;
	}


	public void setEtiquedaDeBusqueda(String etiquedaDeBusqueda) {
		this.etiquedaDeBusqueda = etiquedaDeBusqueda;
	}
	
}
