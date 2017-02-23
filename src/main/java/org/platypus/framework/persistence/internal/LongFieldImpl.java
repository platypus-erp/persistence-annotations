package org.platypus.framework.persistence.internal;

import org.platypus.framework.persistence.internal.api.AbstractFieldImpl;
import org.platypus.framework.persistence.model.fields.basic.LongField;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class LongFieldImpl<T> extends AbstractFieldImpl<T,Long> implements LongField {

    public LongFieldImpl(T instance, Function<T, Long> getter, BiConsumer<T, Long> setter) {
        super(instance, getter, setter);
    }
}
