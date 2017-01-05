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
public @interface BigStringFieldDefinition {
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
     * (Optional) <br> Only if you want to erase all the definition of this field defined in other module
     */
    boolean eraseWithYours() default false;

    /**
     * (Optional) <br> Define if this field can be <code>null</code> when the model is inserted or updated
     */
    Bool required() default Bool.DEFAULT;

    /**
     * (Optional) <br> Define if the value of this field can be change
     */
    Bool readonly() default Bool.DEFAULT;
    /**
     * (Optional) <br> Define if this field is load lazily or not
     */
    Bool lazy() default Bool.DEFAULT;
}
