package org.csystem.subject.singleton;


public class SingletonEagerImplementationApp {
    public static void main(String[] args)
    {
        SingletonEager s1 = SingletonEager.INSTANCE;
        SingletonEager s2 = SingletonEager.INSTANCE;

        System.out.println(s1 == s2);
    }
}

/**
 * Lazy implementasyondaki gibi nesneyi bir kez yaratan bir metot çağırılmaksızın,
 * sınıfın bir elemanı ilk kez kullanıldığında bu nesne yaratılır.
 */
class SingletonEager {
    public static final SingletonEager INSTANCE = new SingletonEager();
    //..
}

/**
 * Singleton bir sınıfın eager implemantasyonu enum sınıf ile daha basit ve etkin olarak yazılabilir.
 * Lazy implementation gerekmedikçe Java'da en iyi singleton implementasyonu enum ile yapılandır.
 * Çünkü bir kez yaratılır ve static olduğu için program boyunca yaşar.
 * <p></p>
 * Anahtar Notlar: Dikkat edilirse enum sabitleri ve gösterdikleri nesneler yaratıldıktan sonra program sonlanana kadar yaşarlar.
 * Bu durum nadir de olsa önemli bazı uygulamalarda bellek açısından dezavantajlı olabilmektedir.
 * Örneğin çok güçlü olmayan (limited) bir Android cihazın bellek kapasite de kullanımına göre sınırlı olabilir
 * ve yaratılan nesnelerin sürekli yaşamaması gerekebilir. Böylesi nadir ama önemli durumlarda enum sınıf kullanmak yerine
 * int türden değerler kullanmak uygun olabilmektedir. Bu durumda performans açısından okunabililrlikten/algılanabilirlikten vazgeçilmiş olur.
 */
enum EagerSingleton {
    INSTANCE;
    //..
}
