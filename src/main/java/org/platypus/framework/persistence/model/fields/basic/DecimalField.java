package org.platypus.framework.persistence.model.fields.basic;

import java.math.BigDecimal;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public interface DecimalField extends UnmutableDecimalField{


    void set(BigDecimal date);
}
