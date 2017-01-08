package org.platypus.framework.persistence;

import org.platypus.framework.persistence.model.fields.Record;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface Pool {

    <R extends Record> R create(Class<R> tClass);
}
