package arr;

public class GasStationsCircle {


    int cases;
    int errs;

    public static void main(String[] a) {
        new GasStationsCircle().testCases();
    }

    public void testCases() {
        int[] gas = null;
        int[] used = null;

        gas = new int[]{0, 0, 0, 2};
        used = new int[]{0, 0, 1, 0};
        test(gas, used, 3);

        gas = new int[]{7, 0, 0, 1};
        used = new int[]{1, 1, 2, 3};
        test(gas, used, 0);
        System.err.println("cases " + cases + "; err " + errs);

    }

    public void test(int[] gas, int[] used, int exp) {
        cases++;
        int ac = -9;
        try {
            ac = canCompleteCircuit(gas, used);
            if (ac != exp) {
                errs++;
                System.err.println("Mismats " + cases + "; gas " + gas + ", used " + used + "; ex " + exp + "; ac " + ac);
            }
        } catch (Exception e) {
            errs++;
            System.err.println("Err " + cases + "; gas " + gas + ", used " + used + "; ex " + exp + "; ac " + ac + "; " + e);
            e.printStackTrace();
        }
    }


    int total(int []a){
        int t=0;
        for(int i =0; i < a.length; i++){
            t+= a[i];
        }
        return t;
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int t1 = total(gas);
        int t2 = total(cost);
        if(t1 < t2)return -1;



        int ats = 0;
        long tot = 0;
        final int ln = gas.length;

        for (int i = 0; i < ln; i++) {
            tot += gas[i] - cost[i];
            if(tot < 0){
                tot = 0;
                ats = i+1;
            }
        }




        return ats;
    }

}
