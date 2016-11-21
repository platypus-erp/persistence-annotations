package org.platypus.framework.persistence.model.fields.basic;

import org.platypus.framework.persistence.model.BaseModel;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public final class StringFieldImpl<E extends BaseModel> implements StringField {

    private java.lang.String name;
    private Function<E, java.lang.String> get;
    private BiConsumer<E, java.lang.String> set;
    private E entity;

    @Override
    public void set(java.lang.String value) {
        set.accept(entity, value);
    }

    @Override
    public java.lang.String get() {
        return get.apply(entity);
    }

    private java.lang.String getDefault() {
        return isNotEmpty() ? get() : "";
    }

    @Override
    public int length() {
        return getDefault().length();
    }

    @Override
    public char charAt(int index) {
        return getDefault().charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return getDefault().subSequence(start, end);
    }

    @Override
    public java.lang.String toString() {
        return getDefault();
    }

    @Override
    public boolean isEmpty() {
        return getDefault().isEmpty();
    }

    @Override
    public boolean isNotEmpty() {
        return !isEmpty();
    }

    @Override
    public IntStream chars() {
        return getDefault().chars();
    }

    @Override
    public IntStream codePoints() {
        return getDefault().codePoints();
    }

    public static class Builder<E extends BaseModel> {
        private final java.lang.String name;
        private Function<E, java.lang.String> get;
        private BiConsumer<E, java.lang.String> set;

        public Builder(java.lang.String name) {
            this.name = name;
            this.get = get;
            this.set = set;
        }

        public StringFieldImpl.Builder<E> getter(Function<E, java.lang.String> get) {
            this.get = get;
            return this;
        }

        public StringFieldImpl.Builder<E> setter(BiConsumer<E, java.lang.String> set) {
            this.set = set;
            return this;
        }

        public StringField build(E entity) {
            StringFieldImpl<E> impl = new StringFieldImpl<>();
            impl.get = this.get;
            impl.set = this.set;
            impl.name = this.name;
            impl.entity = entity;
            return impl;
        }
    }
}
