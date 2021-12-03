package com.sqa.no4;

import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {
		int sisa, jarakPerLiter;
		Scanner input=new Scanner(System.in);
		System.out.println("Masukan sisa BBM dalam tangki (liter) = ");
		sisa = input.nextInt();
		System.out.println("Masukan konsumsi BBM kendaraan (km/liter) = ");
		jarakPerLiter = input.nextInt();
		hitungSisaJarak( sisa,  jarakPerLiter);
		
	}
	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		System.out.println("Kendaraan anda dapat menempuh jarak " +sisaJarak+ " kilometer dengan sisa BBM yang ada di tangki");
		return sisaJarak;
		}
	
}
