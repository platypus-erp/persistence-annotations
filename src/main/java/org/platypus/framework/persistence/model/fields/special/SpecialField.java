package org.platypus.framework.persistence.model.fields.special;

import org.platypus.framework.persistence.Record;

import java.util.function.Consumer;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
@FunctionalInterface
public interface SpecialField<R extends Record> extends Consumer<R> {
}
