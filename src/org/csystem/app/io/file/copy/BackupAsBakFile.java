package org.csystem.app.io.file.copy;

import org.csystem.function.IPredicate;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupAsBakFile implements IPredicate<Path> {

    @Override
    public boolean test(Path path) throws IOException
    {
        Files.copy(path, Path.of("%s-bak".formatted(path.toString())), StandardCopyOption.REPLACE_EXISTING);
        return true;
    }
}
