package structural.adapter.practice.one;

/**
 *
 * @author janez
 */
public class ServiceResponseJsonAdapter implements ServiceResponseAdaptable {

     @Override
    public String buildResponse(ServerResponseModel serverResponse) {
        return "{\"uid\": \"" + serverResponse.getUid() + "\",\"status\":\"" + serverResponse.getStatus() + "\"}";
    }
}
