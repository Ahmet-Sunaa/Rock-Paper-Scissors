
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmet
 */
public class kullanici extends Oyuncu {
    String oyuncuAdi,oyuncuID;
    Object list[]=new Object[5];
    kullanici(){
        this.skorkullanici=skorkullanici;
        this.skorbilgisayar=skorbilgisayar;
        this.oyuncuAdi=oyuncuAdi;
        this.oyuncuID=oyuncuID;
        this.nesneListesi=nesneListesi;
    }
    kullanici(String oyuncuID,String oyuncuAdi,int skorkullanici,int skorbilgisayar,String nesneListesi[]){
        super(oyuncuID,oyuncuAdi);
    }
    kullanici(String oyuncuID,String oyuncuAdi){
        super(oyuncuID,oyuncuAdi);
    }
    kullanici(String nesne[]){
        super();
        this.nesneListesi=nesne;
    }
    public int getskorkullanici(){
        return skorkullanici;
    }
    public String getoyuncuAdi(){
        return oyuncuAdi;
    }
    public String getoyuncuID(){
        return oyuncuID;
    }
    public void setoyuncuId(String oyuncuid){
        this.oyuncuID=oyuncuid;
    }
    public void setoyuncuAdi(String oyuncuadi){
        this.oyuncuAdi=oyuncuadi;
    }
    public int setskorkullanici(){
        skorkullanici++;
        return skorkullanici;
    }
    public String getnesneListesi(int deger){
        return nesneListesi[deger];
    }
    public void setnesneListesi(String []nesne){
        this.nesneListesi=nesne;
    }
    public void skorGoster(){
        System.out.println(skorkullanici);
    }
    
    public String nesneSec(int a){
        System.out.println("kullanici secim: "+nesneListesi[a]);
        String nesne;
        nesne=nesneListesi[a];
        return nesne;
    }
}
