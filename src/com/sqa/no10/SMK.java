package com.sqa.no10;

public class SMK extends Sekolah{
	private String nama;
	private String alamat;
	private String jenjang;
	
	public SMK() {
		System.out.println("Sekolah Menengah Kejuruan");
	}
	public void nama(String a) {
		nama = a;
	}
	public void alamat(String a) {
		alamat = a;
	}
	public void jenjang(String a) {
		jenjang = a;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getAlamat() {
		return alamat;
	}
	public String getJenjang() {
		return jenjang;
	}

}
