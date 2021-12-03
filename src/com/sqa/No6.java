package com.sqa.no6;

import java.util.Scanner;

class BebasException extends Exception {
	public BebasException(String s) {
		super(s);
	}
}
public class No6 {
	int JK, menikah =1;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println(" Pilih Jenis Kelamin \n" +
				"1. Pria \r\n" +
				"2. Wanita\r\n" +
				
				"Pilih (1-2) : ");
		int JK = input.nextInt();
		System.out.println(" Pilih Jenis Kelamin \n" +
				"1. Menikah \r\n" +
				"2. Belum Menikah\r\n" +
				
				"Pilih (1-2) : ");
		int status = input.nextInt();
		
		try {
			switch(JK) {
			case 1 :
				switch(status) {
				case 1:
					throw new BebasException("Pria Menikah Pajak 5%");
				case 2:
					throw new BebasException("Pria Belum Menikah Pajak 10%");
				}	
			case 2:
				switch(status) {
				case 1:
					throw new BebasException("Wanita Menikah Pajak 3%");
				case 2:
					throw new BebasException("Wanita Belum Menikah Pajak 7%");
				}
			}
			throw new BebasException("Throw Custom Message");
		} catch (BebasException bebas) {
			// TODO: handle exception
			System.out.println("Bebas Exception");
			System.out.println(bebas.getMessage());
		}

	}

}