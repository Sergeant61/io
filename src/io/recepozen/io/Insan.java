package io.recepozen.io;

public class Insan {

	private int id;
	private String ad;
	private String soyad;
	private String memleket;
	private String meslek;
	private String kanGrubu;
	private String yas;
	private String dogumTarihi;
	private String dogumYeri;

	public int getId() {
		return id;
	}

	public String getAd() {
		return ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public String getMemleket() {
		return memleket;
	}

	public String getMeslek() {
		return meslek;
	}

	public String getKanGrubu() {
		return kanGrubu;
	}

	public String getYas() {
		return yas;
	}

	public String getDogumTarihi() {
		return dogumTarihi;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public Insan(int id, String ad, String soyad, String memleket, String meslek, String kanGrubu, String yas,
			String dogumTarihi, String dogumYeri) {

		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.memleket = memleket;
		this.meslek = meslek;
		this.kanGrubu = kanGrubu;
		this.yas = yas;
		this.dogumTarihi = dogumTarihi;
		this.dogumYeri = dogumYeri;
	}

}
