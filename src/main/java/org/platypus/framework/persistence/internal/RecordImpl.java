package org.platypus.framework.persistence.internal;

import org.platypus.framework.persistence.internal.api.AbstractFieldImpl;
import org.platypus.framework.persistence.internal.api.GenericField;
import org.platypus.framework.persistence.model.fields.Record;
import org.platypus.framework.persistence.model.fields.basic.DateTimeField;
import org.platypus.framework.persistence.model.fields.basic.IntField;
import org.platypus.framework.persistence.model.fields.basic.StringField;

import java.time.LocalDateTime;
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
    public IntField id() {
        return get().id();
    }

    @Override
    public void id(long id) {
        get().id(id);
    }

    @Override
    public void id(IntField id) {
        get().id(id);
    }

    @Override
    public DateTimeField createDate() {
        return get().createDate();
    }

    @Override
    public void createDate(LocalDateTime createDate) {
        get().createDate(createDate);
    }

    @Override
    public void createDate(DateTimeField createDate) {
        get().createDate(createDate);
    }

    @Override
    public DateTimeField writeDate() {
        return get().writeDate();
    }

    @Override
    public void writeDate(LocalDateTime writeDate) {
        get().writeDate(writeDate);
    }

    @Override
    public void writeDate(DateTimeField writeDate) {
        get().writeDate(writeDate);
    }

    @Override
    public StringField displayName() {
        return get().displayName();
    }

    @Override
    public void displayName(String displayName) {
        get().displayName(displayName);
    }

    @Override
    public void displayName(StringField displayName) {
        get().displayName(displayName);
    }

    @Override
    public StringField code() {
        return get().code();
    }

    @Override
    public void code(String code) {
        get().code(code);
    }

    @Override
    public void code(StringField code) {
        get().code(code);
    }

    @Override
    public <T extends Record> T unWrap(Class<T> type) {
        return type.cast(instance);
    }
}
