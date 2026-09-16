package org.csystem.app.io.file.copy;

import org.csystem.function.IPredicate;
import org.csystem.util.console.Console;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupViaPrompt implements IPredicate<Path> {
    private char getOption()
    {
        char c;
        do
            c = Console.readChar("Backup file exists. Do you want to overwrite?", "Invalid char");
        while (c != 'y' && c != 'Y' && c != 'n' && c != 'N');

        return c;
    }

    @Override
    public boolean test(Path path) throws IOException
    {
        char option = getOption();

        if (option == 'y' || option == 'Y')
            Files.copy(path, Path.of("%s-bak".formatted(path.toString())), StandardCopyOption.REPLACE_EXISTING);

        return true;
    }
}
