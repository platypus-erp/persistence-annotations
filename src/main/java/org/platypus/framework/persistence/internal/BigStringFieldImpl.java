package org.platypus.framework.persistence.internal;

import org.platypus.framework.persistence.internal.api.AbstractFieldImpl;
import org.platypus.framework.persistence.model.fields.basic.BigStringField;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class BigStringFieldImpl<T> extends AbstractFieldImpl<T,String> implements BigStringField {

    public BigStringFieldImpl(T instance, Function<T, String> getter, BiConsumer<T, String> setter) {
        super(instance, getter, setter);
    }
}
