package org.platypus.framework.persistence.model.fields;


import org.platypus.framework.persistence.model.fields.basic.DateTimeField;
import org.platypus.framework.persistence.model.fields.basic.IntField;
import org.platypus.framework.persistence.model.fields.basic.StringField;

import java.time.LocalDateTime;

public interface Record {

    IntField id();
    void id(long id);
    void id(IntField id);

    DateTimeField createDate();
    void createDate(LocalDateTime createDate);
    void createDate(DateTimeField createDate);

    DateTimeField writeDate();
    void writeDate(LocalDateTime createDate);
    void writeDate(DateTimeField createDate);

    StringField displayName();
    void displayName(String name);
    void displayName(StringField name);

    StringField code();
    void code(String code);
    void code(StringField code);

    <T extends Record> T unWrap(Class<T> type);


}
