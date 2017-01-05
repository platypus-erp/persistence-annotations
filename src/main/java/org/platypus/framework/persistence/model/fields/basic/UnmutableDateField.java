package org.platypus.framework.persistence.model.fields.basic;

import java.time.LocalDate;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public interface UnmutableDateField extends BasicField{
    LocalDate get();
}
