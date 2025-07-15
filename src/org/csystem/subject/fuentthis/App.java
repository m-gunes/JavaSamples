package org.csystem.subject.fuentthis;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        MyStringBuilder sb = new MyStringBuilder();

        while (true) {
            System.out.print("Input a text:");
            String s = kb.nextLine();

            if ("exit".equals(s))
                break;

            sb.append(s).append("-");
        }

        String str = sb. substring(0, sb.length() - 1);

        System.out.println(str);
    }
}

class MyStringBuilder {
    private final StringBuilder m_sb;

    public MyStringBuilder()
    {
        m_sb = new StringBuilder();
    }

    public MyStringBuilder append(String s)
    {
        m_sb.append(s);

        return this;
    }

    public int length()
    {
        return m_sb.length();
    }

    //...

    public String substring(int beginIndex, int endIndex)
    {
        return m_sb.substring(beginIndex, endIndex);
    }

    public String toString()
    {
        return m_sb.toString();
    }
}
