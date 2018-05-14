public class Singleton {
    private static Singleton instance;

    private Singleton() {};

    public static synchronized Singleton getInstance() {
        if(Singleton.instance == null)
            Singleton.instance = new Singleton();

        return Singleton.instance;
    }
}