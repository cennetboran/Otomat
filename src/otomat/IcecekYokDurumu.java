/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomat;

/**
 *
 * @author lenovo
 */
public class IcecekYokDurumu implements Durum{
    Otomat otomat;
    public IcecekYokDurumu(Otomat otomat){
        this.otomat = otomat;
    }

    @Override
    public void paraAt() {
        System.out.println("İçecek Kalmadı...");
    }

    @Override
    public void paraIadeEt() {
        System.out.println("Para da yok İçecekte Yok");
    }

    @Override
    public void calis() {
        System.out.println("Çalışamam içecek Yok");
    }

    @Override
    public void icecekVer() {
        System.out.println("İçecek Veremem İçecek Kalmadı");
    }
    
    
    
}
