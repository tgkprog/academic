package src.main.java;

public class Palindrome {
    int errs = 0, count = 0;

    public static void main(String[] a) {
        new Palindrome().testCases();
    }

    void testCases() {
        /*Radar
Amor, Roma!
"fbv,bnnnn"
"0,km"
*/
        test("Amor, Roma!", true);
        //test("fbv,nnnn", false);
        test("Radar", true);
//        test("aabaa", true);
//        test("aaaa", true);
//        test("aaba", false);
        System.out.println("Errs " + errs
         + ", count "  + count);
    }

    void test(String in, boolean expected) {
        count++;
        try {
            boolean actual = palindromeTest(in);
            System.out.println(in + " is palin :" + actual);
            if (actual != expected) {
                System.err.println("mismatch for :" + in + "; ex " + expected + "; ac " + actual);
                errs++;
            }
        } catch (Exception e) {
            System.err.println("err " + e);
            e.printStackTrace();
            errs++;
        }
    }

    String removeNonAlphaNumberic(String in){
        final int ln = in.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ln; i++) {
            final char c = in.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    boolean palindromeTest(final String pin) {
        final String in  = removeNonAlphaNumberic( pin.toLowerCase());
        int half = in.length() / 2;
        final int ln = in.length();
        for (int i = 0; i < half; i++) {
            if (in.charAt(i) != in.charAt(ln - i - 1)) return false;
        }
        return true;
    }
}
