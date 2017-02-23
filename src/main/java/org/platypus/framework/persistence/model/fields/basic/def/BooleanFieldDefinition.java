package org.platypus.framework.persistence.model.fields.basic.def;

import org.platypus.framework.persistence.model.fields.Bool;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public @interface BooleanFieldDefinition {
    String DEFAULT = "__DEFAULT__VALUE__";

    /**
     * (Optional) <br> Define if this field can be persisted<br>
     * The default value is equivalent to <code>true</code> if unset when the model will be generated<br>
     *  Warning: if you define a field with insertable={@linkplain Bool#FALSE} and required={@linkplain Bool#TRUE}<br>
     *  without a {@linkplain BooleanFieldDefinition#defaultValue() defaultvalue} a error when the persist statement will be always throw
     */
    Bool insertable() default Bool.DEFAULT;

    /**
     * (Optional) <br> Define if this field can be updated<br>
     * The default value is equivalent to <code>true</code> if unset when the model will be generated<br>
     * when you inherit of a model the value will be define to the last value or <code>true</code>
     */
    Bool updatable() default Bool.DEFAULT;

    /**
     * (Optional) <br> The documentation put in the SQL column comment <br>
     * The default value is equivalent to an empty string <code>""</code>if unset when the model will be generated
     */
    String columnDoc() default DEFAULT;

    /**
     * (Optional) <br> If the this column will be unique,<br>
     * if an another field use the same hint(case insensitive)<br>
     * the the SQL Unique constraint will be above the two column<br>
     * The Unique constraint name will be UK_<target>_<hint> (ex :  UK_PARTNER_EMAIL)<br>
     * <bold>Warning</bold> if the default value is the same for all same hint value a compile error will be throw<br>
     * To erase the unique constraint set the hint to <code>""</code><br>
     */
    String uniqueHint() default DEFAULT;

    /**
     * (Optional) <br> Only if you want to erase all the definition of this field defined in other module
     */
    boolean eraseWithYours() default false;

    /**
     * (Optional) <br>
     * The default value, only set before the persist or update of the model
     */
    Bool defaultValue() default Bool.DEFAULT;
}
