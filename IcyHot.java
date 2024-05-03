public class IcyHot {

    //count of test cases
    private int count;
    // test cases which has an error. Either due to bad expected data or wrong or incomplete implemnetation of target function
    private int errs;

    public static void main(String[] args) {

        IcyHot app = new IcyHot();
        app.icyHotTestCases();

    }

    /**
     * Target function, this function is the main function to implement. The signature should be same as
     * in your question.
     * Following is simple question, real one will be a little more complex.
     * Remember :
     * copy this template but rename all functions and change parameters per your problem.
     * <p>
     * Question:
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     * <p>
     * icyHot(120, -1) -> true
     * icyHot(-1, 120) -> true
     * icyHot(2, 120) -> false
     * <p>
     */
    public boolean icyHot(int temperature1, int temperature2) {
        return temperature1 < 0;//sample answer, incomplete
    }


    /**
     * Test helper. This function calls target and checks response - if matches expected.
     * <p>
     * Same parameters as target plus the return type - expected value.
     * expected value has to be accurately calculated by developer.
     * Type and number of parameters can change depending on your question.
     */
    void testIcyHot(int temperature1, int temperature2, boolean expected) {
        boolean actual = false;
        count++;
        try {
            actual = icyHot(temperature1, temperature2);
        } catch (Throwable e) {
            e.printStackTrace();// log it
            System.err.println("Error " + e);
        }

        if (actual != expected) {
            System.out.println("Actual :" + actual + ", expected :" + expected + ", for temperature1 :" + temperature1 + ", temperature2 :" + temperature2
                    + ", count :" + count + ".");
            errs++;
        }
    }

    /**
     * Different test cases - more the better to adequately test the target function for all
     * requirements per the question.
     * Number of test cases depends on question and number & type of parameters in target.
     */
    private void icyHotTestCases() {
        System.out.println("IcyHot test cases run at " + new java.util.Date() );
        testIcyHot(0, 0, false);
        testIcyHot(0, 101, false);
        testIcyHot(-1, 101, true);
        testIcyHot(500, -101, true);
        testIcyHot(0, 101, false);
        testIcyHot(-100, 1999, true);
        System.out.println("Icy Hot test cases count " + count + ", Errors :" + errs + ".");
    }

}
