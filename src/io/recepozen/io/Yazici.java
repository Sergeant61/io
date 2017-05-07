package io.recepozen.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Yazici implements IYazmaI,IYazmaII{

	PrintWriter pw;

	public void dosyaAc(String dosyaYolu) {
		try {
			this.pw = new PrintWriter(dosyaYolu);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void dosyaKapt() {
		this.pw.close();
	}

	public void veriYaz(Insan insan) {
		this.pw.println(insan.getId() + " " + insan.getAd() + " " + insan.getSoyad() + " " + insan.getMemleket() + " "
				+ insan.getMeslek() + " " + insan.getKanGrubu() + " " + insan.getYas() + " " + insan.getDogumTarihi()
				+ " " + insan.getDogumYeri());
	}
	
	
	public void veriYaz(String okunan) {
		this.pw.println(okunan);
	}
	
	
	

}
