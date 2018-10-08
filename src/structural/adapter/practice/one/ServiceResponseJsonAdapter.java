package structural.adapter.practice.one;

/**
 *
 * @author janez
 */
public class ServiceResponseJsonAdapter implements ServiceResponseAdaptable {

     @Override
    public String buildResponse(ServerResponse serverResponse) {
        return "{\"uid\": \"" + serverResponse.getUid() + "\",\"status\":\"" + serverResponse.getStatus() + "\"}";
    }
}
