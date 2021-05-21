public abstract class BaseApplication {
    public abstract int startApp();

    public void isAlive() {
        System.out.println("I am alive");
    }

    public abstract void whoAmI();
}
