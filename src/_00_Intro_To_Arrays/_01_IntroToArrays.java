package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
    	Random ran = new Random();
    	int rand=ran.nextInt(50);
    	int smallest=100;
    	int largest=0;
    	String characters[]= new String[5];
    	characters[0]="Shroud, Hikari. Other names include Inoshima, Hikari, and Enma, Hikari.";
    	characters[1]="Shroud, Ortho";
    	characters[2]="Shroud, Idia";
    	characters[3]="Mrs. Shroud. Also known as S.T.Y.X Chief Engineer";
    	characters[4]="Mr. Shroud. Also known as S.T.Y.X Director";
    	System.out.println(characters[3]);
    	characters[3]="Mrs. Shroud. Also known as S.T.Y.X Chief Engineer.";
    	System.out.println(characters[3]);
    	for(int i =0;i<5;i++) {
    		characters[i]="System error. Message: 404 error";
    	}
    	for(int i =0;i<5;i++) {
    		System.out.println(characters[i]);
    	}
    	characters[0]="Shroud, Hikari. Other names include Inoshima, Hikari, and Enma, Hikari";
    	characters[1]="Shroud, Ortho";
    	characters[2]="Shroud, Idia";
    	characters[3]="Mrs. Shroud. Also known as S.T.Y.X Chief Engineer";
    	characters[4]="Mr. Shroud. Also known as S.T.Y.X Director";
    	for(int i =0;i<5;i++) {
    		System.out.println(characters[i]);
    	}
    	Integer nums[]=new Integer[50];
    	for (int i = 0;i<50;i++) {
    		nums[i]=rand;
    		rand=ran.nextInt(100);
    	}
    	for(int i = 0;i<50;i++){
    		if (nums[i]<smallest) {
    			smallest=nums[i];
    		}
    		if(nums[i]>largest) {
    			largest=nums[i];
    		}
    	}
    	System.out.println(smallest);
    	System.out.println(largest);
    	for (int i = 0;i<50;i++) {
    		System.out.println(nums[i]);
    	}
    	
    	System.out.println(nums[49]);
        // 1. declare and Initialize an array 5 Strings

        // 2. print the third element in the array

        // 3. set the third element to a different value

        // 4. print the third element again

        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE

        // 7. make an array of 50 integers

        // 8. use a for loop to make every value of the integer array a random
        //    number

        // 9. without printing the entire array, print only the smallest number
        //    on the array

        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
