package structural.adapter.practice.one;

import java.util.UUID;

/**
 *
 * @author janez
 */
public class ClientAdapter {

    public static void main(String[] args) {
        ServerResponse serverResponse = new ServerResponse(UUID.randomUUID().toString().toUpperCase(), "OK");        

        ServiceResponse serviceResponse = new ServiceResponse();
        String xmlReponse = serviceResponse.buildResponse(serverResponse);
        System.out.println(xmlReponse);

        ServiceResponseAdaptable responseAdaptable = new ServiceResponseJsonAdapter();

        String jsonResponse = responseAdaptable.buildResponse(serverResponse);
        System.out.println(jsonResponse);
    }
}
