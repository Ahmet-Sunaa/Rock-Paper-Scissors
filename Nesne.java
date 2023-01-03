/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmet
 */
public abstract class Nesne {
    String []nesneListesi;
    float dayaniklilik=20;
    int nesnesayisi;
    int seviyePuani=0;
    float makas_etkisi,kagit_etkisi,tas_etkisi;
    int katilik=2,nufuz=2,keskinlik=2,sicaklik=2,kalinlik=2,direnc=2;
    String id;
    Object a[]=new Object[5];
    public Nesne(){
        
    }
    public Nesne(float dayaniklilik,int seviyePuani,String []nesnelistesi){
        this.dayaniklilik=dayaniklilik;
        this.seviyePuani=seviyePuani;
        this.nesneListesi=nesnelistesi;
    }
    public Nesne(float dayaniklilik,int seviyePuani){
        this.dayaniklilik=dayaniklilik;
        this.seviyePuani=seviyePuani;
    }
    public float nesnePuaniGoster(){
        System.out.println("dayaniklilik:"+dayaniklilik);
        System.out.println("seviye puani:"+seviyePuani);
        return 0;
    }
    public float etkiHesapla() {
        makas_etkisi=(float) (keskinlik/(0.2*nufuz+0.8*katilik));
        kagit_etkisi=(float) (nufuz/(0.2*katilik+0.8*keskinlik));
        tas_etkisi=(float) (katilik/(0.2*keskinlik+0.8*nufuz));
        return 0;
    }
    public void durumGuncelle() {
    }
}
