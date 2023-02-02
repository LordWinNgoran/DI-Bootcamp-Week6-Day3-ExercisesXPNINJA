package atos;

//Exercise 2 : Iterate Through The Array
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Use a nested for loop to iterate through the array and print out each value. 
* The outer loop should iterate through the rows, and the inner loop should iterate through 
* the columns.
* date: 02/02/2023
*/

public class Exercise2 {

	public static void main(String[] args) {
		
        int[][] tab = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        for(int i = 0; i<tab.length; i++) {
            for(int j = 0; j<tab[i].length; j++) {
                System.out.println(tab[i][j]);
            }
        }

	}

}
