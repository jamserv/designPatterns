package structural.adapter.response;

/**
 *
 * @author janez
 */
public class JsonAdapterResponse implements Content {
    
    ResponseModel model;

    public JsonAdapterResponse(ResponseModel model) {
        this.model = model;
    }        

    @Override
    public String buildContent() {        
        return "{\"status\":\"" + this.model.getStatus() + "\"}";
    }
    
}
