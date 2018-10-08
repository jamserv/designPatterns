package structural.adapter.practice.one;

/**
 *
 * @author janez
 */
class ServerResponse {

    private String uid;
    private String status;

    public ServerResponse(String uid, String status) {
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
