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
public class ParaVarDurumu implements Durum{
    Otomat otomat;
    public ParaVarDurumu(Otomat otomat){
        this.otomat = otomat;
    }

    @Override
    public void paraAt() {
        System.out.println("Para Zaten Var Düğmeye Bas");
    }

    @Override
    public void paraIadeEt() {
        System.out.println("Para İade Edildi..");
        otomat.set_state(otomat.paraYokDurum);
    }

    @Override
    public void calis() {
        System.out.println("Çalışıyor Lütfen Bekleyiniz...");
    }

    @Override
    public void icecekVer() {
        otomat.icecekVer();
    }
    
    
    
    
}
