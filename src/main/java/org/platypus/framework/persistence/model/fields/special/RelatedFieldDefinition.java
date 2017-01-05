package org.platypus.framework.persistence.model.fields.special;


import org.platypus.framework.persistence.model.fields.Bool;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public @interface RelatedFieldDefinition {

    /**
     * The path to the value
     */
    String[] value();

    Bool store() default Bool.DEFAULT;

    Bool readonly() default Bool.DEFAULT;
}
