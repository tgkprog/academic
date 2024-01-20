import str2.Mirror;

public class TestTemplate {

    //target function
    public int add(int i, int j) {

        return i + j;
    }

    //test helpers, in same class for speed, in production code would be seperate

    int errs = 0, count = 0;

    public static void main(String[] a) {
        new TestTemplate().testCases();
    }


    void testCases() {

        testHelper(1, 2, 3);
        //TODO more test cases
        System.out.println("count :" + count + "; errs " + errs + ", at " + new java.util.Date());
    }

    void testHelper(int i, int j, int expected) {
        count++;
        try {
            int actual = add(i, j);
            //if (!expected.equals(actual))
            if (expected != actual) {
                errs++;
                System.out.println("Mismatch add:[" + i + "], j [" + j + "]. Expected [" + expected + "]; actual [" + actual + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
            errs++;
        }
    }
}

