package jmegaparsec.support;

import javax.annotation.Nonnull;

public interface Semigroup<E> {
    @Nonnull E sconcat(@Nonnull E first, E other);
}
