package org.platypus.framework.persistence.internal;

import org.platypus.framework.persistence.internal.api.AbstractFieldImpl;
import org.platypus.framework.persistence.model.fields.basic.BinaryField;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class BinaryFieldImpl<T> extends AbstractFieldImpl<T,byte[]> implements BinaryField {

    public BinaryFieldImpl(T instance, Function<T, byte[]> getter, BiConsumer<T, byte[]> setter) {
        super(instance, getter, setter);
    }
}
