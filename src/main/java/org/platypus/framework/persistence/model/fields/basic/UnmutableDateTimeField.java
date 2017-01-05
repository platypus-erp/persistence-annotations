package org.platypus.framework.persistence.model.fields.basic;

import java.time.LocalDateTime;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface UnmutableDateTimeField extends BasicField{
    LocalDateTime get();
}
