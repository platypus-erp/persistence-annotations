package org.platypus.framework.persistence.internal;

import org.platypus.framework.persistence.internal.api.AbstractFieldImpl;
import org.platypus.framework.persistence.model.fields.basic.DateField;

import java.time.LocalDate;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class DateFieldImpl<T> extends AbstractFieldImpl<T,LocalDate> implements DateField {

    public DateFieldImpl(T instance, Function<T, LocalDate> getter, BiConsumer<T, LocalDate> setter) {
        super(instance, getter, setter);
    }
}
