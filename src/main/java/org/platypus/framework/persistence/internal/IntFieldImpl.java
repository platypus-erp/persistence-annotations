package org.platypus.framework.persistence.internal;

import org.platypus.framework.persistence.internal.api.AbstractFieldImpl;
import org.platypus.framework.persistence.model.fields.basic.IntField;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class IntFieldImpl<T> extends AbstractFieldImpl<T,Integer> implements IntField {

    public IntFieldImpl(T instance, Function<T, Integer> getter, BiConsumer<T, Integer> setter) {
        super(instance, getter, setter);
    }
}
