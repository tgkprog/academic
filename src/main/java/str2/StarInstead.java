package str2;

/**
 * Given a string and a non-empty word string, return a version of the original String where all chars have been replaced
 * by asterisks ("*"), except for appearances of the word string which are preserved unchanged.
 * <p>
 * stars("12xy34", "xy") -> "**xy**"
 * stars("12xy34", "1") -> "1*****"
 * stars("12xy34xyabcxy", "xy") -> "**xy**xy***xy"
 * stars("12xy34xyabcxy", "") -> "*************"
 * stars("boy", "b") -> "b**"
 */
public class StarInstead {
    int errs = 0, count = 0;

    public static void main(String[] a) {
        new StarInstead().testCases();
    }

    public String starInstead(String str, String word) {
        var sb = new StringBuilder();
        int from = 0;
        final int ln = str.length();
        final int ln2 = word.length();

        while (from < ln) {
            if (ln2 > 0 && (from + ln2) <= ln) {
                if (str.substring(from, from + ln2).equals(word)) {
                    from += ln2;
                    sb.append(word);
                } else {
                    from++;
                    sb.append('*');
                }
            }else {
                from++;
                sb.append('*');
            }

        }
        return sb.toString();
    }

    void testCases() {
        System.out.println("Starting at " + new java.util.Date());

        testHelper("123xy", "xy", "***xy");
        testHelper("56bn5s", "5", "5***5*");
        testHelper ("12xy34", "1","1*****");
        testHelper ("12xy34", "","******");
        // testHelper("ffFizzfizzfuzz", false);
        //TODO more test cases

        System.out.println("count :" + count + "; errs " + errs + ", at " + new java.util.Date());
    }

    void testHelper(String str, String word, String expected) {
        count++;
        try {
            String actual = starInstead(str, word);
            //if (!expected.equals(actual))
            if (!expected.equals(actual)) {
                errs++;
                System.out.println("Mismatch :[" + str + "], [" + word + "]. Expected [" + expected + "]; actual [" + actual + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
            errs++;
        }
    }

}
