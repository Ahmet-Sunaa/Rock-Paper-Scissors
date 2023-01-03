/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmet
 */
public class tas extends Nesne {
    int aktif=0;
    public tas(int dayaniklilik,int seviyepuani){
        super(dayaniklilik,seviyepuani);
    }
    tas(int dayaniklilik,int seviyePuani,String []nesnelistesi){
        super(dayaniklilik,seviyePuani,nesnelistesi);
        this.nesneListesi=nesnelistesi;
    }
    public float nesnePuaniGoster(){
        System.out.println("dayaniklilik:"+dayaniklilik);
        System.out.println("seviye puani:"+seviyePuani);
        return seviyePuani;
    }
    public float etkiHesapla() {
        //tas_etkisi=20;
        tas_etkisi=(float) (katilik/(0.2*keskinlik+0.8*nufuz));
        return tas_etkisi;
    }
    public void seviyepuaniguncelle(){
        if(seviyePuani<30){
            seviyePuani+=20;
            if (seviyePuani>30) {
                System.out.println("tas nesnesi agir tasa terfi etti");
            }
        }
    }
    public void durumGuncelle(float etki) {
        dayaniklilik=dayaniklilik-etki;
        if (dayaniklilik<=0) {
            System.out.println("elendi");
        }
    }
}
