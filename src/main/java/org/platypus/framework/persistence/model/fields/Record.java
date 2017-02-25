package org.platypus.framework.persistence.model.fields;


import org.platypus.framework.persistence.model.fields.basic.LongField;
import org.platypus.framework.persistence.model.fields.basic.UnmutableDateTimeField;
import org.platypus.framework.persistence.model.fields.basic.UnmutableStringField;

public interface Record {

    LongField id();
    void id(LongField id);

    UnmutableDateTimeField createDate();

    UnmutableDateTimeField writeDate();

    UnmutableStringField displayName();

    default <T extends Record> T unWrap(Class<T> type){
        if (type != this.getClass()) {
            throw new IllegalArgumentException("the unwrap type is wrong expected [" + this.getClass().getName() + "] actual [" + type.getName() + "]");
        }
        return (T) this;
    }
}
