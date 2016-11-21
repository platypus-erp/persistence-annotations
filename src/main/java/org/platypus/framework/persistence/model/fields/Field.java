package org.platypus.framework.persistence.model.fields;

import org.platypus.framework.persistence.model.BaseModel;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public interface Field<E extends BaseModel, T> {


    void set(T value);
    T get();

}
