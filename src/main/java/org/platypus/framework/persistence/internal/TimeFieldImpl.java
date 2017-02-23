package org.platypus.framework.persistence.internal;

import org.platypus.framework.persistence.internal.api.AbstractFieldImpl;
import org.platypus.framework.persistence.model.fields.basic.TimeField;

import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class TimeFieldImpl<T> extends AbstractFieldImpl<T,LocalTime> implements TimeField {

    public TimeFieldImpl(T instance, Function<T, LocalTime> getter, BiConsumer<T, LocalTime> setter) {
        super(instance, getter, setter);
    }
}
