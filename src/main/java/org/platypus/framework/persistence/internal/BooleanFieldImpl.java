package org.platypus.framework.persistence.internal;

import org.platypus.framework.persistence.internal.api.AbstractFieldImpl;
import org.platypus.framework.persistence.model.fields.basic.BooleanField;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class BooleanFieldImpl<T> extends AbstractFieldImpl<T,Boolean> implements BooleanField {

    public BooleanFieldImpl(T instance, Function<T, Boolean> getter, BiConsumer<T, Boolean> setter) {
        super(instance, getter, setter);
    }
}
