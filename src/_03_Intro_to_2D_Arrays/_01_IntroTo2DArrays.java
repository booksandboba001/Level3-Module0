package _03_Intro_to_2D_Arrays;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
    	int[][] nums = {
    			{12,18,2008},
    			{8,14,2010},
    			{9,24,2011}
    	};
    	for(int i = 0; i < nums.length; i++) {

            // Loop through each element in the 1D array
            for(int j = 0; j < nums[i].length; j++) {
                nums[i][j]=j;
                System.out.println(nums[i][j]);
            }

            System.out.println();
        }
    	System.out.println(nums[1][2]);
    	nums[1][2]=2010;
    	System.out.println(nums[1][2]);

        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers

        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
        
        // 3. print the third element from the second 1D array (2DArray[1][2])

        // 4. set the third element from the second 1D array to a different
        //    value

        // 5. print the element again and verify the value has changed

    }
}
