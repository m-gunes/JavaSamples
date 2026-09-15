package org.csystem.app.io.file.copy;

import org.csystem.function.IPredicate;

import java.io.IOException;
import java.nio.file.Path;

public class BackupViaPrompt implements IPredicate<Path> {
    @Override
    public boolean test(Path path) throws IOException
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
