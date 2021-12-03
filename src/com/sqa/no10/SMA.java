package com.sqa.no10;

public class SMA  extends Sekolah{
	private String nama;
	private String alamat;
	private String jenjang;
	
	public SMA() {
		System.out.println("Sekolah Menengah Atas");
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
