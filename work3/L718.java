package work3;

import java.util.Scanner;

public class L718 {

	private static double[] score;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < score.length - 1; i++) {
	        for (int j = 0; j < score.length - 1 - i; j++) {
	            if (score[j] > score[j + 1]) {
	                double temp = score[j + 1]; 
	                score[j + 1] = score[j]; 
	                score[j] = temp; 
	            }
	            System.out.print(score[j] + " "); 
	        }
	        System.out.print("");
	        for (int j = score.length - 1 - i; j < score.length; j++) {
	            System.out.print(score[j] + " ");
	        }
	        System.out.println("");

	}
	}

}
