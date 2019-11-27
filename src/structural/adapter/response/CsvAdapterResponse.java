package structural.adapter.response;

/**
 *
 * @author janez
 */
public class CsvAdapterResponse implements Content {
    
    ResponseModel model;

    public CsvAdapterResponse(ResponseModel model) {
        this.model = model;
    }        

    @Override
    public String buildContent() {        
        return "\"status\"\n" + this.model.getStatus();
    }
    
}