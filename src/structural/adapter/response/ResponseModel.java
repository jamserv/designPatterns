package structural.adapter.response;

/**
 *
 * @author janez
 */
class ResponseModel {

    private String uid;
    private String status;

    public ResponseModel(String uid, String status) {
        this.uid = uid;
        this.status = status;
    }

    public String getUid() {
        return uid;
    }

    public String getStatus() {
        return status;
    }

}
