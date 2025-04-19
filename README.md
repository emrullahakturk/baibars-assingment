
Bu proje, bir insansız hava aracından (UAV) gelen uçuş verilerini sahte (mock) veri kullanarak Android cihazda izlemeye yönelik bir yer kontrol istasyonu simülasyonudur.

## 📱 Uygulama Özellikleri

- Gerçek bağlantı gerektirmeden **sahte veri akışı** ile çalışır.
- **Batarya voltajı**, **irtifa**, **GPS koordinatları** ve **uçuş süresi** gibi verileri gösterir.
- Veriler **her saniye canlı olarak** güncellenir.
- **MVVM mimarisi**, **Navigation Component** ve **StateFlow** kullanılmıştır.
- Minimum desteklenen Android sürümü: **API 26 (Android 8.0)**

---

## 🧑‍💻 Kullanılan Teknolojiler ve Kütüphaneler

- Kotlin
- MVVM Architecture
- StateFlow + Coroutines
- Navigation Component
- ViewBinding
- ConstraintLayout
---

## 🔄 Sahte (Mock) Veri Nasıl Üretiliyor?

Sahte veri üretimi, `FakeUavDataRepository` sınıfı ile sağlanmaktadır.  
Bu sınıf, her saniyede bir:
- Rastgele bir batarya voltajı (örneğin: 16.2V)
- Rastgele bir irtifa (örneğin: 120m)
- Rastgele bir GPS koordinatı
- Uçuş süresi (her saniye artan formatlı zaman)

oluşturarak bir `Flow<UavData>` akışı sağlar. Bu veriler ViewModel üzerinden UI’a iletilir.

---
