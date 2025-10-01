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
        String sqlStr = Console.readString("Input sql command:");

        try(Statement statement = new Statement(sqlStr); DatabaseConnection connection = new DatabaseConnection(url, username, password, statement)) {

            connection.insert();
        }
        catch (IOException ex) {
            Console.writeLine("Error occurred:%s", ex.getMessage());
        }

        Console.writeLine("C and System programmers association");
    }
}

class Statement implements Closeable {
    private final String m_sqlCmd;

    public Statement(String sqlCmd) throws IOException
    {
        Console.writeLine("Prepare statement");

        if (sqlCmd == null || sqlCmd.isBlank())
            throw new IOException("sqlCmd can not be null");

        m_sqlCmd = sqlCmd;
    }

    public String getSqlCmd()
    {
        return m_sqlCmd;
    }

    public void close() throws IOException
    {
        Console.writeLine("Close statement");
    }
}


class DatabaseConnection implements Closeable {
    private String m_url;
    private String m_username;
    private String m_password;
    private Statement m_statement;

    private void checkInformation(String url, String username, String password, Statement statement) throws IOException
    {
        if (url == null || url.isBlank() || username == null || username.isBlank() || password == null || statement == null)
            throw new IOException("Illegal connection parameters");
    }

    public DatabaseConnection(String url, String username, String password, Statement statement) throws IOException
    {
        checkInformation(url, username, password, statement);
        m_url = url;
        m_username = username;
        m_password = password;
        m_statement = statement;
        Console.writeLine("Connection to '%s' succeed with user:%s", url, username);
    }

    public void insert() throws IOException
    {
        Console.writeLine("'%s' sent to %s", m_statement.getSqlCmd(), m_url);
    }

    public void close() throws IOException
    {
        Console.writeLine("Close database connection");
    }
}
