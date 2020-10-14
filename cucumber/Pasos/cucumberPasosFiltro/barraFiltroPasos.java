package cucumberPasosFiltro;

import cucumberObjetos.PaginaEmpleoChoucair;
import net.thucydides.core.annotations.Step;

public class barraFiltroPasos {
	
	PaginaEmpleoChoucair paginaEmpleoChoucair; 
	
	@Step
	public void barra_filtros(String palabraClave, String localidad) {
		paginaEmpleoChoucair.open();
		paginaEmpleoChoucair.ingresarDatos(palabraClave, localidad); 
		paginaEmpleoChoucair.verificarEmpleos();
		
	}

}
