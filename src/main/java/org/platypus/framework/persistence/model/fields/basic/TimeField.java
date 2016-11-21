package org.platypus.framework.persistence.model.fields.basic;

import java.time.LocalTime;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public interface TimeField {
    LocalTime get();

    void set(LocalTime date);
}
