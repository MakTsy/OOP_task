package modules;

public class WebUiController extends BaseDriver {

    public WebUiController(String name) {
        super.name = name;
    }

    @Override
    public int configModule() {
        return 201;
    }
}
