package structural.adapter.practice.one;

import java.util.UUID;

/**
 *
 * @author janez
 */
public class ClientAdapter {

    public static void main(String[] args) {
        ServerResponseModel serverResponse = new ServerResponseModel(UUID.randomUUID().toString().toUpperCase(), "OK");        

        XMLServiceResponse serviceResponse = new XMLServiceResponse();
        String xmlReponse = serviceResponse.buildResponse(serverResponse);
        System.out.println(xmlReponse);

        ServiceResponseAdaptable responseAdaptable = new ServiceResponseJsonAdapter();

        String jsonResponse = responseAdaptable.buildResponse(serverResponse);
        System.out.println(jsonResponse);
    }
}
