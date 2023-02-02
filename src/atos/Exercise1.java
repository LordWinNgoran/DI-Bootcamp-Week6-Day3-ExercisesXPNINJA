package atos;

//Exercise 1 : War Of Numbers
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:There’s a great war between the even and odd numbers. 
* Many numbers already lost their lives in this war and it’s your task to end this. 
* You have to determine which group sums larger: the evens, or the odds. The larger group wins.
* date: 02/02/2023
*/
public class Exercise1 {

	 public static int warOfNumber(int[] tab) {
	        int sumOfNbrePair = 0, sumOfNbreImpair = 0;
	        for(int i = 0; i < tab.length; i++) {
	            if(tab[i] % 2 == 0) {
	                sumOfNbrePair+=tab[i];
	            }else {
	                sumOfNbreImpair+=tab[i];
	            }
	        }
	        
	        int sumNbreDiff = (sumOfNbreImpair < sumOfNbrePair) ? sumOfNbrePair - sumOfNbreImpair : sumOfNbreImpair - sumOfNbrePair;
	        
	        return sumNbreDiff;
	    }
	 
	public static void main(String[] args) {
		int[] intArray = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
		System.out.println( warOfNumber(intArray) );

	}

}
