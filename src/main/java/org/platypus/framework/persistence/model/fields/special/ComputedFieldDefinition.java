package org.platypus.framework.persistence.model.fields.special;

import org.platypus.framework.persistence.model.fields.Bool;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public @interface ComputedFieldDefinition {
    Bool store() default Bool.DEFAULT;

}
