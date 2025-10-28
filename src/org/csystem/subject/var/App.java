package org.csystem.subject.var;

public class App {
    public static void main(String[] args) {
        var a = 10;
        var b = 3.4;
        var c = "Ankara";
        var e = 3.4f;
        // e = 3.4; // error

        double f = 3; //implicit conversion. int'in double convert edilmesidir.

        // var g; // bildirim noktasinda ilk deger verilmeli. initialization! ilk kez deger vermenizi beklemiyor.
        // initialization(ilk deger verme) ile ilk kez deger verme ayni sey degil.
        // g = 30;

        ++a;
        --b;
        // ++c; // error
    }
}
