package org.platypus.framework.persistence.internal.api;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public abstract class AbstractFieldImpl<E, T> implements GenericField<T>{

    protected final E instance;
    private final Function<E, T> getter;
    private final BiConsumer<E, T> setter;

    public AbstractFieldImpl(E instance, Function<E, T> getter, BiConsumer<E, T> setter) {
        this.instance = instance;
        this.getter = getter;
        this.setter = setter;
    }

    @Override
    public T get() {
        return getter.apply(instance);
    }

    @Override
    public void set(T value) {
        setter.accept(instance, value);
    }
}
