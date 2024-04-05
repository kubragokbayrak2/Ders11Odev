package org.example;

import java.time.LocalDate;

public class KadinPersonel extends Personel{
    public KadinPersonel(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public LocalDate emeklilikTarihiHesapla() {
        LocalDate dogumTarihi = getDogumTarihi();
        LocalDate emeklilikTarihi = dogumTarihi.plusYears(60);
        return emeklilikTarihi;
    }
}
