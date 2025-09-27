package org.csystem.subject.interfaces.demo;

import org.csystem.util.console.Console;

import java.io.Closeable;
import java.io.IOException;

public class DatabaseDemoApp {
    public static void main(String[] args)
    {
        Demo.run();
    }
}

class Demo {
    public static void run()
    {
        String url = Console.readString("Input url:");
        String username = Console.readString("Input username:");
        String password = Console.readString("Input password:");

        DatabaseConnection connection = null;
        try {
            connection = new DatabaseConnection(url, username, password);
            String sqlStr = Console.readString("Input sql command:");
            connection.insert(sqlStr);
        }
        catch (IOException ex) {
            Console.writeLine("Error occurred:%s", ex.getMessage());
        }
        finally {
            if (connection != null)
                try {
                    connection.close();
                }
                catch (IOException ignore) {

                }
        }

        Console.writeLine("C and System programmers association");
    }
}

class DatabaseConnection implements Closeable {
    private String m_url;
    private String m_username;
    private String m_password;

    private void checkInformation(String url, String username, String password) throws IOException
    {
        if (url == null || url.isBlank() || username == null || username.isBlank() && password == null)
            throw new IOException("Illegal connection parameters");
    }

    public DatabaseConnection(String url, String username, String password) throws IOException
    {
        checkInformation(url, username, password);
        m_url = url;
        m_username = username;
        m_password = password;
        Console.writeLine("Connection to '%s' succeed with user:%s", url, username);
    }

    public void insert(String sqlStr) throws IOException
    {
        if (sqlStr == null || sqlStr.isBlank())
            throw new IOException("sqlStr can not be null");

        Console.writeLine("'%s' sent to %s", sqlStr, m_url);
    }

    public void close() throws IOException
    {
        Console.writeLine("Close connection");
    }
}
