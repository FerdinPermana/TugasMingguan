package com.sqa.no10;

public class No10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sekolah sekolah = new Sekolah();
		SMK set = new SMK();
		
		
		set.nama("Sekolah Menengah Kejuruan Triguna");
		set.alamat("Jl. Wr. Supratman");
		set.jenjang("Sekolah Menengah Kejuruan Swasta \n");
		
		sekolah.nama(); System.out.println(set.getNama());
		sekolah.alamat(); System.out.println(set.getAlamat());
		sekolah.jenjang(); System.out.println(set.getJenjang());
		
		SMA set1 = new SMA();
		set1.nama("Sekolah Menengah Atas Triguna");
		set1.alamat("Jl. Wr. Supratman");
		set1.jenjang("Sekolah Menengah Atas Swasta");
		
		sekolah.nama(); System.out.println(set1.getNama());
		sekolah.alamat(); System.out.println(set1.getAlamat());
		sekolah.jenjang(); System.out.println(set1.getJenjang());
		
		
	}

}
