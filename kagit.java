/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmet
 */
public class kagit extends Nesne{
    int aktif=0;
    kagit(int dayaniklilik,int seviyePuani){
        super(dayaniklilik,seviyePuani);
    }
    kagit(int dayaniklilik,int seviyePuani,String []nesnelistesi){
        super(dayaniklilik,seviyePuani,nesnelistesi);
        this.nesneListesi=nesnelistesi;
    }
    public float nesnePuaniGoster(){
        System.out.println("dayaniklilik:"+dayaniklilik);
        System.out.println("seviye puani:"+seviyePuani);
        return seviyePuani;
    }
    public float etkiHesapla() {
        kagit_etkisi=(float) (nufuz/(0.2*katilik+0.8*keskinlik));        
        return kagit_etkisi;
    }
    public void seviyepuaniguncelle(){
        if(seviyePuani<30){
            seviyePuani+=20;
            if (seviyePuani>30) {
                System.out.println("kagit nesnesi ozel kagita terfi etti");
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
