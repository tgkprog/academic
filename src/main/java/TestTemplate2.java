
/*
 * Sample of how to solve and not a real problem
 * */


/**
 *  * Make a class with a main method, the target method , test helper and test cases function
 *  * Read all instructions. Twice (comments in this calss).
 *   Your question will be different than this one, with different parameters and requirement.
 *  * This is a sample.
 *
 *  * You can copy the structure of this problem (test cases, test helper and main method)
 *  * will juduge on how well you write different test cases, think like a tester for 10 minutes to find
 *  bugs.(different test data, testing edge cases, to properly test the requirements)
 *  Its not J Unit style, but is single class with solution and unit test cases with main method. Simple unit testing.
 *
 *  Main method calls Test cases function.
 *  Test cases function calls test helper function repeatedly with different test data and expected value
 *  test helper calls target function and compares actual return with expected.
 *
 *  If a test case fails can be due to bad expected value or wrong params (you wanted to send 2 but typed 3 by mistake)
 *  or wrong implementation of tartger function. Check all 3.
 *  * */

public class TestTemplate2 {

    //target function
    /**
     * return true of string has sub string "fizz"
     * retun false if it does not have "fizz". Also return false if it has sub string "fuzz"
     * */
    public boolean hasFizzNoFuzz(String in) {
        if(in.contains("fuzz"))return false;
        if(in.contains("fizz"))return true;
        return false;
    }

    //test helpers, in same class for speed, in production code would be seperate

    int errs = 0, count = 0;

    public static void main(String[] a) {
        new TestTemplate2().testCases();
    }


    void testCases() {

        testHelper("ffFizzfizz", true);
        testHelper("ffFizzfizzfUzz", true);
        testHelper("ffFizzfizzfuzz", false);
        //TODO more test cases

        System.out.println("count :" + count + "; errs " + errs + ", at " + new java.util.Date());
    }

    void testHelper(String in, boolean expected) {
        count++;
        try {
            boolean actual = hasFizzNoFuzz(in);
            //if (!expected.equals(actual))
            if (expected != actual) {
                errs++;
                System.out.println("Mismatch :[" + in + "]. Expected [" + expected + "]; actual [" + actual + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
            errs++;
        }
    }
}

