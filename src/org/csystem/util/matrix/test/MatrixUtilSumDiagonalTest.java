package org.csystem.util.matrix.test;


/*----------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı bir kare matrisin esas köşegeni (diagonal) üzerindeki elemanların
    toplamına geri dönen sumDiagonal isimli metodu MatrixUtil içerisinde yazınız ve test ediniz.

    Açıklamalar:
    Metot parametresi ile aldığı referansa ilişkin dizi dizisinin kare matris olup olmadığını kontrol etmeyecektir.
    Bir kare matrisin esas köşegeni üzerindeki elemanlar, matrisin n x n lik ise  sırasıyla a[0][0], a[1][1], ..., a[n - 1][n - 1] elemanlarıdır.
    Metot taşmaları düşünmeden long türüne geri dönecektir.
----------------------------------------------------------------------------------------------------------------*/

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;
import java.util.Scanner;

public class MatrixUtilSumDiagonalTest {
    public static void run()
    {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Bir sayi giriniz:");
            int n = Integer.parseInt(kb.nextLine());
            if(n <= 0)
                break;

            int [][] a = MatrixUtil.generateRandomSquareMatrix(random, n, 0, 10);
            ArrayUtil.print(a, 2);

            System.out.printf("Esas köşegen toplamı: %d%n", MatrixUtil.sumDiagonal(a));
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
