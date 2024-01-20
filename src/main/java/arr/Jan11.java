package arr;

public class Jan11 {


    int cases;
    int errs;

    public static void main(String[] a) {
        new Jan11().testCases();
    }

    public void testCases() {
        String s1 = "RADAR";
        String s2 = "Amor, Roma!";//"amorroma"
        test(s1, true);
        test(s2, true);
        System.out.println("test cases " + cases + ", errs " + errs);
    }

    public void test(final String s, boolean exp) {
        cases++;
        final boolean ac = isPalindrome(s);
        if (exp == ac) {

        } else {
            errs++;
            System.err.println("Mis ma " + s + ", ac " + ac + ", ex " + exp);
        }
        System.out.println("Is palin " + ac + ", for " + s);
    }

    public boolean isPalindrome(final String s) {
        final int ln = s.length();

        int left = 0;
        int right = ln - 1;
        outer:
        while (left < right) {

            char c = s.charAt(left);
            while (!Character.isLetterOrDigit(c)) {
                left++;
                if (left == right) break outer;
                c = s.charAt(left);

            }

            char c1 = s.charAt(right);
            while (!Character.isLetterOrDigit(c1)) {
                right--;
                if (left == right) break outer;
                c1 = s.charAt(right);
            }
            if (Character.toUpperCase(c)  != Character.toUpperCase(c1)) return false;
            left++;
            right--;
        }


        return true;
    }

}
