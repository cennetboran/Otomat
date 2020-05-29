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
public class IcecekSatildiDurumu implements Durum{
    
    Otomat otomat;
    public IcecekSatildiDurumu(Otomat otomat){
        this.otomat = otomat;
    }

    @Override
    public void paraAt() {
        System.out.println("İçecek zaten satıldı");
    }

    @Override
    public void paraIadeEt() {
        System.out.println("İçecek Çoktan satıldı Para Veremem");
    }

    @Override
    public void calis() {
        System.out.println("İçecek Satıldi bile");
    }

    @Override
    public void icecekVer() {
        System.out.println("İçecek Verildi");
    }
    
    
    
    
}
