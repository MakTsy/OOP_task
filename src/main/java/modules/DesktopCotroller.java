package modules;

public class DesktopCotroller extends BaseDriver {

    public DesktopCotroller(String name) {
        super.name = name;
    }

    @Override
    public int configModule() {
        return 200;
    }
}
