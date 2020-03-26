package io.FicoEXTScored.client.api;

import io.FicoEXTScored.client.ApiClient;
import io.FicoEXTScored.client.ApiException;
import io.FicoEXTScored.client.model.CatalogoEstados;
import io.FicoEXTScored.client.model.Domicilio;
import io.FicoEXTScored.client.model.Persona;
import io.FicoEXTScored.client.model.Peticion;
import io.FicoEXTScored.client.model.Respuesta;
import io.FicoEXTScored.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class ApiTest {
    
	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
	private final FicoExtendedScoreApi api = new FicoExtendedScoreApi();
	private ApiClient apiClient = null;

	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("the_url");
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
			    .readTimeout(30, TimeUnit.SECONDS)
			    .addInterceptor(new SignerInterceptor())
			    .build();
		apiClient.setHttpClient(okHttpClient);
	}
	
    @Test
    public void getReporteTest() throws ApiException {
    	
		String xApiKey = "your_api_key";
		String username = "your_username";
		String password = "your_password";
        
        Peticion peticion = null;
        Persona persona = null;
        Domicilio domicilio = null;
        
        try {
        	
        	peticion = new Peticion();
        	persona = new Persona();
        	domicilio = new Domicilio();
        	
        	peticion.setFolio("1235");
        	
			persona.setApellidoPaterno("PATERNO");
			persona.setApellidoMaterno("MATERNO");
			persona.setApellidoAdicional(null);
			persona.setNombres("NOMBRES");
			persona.setFechaNacimiento("YYYY-MM-DD");
			persona.setRFC("PAMN800825569");
			persona.setCURP(null);
			persona.setNacionalidad("MX");
			persona.setResidencia(null);
			persona.setEstadoCivil(null);
			persona.setSexo(null);
			persona.setNumeroDependientes(null);
			persona.setFechaDefuncion(null);
    		
			domicilio.setDireccion("INSURGENTES SUR 1001");
			domicilio.setColoniaPoblacion("INSURGENTES SUR");
			domicilio.setDelegacionMunicipio("IZTAPALAPA");
			domicilio.setCiudad("CIUDAD DE MEXICO");
			domicilio.setEstado(CatalogoEstados.DF);
			domicilio.setCP("11230");
			domicilio.setFechaResidencia(null);
			domicilio.setNumeroTelefono(null);
			domicilio.setTipoDomicilio(null);
			domicilio.setTipoAsentamiento(null);
			domicilio.setFechaRegistroDomicilio(null);
			domicilio.setTipoAltaDomicilio(null);
			domicilio.setIdDomicilio(null);
        	
			persona.setDomicilio(domicilio);
			peticion.setPersona(persona);
			
			Respuesta response = api.getReporte(xApiKey, username, password, peticion);

			Assert.assertTrue(response.getFolioConsulta() != null);
			logger.info(response.toString());

		} catch (ApiException e) {
			logger.error(e.getResponseBody());
		}
        
    }
    
}