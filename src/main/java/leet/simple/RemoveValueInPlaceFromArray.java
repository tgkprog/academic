package leet.simple;

import java.util.*;

class RemoveValueInPlaceFromArray {
    int count;
    int passed;

    public static void main(String[] args) {
        RemoveValueInPlaceFromArray app = new RemoveValueInPlaceFromArray();
        app.testCases();
    }

    public int removeElement(int[] nums, int val) {
        int rtn = 0;
        int top = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                nums[i] = nums[top];
                top--;
            } else {
                rtn++;
            }
        }
        return rtn;
    }

    public void test(int nums[], int val, int exp, int expA[]) {
        count++;
        boolean com = false;
        try {
            System.out.println("In :");
            printAr(nums, nums.length);
            int r = removeElement(nums, val);
            System.out.println("\nOut :");
            printAr(nums, r);
            System.out.println("\n exp :" + exp + ", rtn " + r);
            int a2[] = new int[r];
            System.arraycopy(nums, 0, a2, 0, r);
            com = compareArr(a2, expA);
            System.out.println("Compare :" + com);
            if (com) passed++;
        } catch (Exception e) {
            System.out.println("Err :" + e);
            e.printStackTrace();
        }


    }

    void printAr(int[] n, int till) {
        for (int i = 0; i < till; i++) {
            System.out.print(n[i] + " ");
        }
    }

    void testCases() {
		int[] nums = null;
		nums = new int[]{3, 3, 7, 8, 3, 2, 5, 3, 0, 7, 8, 1, 2, 3, 7};
		int[] a3 = {3, 3, 7, 8, 3, 2, 5, 3, 0, 7, 8, 1, 2, 3, 7};
		boolean b = compareArr(nums, a3);
		System.out.println("b 1 " + b);

		a3 = new int[]{3, 3, 7, 8, 5, 2, 5, 3, 0, 7, 8, 1, 2, 3, 7};
		b = compareArr(nums, a3);
		System.out.println("b 2 " + b);

		a3 = new int[]{3, 3, 7, 8, 3, 2, 5, 3, 0, 7, 8, 1, 8, 2, 3, 7};
		b = compareArr(nums, a3);
		System.out.println("b 3 " + b);

		a3 = new int[]{3, 3, 7, 8, 3, 2, 5, 3, 0, 7, 8, 1, 34, 2, 3, 7};
		b = compareArr(nums, a3);
		System.out.println("b 4 " + b);

       	nums = new int[]{2, 5, 3, 0, 7, 8, 1, 2, 3, 7};
        int val = 3;
        int expRtn = 8;
        int rtnAr[] = {2, 5, 0, 7, 8, 1, 2, 7};
        test(nums, val, expRtn, rtnAr);
        nums = new int[]{3, 3, 3, 3, 2, 5, 3, 0, 7, 8, 1, 2, 3, 7};
        test(nums, val, expRtn, rtnAr);

        nums = new int[]{3, 3, 7, 8, 3, 2, 5, 3, 0, 7, 8, 1, 2, 3, 7};
        expRtn = 10;
        rtnAr = new int[]{7, 8, 2, 5, 0, 7, 8, 1, 2, 7};
        test(nums, val, expRtn, rtnAr);
        System.out.println("Test cases count " + count + " passed " + passed + ". All passed ? " + (count == passed && count > 0) + "\n");





    }

    boolean compareArr(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            System.out.println("Ar len mismatch a1 " + a1.length + " a2 " + a2.length);
            return false;
        }
        Map<Integer, Integer> m1 = new TreeMap<>();
        List<Integer> l1 = Arrays.stream(a1).boxed().toList();
        l1.forEach((i) -> {
                    Integer j = m1.get(i);
                    if (j == null) j = 1;
                    else j = j + 1;
                    m1.put(i, j);
                }
        );

        Map<Integer, Integer> m2 = new TreeMap<>();
        List<Integer> l2 = Arrays.stream(a2).boxed().toList();
        l2.forEach((i) -> {
                    Integer j = m2.get(i);
                    if (j == null) j = 1;
                    else j = j + 1;
                    m2.put(i, j);
                }
        );
        //p(m1.values());
        ///p(m2.values());

        return m1.equals(m2);
        //.keySet().equals(m2.keySet()) && m1.values().
    }

    void p(Collection n) {
        System.out.println("Collection   " + n);
        Iterator i = n.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("");
    }
}
