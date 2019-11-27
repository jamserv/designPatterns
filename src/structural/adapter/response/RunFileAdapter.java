package structural.adapter.response;

/**
 *
 * @author janez
 */
public class RunFileAdapter {

    public static void main(String[] args) {
        ResponseModel model = new ResponseModel("231654897", "success");
        Content content = new XMLResponse(model);
        String r = content.buildContent();
        System.out.println(r);

        Content contentJson = new JsonAdapterResponse(model);
        String r2 = contentJson.buildContent();
        System.out.println(r2);

        Content contentCsv = new CsvAdapterResponse(model);
        String r3 = contentCsv.buildContent();
        System.out.println(r3);
    }
}
