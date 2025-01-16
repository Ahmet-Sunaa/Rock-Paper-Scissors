# Taş-Kağıt-Makas Oyunu

Bu proje, Kocaeli Üniversitesi Programlama Laboratuvarı I dersi kapsamında 2022-2023 Güz dönemi için geliştirilmiştir. Amaç, nesne yönelimli programlama yapısını anlayarak taş-kağıt-makas oyununu Java dilinde tasarlamaktır.

## Proje Özellikleri

1. **Oyun Modları**:
   - Kullanıcı-Bilgisayar
   - Bilgisayar-Bilgisayar

2. **Oyun Kuralları**:
   - Her oyuncunun başlangıçta taş, kağıt ve makastan oluşan 5 nesnesi bulunur.
   - Kullanıcı, seçimlerini kendisi yapar; bilgisayar ise rastgele seçim yapar.
   - Oyuncuların ellerindeki nesneler sırayla karşılaştırılır, dayanıklılık ve seviye puanı etkilenir.
   - Dayanıklılık sıfırlandığında nesne elenir.
   - Seviye puanı 30'u geçen nesneler bir üst sınıfa terfi eder:
     - Taş → Ağır Taş
     - Kağıt → Özel Kağıt
     - Makas → Usta Makas

3. **Oyunun Bitme Koşulları**:
   - Oyunculardan birinin tüm nesnelerinin tükenmesi.
   - Belirlenen maksimum hamle sayısına (varsayılan: 10) ulaşılması.

## Sınıflar ve Yapılar

### Temel Sınıflar
- **Nesne.java**:
  - Tüm oyun nesnelerinin temel özelliklerini ve metotlarını içerir.
  - Dayanıklılık ve seviye puanı gibi özelliklere sahiptir.

- **Oyuncu.java**:
  - Oyuncuların (kullanıcı ve bilgisayar) temel bilgilerini ve davranışlarını tanımlar.

- **oyun.java**:
  - Oyun akışını kontrol eder ve kullanıcı arayüzüyle bağlantıyı sağlar.

### Nesne Türleri
- **Taş (tas.java)**:
  - `dayaniklilik`, `seviyePuani`, `katilik` özellikleriyle gelir.
  - Ağır Taş'a (agirtas.java) terfi edebilir.

- **Kağıt (kagit.java)**:
  - `dayaniklilik`, `seviyePuani`, `nufuz` özelliklerine sahiptir.
  - Özel Kağıt'a (ozelkagit.java) terfi edebilir.

- **Makas (Makas.java)**:
  - `dayaniklilik`, `seviyePuani`, `keskinlik` özelliklerine sahiptir.
  - Usta Makas'a (UstaMakas.java) terfi edebilir.

### Oyuncu Türleri
- **Kullanıcı (kullanici.java)**:
  - Oyuncu adı ve ID bilgilerini içerir.
  - Kullanıcının seçim yapmasını sağlar.

- **Bilgisayar (bilgisayar.java)**:
  - Rastgele seçim yapar.
  - Skor ve nesne listelerini yönetir.

## Çalıştırma

1. **Gerekli Ortam**:
   - Java JDK (11 veya üzeri) yüklü olmalıdır.
   - Proje NetBeans veya Eclipse gibi bir IDE'de açılabilir.

2. **Başlatma**:
   - `oyun.java` dosyasını çalıştırarak oyunu başlatabilirsiniz.
   - Kullanıcı ve bilgisayar için seçim yaparak oyunu oynayın.

3. **Örnek Çıktılar**:
   - Oyunun çeşitli aşamalarında, skorlar ve seçimler ekranda görüntülenir.
   - Hamleler tamamlandığında kazanan belirlenir.

## Proje Mimarisi

- **Dosya Yapısı**:
  - `Nesne.java`, `Oyuncu.java`, `oyun.java`: Temel sınıflar
  - `tas.java`, `kagit.java`, `Makas.java`: Oyun nesneleri
  - `agirtas.java`, `ozelkagit.java`, `UstaMakas.java`: Alt sınıflar
  - `kullanici.java`, `bilgisayar.java`: Oyuncu türleri

- **Akış Diyagramı**:
  - Oyun sırası, kullanıcı ve bilgisayar seçimlerinden sonra etki hesaplamaları ve dayanıklılık güncellemelerini içerir.

## Geliştirici
- **Ahmet SUNA**
