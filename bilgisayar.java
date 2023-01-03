/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmet
 */
public class bilgisayar extends Oyuncu {
    String oyuncuID;
    String oyuncuAdi;
    int skorkullanici,skorbilgisayar,nesnesayisi;
    bilgisayar(){
        this.skorkullanici=skorkullanici;
        this.skorbilgisayar=skorbilgisayar;
        this.oyuncuAdi=oyuncuAdi;
        this.oyuncuID=oyuncuID;
        this.nesneListesi=nesneListesi;
    }
    bilgisayar(String oyuncuID,String oyuncuAdi,int skorkullanici,int skorbilgisayar,String nesne[]){
        this.skorkullanici=skorkullanici;
        this.skorbilgisayar=skorbilgisayar;
        this.oyuncuAdi=oyuncuAdi;
        this.oyuncuID=oyuncuID;
        this.nesneListesi=nesne;
    }
    bilgisayar(String nesne[]){
        super();
        this.nesneListesi=nesne;
    }
    public int getskorbilgisayar(){
        return skorbilgisayar;
    }
    public String getnesneListesi(int deger){
        return nesneListesi[deger];
    }
    public void setskorbilgisayar(){
        skorbilgisayar++;
    }
    public void setnesneListesi(String []nesne){
        this.nesneListesi=nesne;
    }
    public void skorGoster(){
        System.out.println("pc skor:"+skorbilgisayar);
    }
    public String nesneSec(int a){
        System.out.println("Bilgisayar secim: "+nesneListesi[a]);
        String nesne;
        nesne=nesneListesi[a];
        return nesne;
    }
}
