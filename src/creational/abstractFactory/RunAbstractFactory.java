package creational.abstractFactory;

/**
 *
 * @author janez
 */
public class RunAbstractFactory {

    public static void main(String[] args) throws InterruptedException {
        /**
         * Deploy perspective to a Mobile Application
         */
        GUIFactory mobileFactory = new MobileFactory();

        ApplicationContext applicationContextMobile = new ApplicationContext(mobileFactory);
        applicationContextMobile.deploy();
        

        /**
         * Deploy perspective to a Web Application
         */
        GUIFactory webFactory = new WebFactory();

        ApplicationContext applicationContextWeb = new ApplicationContext(webFactory);
        applicationContextWeb.deploy();

    }
}
