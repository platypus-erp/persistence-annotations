package org.platypus.framework.persistence.model.fields.basic;

import java.time.LocalDateTime;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public interface DateTimeField extends UnmutableDateTimeField{

    void set(LocalDateTime date);
}
