
/**
Target function and, unit test cases that call test helper repeatedly

Run in command prompt:
cd c:\j
c:
javac c:\j\IcyHot.java
java IcyHot

*/
public class IcyHot {

	public static void main(String[] args) {

		IcyHot app = new IcyHot();
		app.icyHotTestCases();

	}

	private int index;
	private int errs;

	/**
	* Target function, this function is the main function to implement. The signature should be same as
	in your question.
	Can use online tool to test it. In your java file can have system out println but for online
	test might have to comment that out or wont run.
	Following is simple question, real one will be a little more complex.
	Remember :
	copy this template but rename all functions and change parameters per your problem.

	* Question:
	 Given two temperatures, return true if one is less than 0 and the other is greater than 100.

		icyHot(120, -1) ? true
		icyHot(-1, 120) ? true
		icyHot(2, 120) ? false

	For debug can have system out println here but in reference website need to comment out.

	 */
	public boolean icyHot(int temp1, int temp2) {
		if(temp1 < 0 && temp2> 100)return true;//sample answer, incomplete
		return false;
	}


	/** Test helper. This function calls target and checks response - if matches expected.

		* Same parameters as target plus the return type - expected value.
		* expected value has to be accurately calculated by developer.
		Type and number of parameters can change depending on your question.
	 */
	void testIcyHot(int temp1, int temp2, boolean expected) {
		boolean actual = false;
		index++;
		try {
			actual = icyHot(temp1, temp2);
		} catch (Throwable e) {
			e.printStackTrace();// log it
			System.err.println("Error " + e);
		}

		if (actual != expected) {
			System.out.println("Actual :" + actual + ", expected :" + expected + ", for temp1 :" + temp1 + ", temp2 :" + temp2
					+ ", index :" + index +".");
			errs++;
		}
	}

	/**
	* Different test cases - more the better to adequately test the target function for all
    	requirements per the question.
	  Number of test cases depends on question and number & type of parameters in target.
	*/
	private void icyHotTestCases() {
		System.out.println("IcyHot ");
		testIcyHot(0, 0, false);
		testIcyHot(0, 101, false);
		testIcyHot(-1, 101, true);
		testIcyHot(500, -101, true);
		testIcyHot(0, 101,false);
		testIcyHot(-100, 1999, true);
		System.out.println("Icy Hot index " + index + ", Errors :" + errs + ".");
	}

}
