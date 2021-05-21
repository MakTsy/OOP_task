
public class LinuxApp extends DesktopApplication {

    private String osVersion;

    public LinuxApp(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public void whoAmI() {
        System.out.println("osVersion Linux: " + this.osVersion);
        System.out.println(this.startApp());
        this.isAlive();
    }
}
