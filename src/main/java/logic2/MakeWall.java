package logic2;

public class MakeWall {
    /**
     * We want to make a wall of rows,  that is goal inches long.
     * We have a number of small bricks (2 inch each) and big bricks (7 inches each).
     * Return true if it is possible to make the exact goal by choosing from the given bricks.
     * This is a little harder than it looks but can be done without any loops.
     * Tips :
     * Java module 5 % 2 == 1
     * int i = 7 / 2;
     * i will be 2
     * Tip 2:
     * int a = 8; int b = 3
     * int c = a / b;
     * c will be 2. (works if a and b are int) These two tips might help you for this problem
     * */
    public boolean makeWall(int small, int big, int goal) {
        final int b2 = big * 7;
        final int s2 = small * 2;
        if((b2 + s2) < goal)return false;
        if(s2 >= goal && goal %2 == 0)return true;//shortcircuit for few
        final int bigUsed = (int) Math.floor(((double)goal) / 7);
        final int leftAfterBig = goal - (bigUsed * 7);
        if(leftAfterBig == 0)return true;
        if(leftAfterBig % 2 == 0 && s2 >= leftAfterBig)return true;
        return false;
    }

    int errs = 0, count = 0;

    public static void main(String[] a) {
        new MakeWall().testCases();
    }

    void testCases() {

        testHelper(2, 2, 4, true);
        testHelper(1, 2, 14, true);

        testHelper(1, 2, 16, true);
        testHelper(2, 2, 18, true);
        testHelper(1, 3, 21, true);

        testHelper(1, 3, 23, true);

        testHelper(1, 1, 23, false);

        testHelper(1, 2, 4, false);

        System.out.println("count :" + count + "; errs " + errs + ", at " + new java.util.Date());
    }

    void testHelper(int small, int big, int goal, boolean expected) {
        count++;
        try {
            boolean actual = makeWall(small, big, goal);
            //if (!expected.equals(actual))
            if (expected != actual) {
                errs++;
                System.out.println("Mismatch add:[" + small + "], j [" + big + "] goal [" + goal + "]. Expected [" + expected + "]; actual [" + actual + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
            errs++;
        }
    }
}
