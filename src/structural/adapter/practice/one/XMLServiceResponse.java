package structural.adapter.practice.one;

/**
 *
 * @author janez
 */
public class XMLServiceResponse implements ServiceResponseAdaptable {

    /**
     *
     * @param serverResponse
     * @return
     */
    @Override
    public String buildResponse(ServerResponseModel serverResponse) {
        return "<uid>" + serverResponse.getUid() + "</uid><status>" + serverResponse.getStatus() + "</status>";
    }
}
