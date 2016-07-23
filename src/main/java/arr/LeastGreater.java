package arr;

/** Fn to find next value that is greater than specified in an array , but the least among possible values, to the right of a location in array
 * */
public class LeastGreater {
	
	public static void main(String[] args) {
		
	    int[] arr = { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 };
	    LeastGreater ap = new LeastGreater();
	    ap.findLeasterGreater(arr, 0);
	    ap.findLeasterGreater(arr, 1);
	    ap.findLeasterGreater(arr, 11);
	    ap.findLeasterGreater(arr, 6);
	    
	}
	
	
	int findLeasterGreater(int [] arr, int loc){
	    
	   
	    int nextGreaterLoc = -1;
	    boolean first = true;
	    for(int i = loc + 1; i < arr.length;i++){
	    	if(first &&  arr[loc] < arr[i]){
	    		
	    		first = false;
	    		nextGreaterLoc  = i;
	    	}else if (arr[loc] < arr[i] && arr[nextGreaterLoc] > arr[i]){
	    		nextGreaterLoc  = i;
	    	}
	    }
	    if(nextGreaterLoc  == -1){
	    	System.out.println("Not found a value bigger than " + arr[loc] + " (after location " + loc + ")");
	    }else{
	    	System.out.println("Found a value bigger :" + arr[nextGreaterLoc] + " at location " + nextGreaterLoc +  " bigger than " + arr[loc] + " (after location " + loc + ")");
	    }
	    return nextGreaterLoc;
	}

}
