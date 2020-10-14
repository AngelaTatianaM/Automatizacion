package pasosScript;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberPasosFiltro.barraFiltroPasos;
import net.thucydides.core.annotations.Steps;



public class MetodosBarraFiltro {
	
	@Steps
	barraFiltroPasos barraFiltrosPasos; 
	
	@Given("^Se ingreso la palabra clave \"([^\"]*)\" en el primer campo y en el segundo campo \"([^\"]*)\"$")
	public void se_ingreso_la_palabra_clave_en_el_primer_campo_y_en_el_segundo_campo(String palabraClave, String localidad) {

		barraFiltrosPasos.barra_filtros(palabraClave, localidad);
	}

	@Given("^Se hace clic en el boton de buscar ofertas$")
	public void se_hace_clic_en_el_boton_de_buscar_ofertas() {

	}

	@When("^La barra de busqueda realiza el filtro$")
	public void la_barra_de_busqueda_realiza_el_filtro(){

	    
	}

	@Then("^Se presentan las ofertas laborales de Analistas para la ciudad de Bogota$")
	public void se_presentan_las_ofertas_laborales_de_Analistas_para_la_ciudad_de_Bogota() {

	}



}
