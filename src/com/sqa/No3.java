package com.sqa.no3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {
		double kilometer, waktu, hasil;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Masukan jarak (kilometer)  = ");
		kilometer = input.nextInt();
		System.out.println("Masukan waktu (jam)  = ");
		waktu = input.nextInt();
		hasil=kilometer/waktu;
		hitungkecepatan(hasil);
		
		
	}
	
static void hitungkecepatan(double hasil) {
	DecimalFormat df = new DecimalFormat("#,##");
	System.out.println(df.format(hasil));
	System.out.println("Kecepatan rata-rata anda adalah " +hasil+ " km/jam");
		
	}

}

