package org.example;

import java.time.LocalDate;

public class ErkekPersonel extends Personel {
    public ErkekPersonel(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public LocalDate emeklilikTarihiHesapla() {
        LocalDate dogumTarihi = getDogumTarihi();
        LocalDate emeklilikTarihi = dogumTarihi.plusYears(65);
        return emeklilikTarihi;
    }
}
