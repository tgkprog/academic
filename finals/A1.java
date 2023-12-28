public class A1 {
    public final String s;

    A1() {
        int a = (new java.util.Random()).nextInt();
        s = a + "SD";
        init();
    }

    A1(String s) {
        this.s = s;
    }

    void init() {
        int a = 1;//java.util.Random.nextInt();
        //s = a + "SD";
    }
}