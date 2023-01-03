
public class Makas extends Nesne{
    int aktif=0;
    Makas(int dayaniklilik,int seviyePuani,String []nesnelistesi){
        super(dayaniklilik,seviyePuani,nesnelistesi);
        this.nesneListesi=nesnelistesi;
    }
    Makas(int dayaniklilik,int seviyePuani){
        super(dayaniklilik,seviyePuani);
    }
    public float nesnePuaniGoster(){
        System.out.println("dayaniklilik:"+dayaniklilik);
        System.out.println("seviye puani:"+seviyePuani);
        return seviyePuani;
    }
    public float etkiHesapla() {
        makas_etkisi=(float) (keskinlik/(0.2*nufuz+0.8*katilik));
        return makas_etkisi;
    }
    public void seviyepuaniguncelle(){
        if(seviyePuani<30){
            seviyePuani+=20;
            if (seviyePuani>30) {
                System.out.println("makas nesnesi usta makasa terfi etti");
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
