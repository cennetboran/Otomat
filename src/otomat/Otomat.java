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
public class Otomat {

    public Durum paraYokDurum;
    public Durum paraVarDurum;
    public Durum icecekYokDurum;
    public Durum icecekSatildiDurum;
     
    Durum simdikiDurum;
    
    
    public int icecekSayisi = 7;
    
    public Otomat(){
        paraYokDurum = new ParaYokDurumu(this);
        paraVarDurum = new ParaVarDurumu(this);
        icecekYokDurum = new IcecekYokDurumu(this);
        icecekSatildiDurum = new IcecekSatildiDurumu(this);
        simdikiDurum = paraYokDurum;
    }
    
    public Durum get_state(){
        return simdikiDurum;
    }
    
    public void set_state(Durum s){
        simdikiDurum = s;
    }
    
    public void paraAt(){
        simdikiDurum.paraAt();
    }
    
    public void paraIadeEt(){
        simdikiDurum.paraIadeEt();
    }
    
    public void calis(){
        simdikiDurum.calis();
    }
    
    public void icecekVer(){
        if(icecekSayisi == 1){
            System.out.println("İçecek Geliyor...");
            icecekSayisi -= 1;
            System.out.println("Kalan İcecek Sayisi : " + icecekSayisi);
            set_state(icecekYokDurum);
        }else if(icecekSayisi <= 0){
            set_state(icecekYokDurum);
        }else{
            System.out.println("İçecek Geliyor...");
            icecekSayisi -= 1;
            System.out.println("Kalan İcecek Sayisi : " + icecekSayisi);
            set_state(paraYokDurum);
        }
    }
    
    public static void main(String[] args) {
        Otomat otomat = new Otomat();
        
        otomat.paraAt();
        otomat.calis();
        otomat.icecekVer();
        otomat.paraAt();
        otomat.calis();
        otomat.icecekVer();
        otomat.paraAt();
        otomat.calis();
        otomat.icecekVer();
        otomat.paraAt();
        otomat.calis();
        otomat.icecekVer();
        otomat.paraAt();
        otomat.calis();
        otomat.icecekVer();
        otomat.paraAt();
        otomat.calis();
        otomat.icecekVer();
        otomat.paraAt();
        otomat.calis();
        otomat.icecekVer();
        otomat.paraAt();
        otomat.calis();
        otomat.icecekVer();
        
    }
    
}
