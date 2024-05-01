package singleton;

import java.lang.Object;

public class Client {


    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("" + logger.getName()  + " " + logger2);

        try {
            Logger clone =(Logger) logger.clone();
            System.out.println("Copy: "+ clone.getName());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


}

