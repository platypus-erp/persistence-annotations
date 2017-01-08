package org.platypus.framework.persistence.model.fields;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface Field {

    String getDeclaringName();
    String getSqlName();
    FieldType getFieldType();

    enum FieldType {
        BASIC,RELATION
    }

}
