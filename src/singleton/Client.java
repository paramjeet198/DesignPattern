package singleton;

public class Client {


    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("" + logger  + " " + logger2);
    }
}
