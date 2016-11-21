package org.platypus.framework.persistence.model.fields.other;

import org.platypus.framework.persistence.model.fields.Bool;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public @interface ComputedFieldDefinition {
    Bool store() default Bool.DEFAULT;

}
