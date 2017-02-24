package org.platypus.framework.persistence.internal;

import org.platypus.framework.persistence.internal.api.AbstractFieldImpl;
import org.platypus.framework.persistence.internal.api.GenericField;
import org.platypus.framework.persistence.model.fields.Record;
import org.platypus.framework.persistence.model.fields.basic.LongField;
import org.platypus.framework.persistence.model.fields.basic.UnmutableDateTimeField;
import org.platypus.framework.persistence.model.fields.basic.UnmutableStringField;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class RecordImpl<T extends Record, R extends Record, RI extends R> extends AbstractFieldImpl<T,RI> implements GenericField<RI>, Record{

    public RecordImpl(T instance, Class<RI> targetRecordImpl, Function<T, RI> getter, BiConsumer<T, RI> setter) {
        super(instance, getter, setter);
    }

    @Override
    public LongField id() {
        return get().id();
    }

//    @Override
//    public void id(long id) {
//        get().id(id);
//    }

    @Override
    public void id(LongField id) {
        get().id(id);
    }

    @Override
    public UnmutableDateTimeField createDate() {
        return get().createDate();
    }

    @Override
    public UnmutableDateTimeField writeDate() {
        return get().writeDate();
    }

    @Override
    public UnmutableStringField displayName() {
        return get().displayName();
    }
    @Override
    public <T extends Record> T unWrap(Class<T> type) {
        return type.cast(instance);
    }
}
