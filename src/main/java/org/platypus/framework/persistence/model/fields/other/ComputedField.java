package org.platypus.framework.persistence.model.fields.other;

import org.platypus.framework.persistence.Record;

import java.util.function.Consumer;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
@FunctionalInterface
public interface ComputedField<R extends Record> extends Consumer<R> {
}
