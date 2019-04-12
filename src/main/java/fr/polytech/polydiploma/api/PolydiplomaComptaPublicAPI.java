package fr.polytech.polydiploma.api;

import fr.polytech.polydiploma.stubs.PayWebService;
import fr.polytech.polydiploma.stubs.PayWebServiceImplService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class PolydiplomaComptaPublicAPI {

    public PayWebService compta;

    public PolydiplomaComptaPublicAPI(String host, String port) {
        initCompta(host, port);
    }

    private void initCompta(String host, String port) {
        URL wsdlLocation = PolydiplomaComptaPublicAPI.class.getResource("/PayWS.wsdl");
        PayWebServiceImplService factory = new PayWebServiceImplService(wsdlLocation);
        this.compta = factory.getPayWebServiceImplPort();
        String address = "http://" + host + ":" + port + "/polydiploma-backend/webservices/PayWS";
        ((BindingProvider) compta).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
    }

}
