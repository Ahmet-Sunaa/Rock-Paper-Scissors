/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmet
 */
public class UstaMakas extends Makas {

    UstaMakas(int dayaniklilik,int seviyePuani){
        super(dayaniklilik,seviyePuani);
    }
    UstaMakas(int dayaniklilik,int seviyePuani,String []nesnelistesi){
        super(dayaniklilik,seviyePuani,nesnelistesi);
        this.nesneListesi=nesnelistesi;
    }
    public float nesnePuaniGoster(){
        System.out.println("dayaniklilik:"+dayaniklilik);
        System.out.println("seviye puani:"+seviyePuani);
        return seviyePuani;
    }
    public float etkiHesapla() {
        makas_etkisi=(float) ((keskinlik*direnc)/((0.2*nufuz*kalinlik)+(0.8*katilik*sicaklik)));
        return makas_etkisi;
    }
    public void seviyepuaniguncelle(){
        seviyePuani+=20;
    }
    public void durumGuncelle(float etki) {
        dayaniklilik=dayaniklilik-etki;
        if (dayaniklilik<=0) {
            System.out.println("elendi");
        }
    }
}
