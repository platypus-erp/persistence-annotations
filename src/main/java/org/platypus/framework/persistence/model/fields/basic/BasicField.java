package org.platypus.framework.persistence.model.fields.basic;


import org.platypus.framework.persistence.model.fields.Field;

public interface BasicField extends Field {

    @Override
    default FieldType getFieldType() {
        return FieldType.BASIC;
    }

    boolean isInsertable();

    boolean isUpdatable();

    boolean isRequired();

    boolean isReadonly();
}
