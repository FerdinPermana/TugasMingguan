package com.sqa.no9;

import java.util.Scanner;

public class No9 {
		static int [] nilai = new int[5];
		static int [] arr = new int[5];
		static Scanner in=new Scanner(System.in);
	
		public static int jumlahArray(int[] nilai) {
		System.out.println("Masukan Nilai Array : ");
		 int sum = 0;
		 
		 for (int i = 0; i<nilai.length; i++) {
			nilai[i] = in.nextInt();
		  sum += nilai[i];
		 }
		 System.out.println("Hasilanya "+sum);
		 return sum;
		}
		public static boolean cariNilai(int[] arr, int nilai) {
		 for (int x = 0; x<arr.length; x++) {
		  if (arr[x] == nilai) {
		   return true;
		 }
		 }
		 return false;
		}
		public static void main(String[] args) {
			jumlahArray(nilai);
			cariNilai(arr, 3);
		}
		


}
