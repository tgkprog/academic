package str2;

public class Mirror {
    int errs = 0, count = 0;

    public static void main(String[] a) {
        new Mirror().testCases();
    }

    public String mirrors(String s) {
        StringBuilder sb = new StringBuilder();
        final int ln = s.length();
        final int half = (int)Math.round( ((float)s.length() / 2));
        System.out.println("in :" + s + "; half " + half);
        for (int i = 0; i < half; i++) {
            sb.append(s.charAt(ln - i - 1));
            if (!s.startsWith(sb.toString())) {
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            }
        }
        return sb.toString();
    }

    void testCases() {

        testHelper("abc", "");
        testHelper("a1a", "a1");
        testHelper("a1b1a", "a1b");
        testHelper("a 1b1 a", "a 1b");
        testHelper("a 1bb1 a", "a 1b");
        testHelper("12321", "123");
        testHelper("4 5 6  6 5 4", "4 5 6 ");
        testHelper("GHj7bHG", "GH");
        testHelper("GHj7b HG", "GH");
        testHelper("G Hj7bH G", "G H");
        System.out.println("count :" + count + "; errs " + errs + ", at " + new java.util.Date());
    }

    void testHelper(String in, String expected) {
        count++;
        try {
            String actual = mirrors(in);
            if (!expected.equals(actual)) {
                errs++;
                System.out.println("Mismatch :[" + in + "]. Expected [" + expected + "]; actual [" + actual + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
            errs++;
        }
    }

}
