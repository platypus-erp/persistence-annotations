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
public @interface IntFieldDefinition {
    String DEFAULT = "__DEFAULT__VALUE__";
    /**
     * (Optional) Whether the column is included in SQL INSERT
     * statements generated by the persistence provider.
     */
    Bool insertable() default Bool.DEFAULT;

    /**
     * (Optional) Whether the column is included in SQL UPDATE
     * statements generated by the persistence provider.
     */
    Bool updatable() default Bool.DEFAULT;

    /**
     * (Optional) The documentation put in the SQL column comment
     */
    String columnDoc() default DEFAULT;

    /**
     * (Optional) If the this column will be unique,<br>
     * if an another field use the same hint(case insensitive)<br>
     * the the SQL Unique constraint will be above the two column<br>
     * The Unique constraint name will be UK_<target>_<hint> (ex :  UK_PARTNER_EMAIL)<br>
     * <bold>Warning</bold> if the default value is the same for all same hint value a compile error will be throw<br>
     * To erase the unique constraint set the hint to the default value witch is ""<br>
     */
    String uniqueHint() default DEFAULT;

    /**
     * (Optional) Only if you want to erase all the definition of this field defined in other module
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

    int defaultValue() default Integer.MIN_VALUE;
    int min() default Integer.MIN_VALUE;
    int max() default Integer.MAX_VALUE;
}
