package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.api.FicoExtendedScoreApi;
import io.apihub.client.model.Domicilio;
import io.apihub.client.model.Persona;
import io.apihub.client.model.Response;
import io.apihub.client.model.Domicilio.EstadoEnum;
import io.apihub.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;


public class FicoExtendedScoreApiTest {

    private final FicoExtendedScoreApi api = new FicoExtendedScoreApi();
    private ApiClient apiClient;
    
    @Before()
    public void setUp() {
    	this.apiClient = api.getApiClient();
    	OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
    			.readTimeout(120, TimeUnit.SECONDS)
    			.addInterceptor(new SignerInterceptor())
    			.build();
    	apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void ficoExtendedScoreTest() {
    	String xApiKey = "your_api_key";
        String username = "your_username";
        String password = "your_password";
        Persona body = new Persona();
        body.setPrimerNombre("XXXXXXXX");
        body.segundoNombre(null);
        body.setApellidoPaterno("XXXXXXXX");
        body.setApellidoMaterno("XXXXXXXX");
        body.setFechaNacimiento("YYYY-MM-DD");
        body.setRfc("XXXXXXXX");
        Domicilio dom = new Domicilio();
        dom.setDireccion("XXXXXXXX");
        dom.setColonia("XXXXXXXX");
        dom.setCiudad("XXXXXXXX");
        dom.codigoPostal("XXXXX");
        dom.setMunicipio("XXXXXXXX");
        dom.setEstado(EstadoEnum.DF);
        body.setDomicilio(dom);
        
        Response response;
		try {
			response = api.ficoextended(xApiKey, username, password, body);
			System.out.println(response.toString());
		} catch (ApiException e) {
			e.printStackTrace();
			System.out.println(e.getResponseBody());
		}
    }
}