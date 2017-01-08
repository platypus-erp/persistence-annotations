package org.platypus.framework.persistence.model.fields.basic;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface BinaryField extends UnmutableBinaryField{

    void set(byte[] content);
}
