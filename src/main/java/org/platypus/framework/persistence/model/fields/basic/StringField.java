package org.platypus.framework.persistence.model.fields.basic;


import org.platypus.framework.persistence.EmptyCheckable;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public interface StringField extends CharSequence, EmptyCheckable {

    void set(java.lang.String value);
    java.lang.String get();
}
