package singleton;

public class Logger {

    private static Logger INSTANCE;

    private Logger() {
    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            synchronized (Logger.class) {
                INSTANCE = new Logger();
            }
        }
        return INSTANCE;
    }
}
