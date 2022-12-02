package StaticFactoryMethods_Vs_Constructor;
// yemek sınıfının constructırı çağırılınca alt türünde bir obje oluşturmasını istersek bunu
// nasıl yapabiliriz ?
public class Yemek {

    // constructor
    public Yemek() {
        // return new Pide();  // constructor içinde alt sınıflara ulaşamıyorum !!!
        // çünki constructırların return değeri olmuyor
    }

    // Static Factory Method
    public static Yemek sogukYemek() {
        return new Pide() ; // static metod kullanarak alt türden bir obje döndürebiliyorum..
    }
    /*
    static factory method = static olarak tanımlanmalı ve aynı türde bir obje döndürmeli.
    static factory method kullanımının yararları :
    1--> alt tipde veya farklı bir tipde obje üretip döndürebiliyorum.
    2--> Metod ismi class isminden farklı yapabiliyorum, daha anlamlı bir isim koyabiliyorum,
    yukardaki örnekte, sogukYemek() metodunun soğuk bir yemek döndüreceğini belirttiğim gibi


    */

}
