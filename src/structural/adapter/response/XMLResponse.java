package structural.adapter.response;

/**
 *
 * @author janez
 */
public class XMLResponse implements Content {

    ResponseModel model;

    public XMLResponse(ResponseModel model) {
        this.model = model;
    }

    @Override
    public String buildContent() {
        return "<status>" + this.model.getStatus() + "</status>";
    }

}
