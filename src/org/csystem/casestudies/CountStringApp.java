package org.csystem.casestudies;


/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı iki yazıdan birinci içerisinde ikincisinden kaç olduğuna geri dönen
    countString ve countStringIgnoreCase isimli metotlari StringUtil isimli bir sınıf içerisinde yazınız ve aşağıdaki kod ile test ediniz.
-----------------------------------------------------------------------------------------------------------------------*/

public class CountStringApp {
    public static void main(String[] args)
    {
        run();
    }
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Birinci yazıyı giriniz:");
            String s1 = kb.nextLine();

            if ("elma".equals(s1))
                break;

            System.out.print("İkinci yazıyı giriniz:");
            String s2 = kb.nextLine();

            System.out.printf("Count:%d%n", countString(s1, s2));
            System.out.printf("Count (Ignore case):%d%n", countStringIgnoreCase(s1, s2));
        }
    }

    public static int countString(String s1, String s2)
    {
        int count = 0;
        int idx = -1;

        while ((idx = s1.indexOf(s2, idx + 1)) != -1)
            ++count;

        return count;
    }

    public static int countStringIgnoreCase(String s1, String s2)
    {
        return countString(s1.toLowerCase(), s2.toLowerCase());
    }
}
