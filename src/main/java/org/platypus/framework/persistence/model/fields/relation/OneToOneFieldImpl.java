package org.platypus.framework.persistence.model.fields.relation;

import org.platypus.framework.persistence.Record;
import org.platypus.framework.persistence.model.BaseModel;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class OneToOneFieldImpl<E extends BaseModel, RS extends Record> {
    private String name;
    private Function<E, RS> get;
    private BiConsumer<E, RS> set;
    private E entity;

    public OneToOneFieldImpl(String name) {
        this.name = name;
        this.get = get;
        this.set = set;
    }

    public OneToOneFieldImpl<E, RS> getter(Function<E, RS> get) {
        this.get = get;
        return this;
    }

    public OneToOneFieldImpl<E, RS> setter(BiConsumer<E, RS> set) {
        this.set = set;
        return this;
    }

}
