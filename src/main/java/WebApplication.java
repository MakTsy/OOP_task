import modules.WebUiController;

public class WebApplication extends BaseApplication {

    private WebUiController webUiController;

    WebApplication() {
        this.webUiController = new WebUiController("First_Web");
    }

    @Override
    public int startApp() {
        this.webUiController.starter();
        return 101;
    }

    @Override
    public void whoAmI() {
        System.out.println("I am webApp");
        System.out.println(this.startApp());
        this.isAlive();
    }
}
