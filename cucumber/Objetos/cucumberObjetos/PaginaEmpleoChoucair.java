package cucumberObjetos;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsString; 

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.choucairtesting.com/empleos-testing/")
public class PaginaEmpleoChoucair extends PageObject  {
	
	//Titulo de la pantalla principal 
	@FindBy(xpath="//*[@id=\'content\']/div/div/div/div/div/section[3]/div/div/div/div/div/div[2]/div/h2")
	public WebElementFacade lblEmpleos; 
	
	//campo palabra clave 
	@FindBy(xpath="//*[@id=\'search_keywords\']")
	public WebElementFacade txtPalabraClave; 
	
	//campo localidad 
	@FindBy(xpath="//*[@id=\'search_location\']")
	public WebElementFacade txtLocalidad; 
	
	//Boton busquedaEmpleos
	@FindBy(xpath="//*[@id=\'content\']/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input")
	public WebElementFacade btnBusquedaEmpleos; 
	
	
	public void ingresarDatos(String palabraClave, String localidad) {
		txtPalabraClave.sendKeys(palabraClave);
		txtLocalidad.sendKeys(localidad);
		btnBusquedaEmpleos.click();
	}
	
	public void verificarEmpleos() {
		String labelVerificacion = "SER CHOUCAIR";
		String stringMensaje = lblEmpleos.getText(); 
		assertThat(stringMensaje, containsString(labelVerificacion));
							
	}


}
