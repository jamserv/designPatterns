package structural.adapter.practice.one;

/**
 *
 * @author janez
 */
class ServerResponseModel {

    private String uid;
    private String status;

    public ServerResponseModel(String uid, String status) {
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
