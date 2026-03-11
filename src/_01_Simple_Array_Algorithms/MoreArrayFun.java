package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
	
	public static void main (String args[]) {
		MoreArrayFun asdf = new MoreArrayFun();
		String list[] = new String[5];
		list[0] ="Top three NRC boyfriend choices-excluding brothers. NOT IN ORDER OF PREFERENCE!";
		list[1] = "Viper, Jamil. 17 years, 5ft 9in, right hand dominant, vice-housewarden of Scarabia. Hobbies: breakdancing. Talent: cooking. Pet peeves: 'bugs. I hate touching bugs. I can't stand them, and- STAY BACK WITH THAT FAKE SPIDER, KALIM!' Best subject: ancient magic. Other: in basketball club, likes curry, dislikes dates (the food).";
		list[2] = "Rosehearts, Riddle. 17 years, 5ft 3in, right hand dominant, housewarden of Heartslabyul. Hobbies: HEDGEHOG CARETAKING OMSEVENS COULD YOU GET ANY CUTER???? ('calm down, hikari...'). Talent: fast at crosswords. Pet peeves: rulebreaking. Best subject: practical magic. Other: in equestrian club, likes strawberry tars, dislikes junk food.";
		list[3] = "Kingscholar, Leona. 20 years, 6ft 0.8in, right hand dominant, housewarden of Savanaclaw. Hobbies: chess! well, that's a surprise. ('shut up, herbivore.') Talent: falling asleep in 3 seconds (ohmisevens that's such a stupid talent lol 'I said SHUT UP you little PIPSQUEAK!'). Pet peeves: dealing with kids. best subject: ancient magic. Other: in spelldrive club (ofc), likes meat, dislikes vegetables.";
		list[4] = "*the aftermath* Leona: why do you have this file on us, herbivore? You spot something you like? Me: !!! Jamil: while I appreciate you paying attention to your friends, this is...quite interesting, little fox. Me: *buries face in hands to hide blush* Riddle: oh, don't worry, Hikari. I'll forget all about the fact you hav two others on your radar if you give me a kiss and a tart. Me: ?! Riddle, I've never heard you speak like that before! Riddle: well, I am now. L&J:...what.";
		
		asdf.forward(list);
		System.out.println();
		asdf.backward(list);
		System.out.println();
		asdf.alterna(list);
		System.out.println();
		asdf.rand(list);
	}
	public void forward (String[] list) {
		for (int i =0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		
	}
	public void backward (String[] list) {
		for(int i = list.length-1;i>=0; i--) {
			System.out.println(list[i]);
		}
	}
	public void alterna (String[]list) {
		for (int i=0;i<=list.length-1;i++) {
			if(i%2==0) {
				System.out.println(list[i]);
			}
		}
	}
	public void rand (String[]list) {
		Random ran = new Random();
		int num;
		for (int i=0;i<=list.length-1;i++) {
			num = ran.nextInt(list.length-1);
			System.out.println(list[num]);
		}
	}
    //1. Create a main method to test the other methods you write.



    //2. Write a method that takes an array of Strings and prints all the Strings in the array.



    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.



    //4. Write a method that takes an array of Strings and prints every other String in the array.


    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.


}
