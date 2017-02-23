package org.platypus.framework.persistence.model.fields.relation.def;

import org.platypus.framework.persistence.model.BaseModel;
import org.platypus.framework.persistence.model.fields.Bool;

/**
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public @interface OneToOneFieldDefinition {
    String DEFAULT = "__DEFAULT__VALUE__";
    /**
     * The target Platypus model for the relation
     */
    Class<? extends BaseModel> value();

    /**
     * The mapped relation in the target model
     * @see OneToOneFieldDefinition#value()
     * if unset then a coloumn will be created in this model.
     */
    String mappedBy() default DEFAULT;

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
     * (Optional) If the this column will be unique,<br>
     * if an another field use the same hint(case insensitive)<br>
     * the the SQL Unique constraint will be above the two column<br>
     * The Unique constraint name will be UK_<target>_<hint> (ex :  UK_PARTNER_EMAIL)<br>
     * <bold>Warning</bold> if the default value is the same for all same hint value a compile error will be throw<br>
     * To erase the unique constraint set the hint to the default value witch is ""<br>
     */
    String uniqueHint() default DEFAULT;

    /**
     * (Optional) <br> Only if you want to erase all the definition of this field defined in other module
     */
    boolean eraseWithYours() default false;

    /**
     * (Optional) The operations that must be cascaded to
     * the target of the association.
     * <p>
     * <p> By default no operations are cascaded.
     */
    PlatypusCascadeType[] cascade() default PlatypusCascadeType.DEFAULT;

    /**
     * (Optional) Define if the field can be <code>null</code>
     */
    Bool required() default Bool.DEFAULT;

}
