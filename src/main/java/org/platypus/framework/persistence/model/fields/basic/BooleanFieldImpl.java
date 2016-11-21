package org.platypus.framework.persistence.model.fields.basic;

import org.platypus.framework.persistence.model.BaseModel;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public class BooleanFieldImpl<E extends BaseModel> implements BooleanField {

    private StringField name;
    private Function<E, java.lang.Boolean> get;
    private BiConsumer<E, java.lang.Boolean> set;
    private E entity;

    @Override
    public void set(boolean value) {
        set.accept(entity, value);
    }

    @Override
    public boolean get() {
        return get.apply(entity);
    }

    public static class Builder<E extends BaseModel> {
        private final StringField name;
        private Function<E, java.lang.Boolean> get;
        private BiConsumer<E, java.lang.Boolean> set;

        public Builder(StringField name) {
            this.name = name;
            this.get = get;
            this.set = set;
        }

        public BooleanFieldImpl.Builder<E> getter(Function<E, java.lang.Boolean> get) {
            this.get = get;
            return this;
        }

        public BooleanFieldImpl.Builder<E> setter(BiConsumer<E, java.lang.Boolean> set) {
            this.set = set;
            return this;
        }

        public BooleanFieldImpl<E> build(E entity) {
            BooleanFieldImpl<E> impl = new BooleanFieldImpl<>();
            impl.get = this.get;
            impl.set = this.set;
            impl.name = this.name;
            impl.entity = entity;
            return impl;
        }
    }
}
