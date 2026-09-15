package org.csystem.function;

import java.io.IOException;

public interface IPredicate<T> {
    boolean test(T t) throws IOException;
}
