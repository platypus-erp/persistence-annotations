package org.platypus.framework.persistence.internal.api;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface GenericField<T> extends UnmutableGenericField<T>{

    void set(T value);
}
