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
public class ParaYokDurumu implements Durum {
    Otomat otomat;
    
    public ParaYokDurumu(Otomat otomat){
        this.otomat = otomat;
    }

    @Override
    public void paraAt() {
        System.out.println("Para Eklendi..");
        otomat.set_state(otomat.paraVarDurum);
    }

    @Override
    public void paraIadeEt() {
        System.out.println("Para Yok!!!");
    }

    @Override
    public void calis() {
        System.out.println("Para Yok Çalışamam!!!");
    }

    @Override
    public void icecekVer() {
        System.out.println("Para Yok İçcecek Veremem!!!!!");
    }
    
    

}
