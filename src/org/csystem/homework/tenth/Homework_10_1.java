package org.csystem.homework.tenth;

/*----------------------------------------------------------------------------------------------------------------------
	Homework-010-1.sorunun çözümü
-----------------------------------------------------------------------------------------------------------------------*/

public class Homework_10_1 {
    public static void main(String[] args)
    {
        run();
    }

    public static void print(boolean [] flag)
    {
        for(int i = 1; i < flag.length; ++i)
            if(!flag[i])
                System.out.printf("%d ",i);
    }

    public static void run()
    {
        boolean [] flagDoors = new boolean[101];
//        int [] keys = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i = 2; i < 21; ++i) // keys  to do: (key can start from 2)
            for(int k = i; k < flagDoors.length; ++k) // doors
                // k = 30
                // to do: k/2 <= i Bir sayiyi yarisindan sonrasi kesinlikle bolemez
                // k <= i / 2
                // k / 2 <= i
                if(k % i == 0)
                    flagDoors[k] = !flagDoors[k];

        print(flagDoors);
    }
}
