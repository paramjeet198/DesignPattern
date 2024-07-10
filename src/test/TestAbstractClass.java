package test;

public abstract class TestAbstractClass {

    int var = 10;
    final int var2 = 20;
    static int var3 = 10;

    protected abstract void test();

   static void normalMethod() {
        int b = TestInterface.myVar;
    }

}
