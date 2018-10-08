package structural.adapter.practice.one;

/**
 *
 * @author janez
 */
public class ServiceResponse implements ServiceResponseAdaptable {

    /**
     *
     * @param serverResponse
     * @return
     */
    @Override
    public String buildResponse(ServerResponse serverResponse) {
        return "<uid>" + serverResponse.getUid() + "</uid><status>" + serverResponse.getStatus() + "</status>";
    }
}
