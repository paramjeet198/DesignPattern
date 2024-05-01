package singleton;

// Ensures that a class has only one instance that has global access.
public class Logger implements Cloneable {

    private static Logger INSTANCE;
   private String name = "Param";

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

    public String getName(){
        return  name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
