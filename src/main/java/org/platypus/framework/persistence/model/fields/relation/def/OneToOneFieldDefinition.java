package org.platypus.framework.persistence.model.fields.relation.def;

import org.platypus.framework.persistence.model.BaseModel;
import org.platypus.framework.persistence.model.fields.Bool;

/**
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public @interface OneToOneFieldDefinition {

    /**
     * The target Platypus model for the relation
     */
    Class<? extends BaseModel> value();

    /**
     * (Optional) The operations that must be cascaded to
     * the target of the association.
     *
     * <p> By default no operations are cascaded.
     */
    PlatypusCascadeType[] cascade() default PlatypusCascadeType.DEFAULT;

    /**
     * (Optional) Define if the field can be <code>null</code>
     */
    Bool required() default Bool.DEFAULT;

    /**
     * (Optional) <br> Define if a new relation can be add or if the existing relation can be removed
     */
    Bool readonly() default Bool.DEFAULT;

}
