package org.platypus.framework.persistence.model.fields;

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
public class FieldBuilder<E extends BaseModel, T> {
    private final String name;
    private final Class<T> type;
    private Function<E,T> get;
    private BiConsumer<E,T> set;
    private E entity;

    public FieldBuilder(String name, Class<T> type) {
        this.name = name;
        this.type = type;
        this.get = get;
        this.set = set;
    }

    public FieldBuilder<E,T> getter(Function<E, T> get) {
        this.get = get;
        return this;
    }

    public FieldBuilder<E, T> setter(BiConsumer<E, T> set) {
        this.set = set;
        return this;
    }

    public Field<E, T> build() {
        return null;
    }
}
