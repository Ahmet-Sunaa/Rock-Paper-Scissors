/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmet
 */
public abstract class Oyuncu {
    String oyuncuID;
    String oyuncuAdi;
    int skorkullanici,skorbilgisayar,nesnesayisi;
    String nesneListesi[]= new String[5];
    Oyuncu(){
        oyuncuID="";
        oyuncuAdi="";
        skorkullanici=0;
        nesnesayisi=5;
    }
    Oyuncu(String oyuncuID,String oyuncuAdi,int skorkullanici,int skorbilgisayar,String nesne[]){
        this.skorkullanici=skorkullanici;
        this.skorbilgisayar=skorbilgisayar;
        this.oyuncuAdi=oyuncuAdi;
        this.oyuncuID=oyuncuID;
        this.nesneListesi=nesne;
    }
    Oyuncu(String oyuncuId,String oyuncuAdi){
        this.oyuncuAdi=oyuncuAdi;
        this.oyuncuID=oyuncuId;
    }
    Oyuncu(String []nesne){
        this.nesneListesi=nesne;
    }
    public int getskorkullanici(){
        return skorkullanici;
    }
    public int getskorbilgisayar(){
        return skorbilgisayar;
    }
    public String getoyuncuAdi(){
        return oyuncuAdi;
    }
    public String getoyuncuID(){
        return oyuncuID;
    }
    public String[] getnesneListesi(){
        return nesneListesi;
    }
    public void skorGoster(){
        
    }
    public void nesneSec(int []dizi){
        
    }
    
}
