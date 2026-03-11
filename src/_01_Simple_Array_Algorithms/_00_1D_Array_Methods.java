package _01_Simple_Array_Algorithms;


public class _00_1D_Array_Methods {
    //1. Complete the method so that it returns the sum of all
    //   of the integers in the array being passed in
	
	public static void main (String args[]) {
		int[] value = new int[6];
		value[0] = 827;
		value[1] = 912;
		value[2]=824;
		value[3] =20;
		value[4] = 17;
		value[5] = 17;
		System.out.println(sumIntArray(value));
		System.out.println(averageIntArray(value));
		System.out.println("It is "+containsIntValue(value,value[5])+" that this array contains that number.");
		System.out.println("The first occurance of this date is at index "+ getIndex(value,824));
	}
    public static int sumIntArray(int[] values) {
    	int total =0;
    	int num = values.length;
    	for(int i=0;i<num;i++){
    		total+=values[i];
    	}
        return total;
    }

    //2. Complete the method so that it returns the average of all
    //   of the integers in the array being passed in
    public static double averageIntArray(int[] values) {
    	int mean = 0;
    	int total =0;
    	int num = values.length;
    	for(int i=0;i<num;i++){
    		total+=values[i];
    	}
    	mean = (total/num);
        return mean;
    }


    //3. Complete the method so that it returns true if the integer
    //   array contains the value specified by the second parameter.
    //   It should otherwise return false.
    public static boolean containsIntValue(int[] array, int value) {
    	for (int element : array) {
            if (element == value) {
                return true;
            }
        }
    	return false;
        
    }

    //4. Complete the method so that it returns the index of the
    //   first instance that the specified value occurs in the array.
    //   If the array does not contain the specified value, it should return -1.
    public static int getIndex(int[] arr, int value) {
    	for (int i=0;i<arr.length;i++) {
            if (arr[i] == value) {
                return i+1;
            }
        }
        return -1;
    }
}
