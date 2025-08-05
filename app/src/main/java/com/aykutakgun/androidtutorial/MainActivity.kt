package com.aykutakgun.androidtutorial

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("--------Değişken ve Sabitler---------")
        //variable : Değişken,Değeri sonradan değişebilir.
        var x = 10
        println(x)

        x=30
        println(x)

        //Value : Değer-Sabit, ilk atamadan sonra değer değiştirilemez.
        val y=20
        println(y)
        // y=15 Değer ataması yapıldıktan sonra bu sekilde yazıldığında hata verecektir.

        println("------------Tam Sayılar------------")
        //explicit : Açık bir şekilde tanımlama

        var ornekShort  : Short = 20
        var ornekByte   : Byte=30
        var ornekInt    : Int=15

        //implicit : Kotlinin algıladığı ona bıraktığımız tanımlama

        val z= 20
        // z int görünecektir.
        println("$z bu deger bir int'dir")
        var n = "Kotlin"
        // n String görünecektir.
        println("$n bu deger bir stringdir")

        println("----------------Double&Float---------------------")

        val pi=3.14
        //pi değer türü double olarak kotlin tarafından tanımlanır.
        println(pi)

        println(pi*2)

        val ornekDouble=3.0
        val sonucDouble=pi*ornekDouble
        println(sonucDouble)

        val ornekFloat : Float = 2.25f
        println(ornekFloat*2)



        println("----------------Unsigned Integer-----------------")
        //Pozitif olduğunu düşündüğümüz degerler için gecerli
        println("val unsignedByte : UByte =10u")
        println("val unsignedShort : UShort = 10u")
        println("val unsignedInteger : UInt = 10u")
        println("val unsignedLong : ULong =10u")

        println("----------------Degisken Isimlendirme------------")
        //camelCase
        //snake_case
        val kullaniciYasi=15
        val kullanici_yasi=14
        println(kullaniciYasi)
        println(kullanici_yasi)

        println("-------------------Strings-----------------------")
        val benimString="Benim String'im"
        println(benimString)

        val isim="Aykut"
        println(isim.uppercase()) //Bütün karakterleri büyük yapar

        val soyisim="akgün"
        println(isim+" "+soyisim)

        println("-----------------Dönüşüm ve init,initalize,initialization--------")
        val yas ="15"

        //Conversion
        val yasInt=yas.toInt()
        println(yasInt)
        println(yas.toInt())

        println("-----------Boolean------------")
        var benimBool:Boolean=true
        benimBool=false

        var kullaniciYas="35"
        println(kullaniciYas.toInt()>18)

        // <    küçüktür
        // >    büyüktür
        // <=   küçük eşit
        // >=   büyük eşit
        // ==   eşittir
        // !=   eşit değildir
        // &&   ve
        // ||   veya

        println("aykut"=="aykut")
        println(10 != 10)
        println(4>3 && 3>5)
        println(4>3 || 3>5)

        println("--------------Array---------------")

        val stringOrnegi="aykut"

        val benimDizim= arrayOf(stringOrnegi,"akgun","azra","cagri","goktug")
        println(benimDizim[0])
        println(benimDizim[1])
        println(benimDizim.last()) //sonuncu index değeri gelir

        benimDizim[1]="sam" //1.index değişir,val olmasına rağmen çünkü burada val olarak benimDizim dizisi tanımlı içeriği değil içerik değişebilir

        println(benimDizim[1])
        println(benimDizim.get(3)) //3.indeks değeri gelir

        val numaraDizisi= arrayOf(1,2,5,6,12,22)
        println(numaraDizisi[3]*10)

        println("--------------ArrayList------------")

        val isimListesi= arrayListOf("aykut","akgün","azra","cagri","goktug")

        isimListesi.add("ahmet") //listenin sonuna ekleme yapar
        println(isimListesi[0])
        println(isimListesi[1])
        println(isimListesi[2])
        val karisikListe= arrayListOf(7,5,4,"aykut")


        val numaralistesi= arrayListOf(1,2,3,5,16)
        val digerOrnekListe=ArrayList<Int>()
        //ikiside list tanımlamada kullanılır
        //1.list olustururken değerleri ile olustururuz
        //2.list olusturup içeriğinin tipini belirtip değerleri sonradan verebilirz

        digerOrnekListe.add(5)
        digerOrnekListe.add(20)
        digerOrnekListe.add(10)

        println(numaralistesi[1]* digerOrnekListe[0])




    }
}