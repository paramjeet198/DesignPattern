public class StaticFinalDemo {

    final static String PI;
    final String greet;

    static {
        PI = "";
    }

    {
        greet = "";
    }

    StaticFinalDemo() {
    }

    public static void main(String[] args) {

    }

    String sayGreet() {
        return "Good morning";
    }
}
