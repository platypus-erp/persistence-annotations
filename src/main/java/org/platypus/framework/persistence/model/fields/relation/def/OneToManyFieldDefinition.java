package org.platypus.framework.persistence.model.fields.relation.def;

import org.platypus.framework.persistence.model.BaseModel;
import org.platypus.framework.persistence.model.fields.Bool;

/**
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public @interface OneToManyFieldDefinition {
    String DEFAULT = "__DEFAULT__VALUE__";

    /**
     * The target Platypus model for the relation
     */
    Class<? extends BaseModel> value();
    /**
     * (Optional) Whether to apply the remove operation to entities that have
     * been removed from the relationship and to cascade the remove operation to
     * those entities.
     * @since Java Persistence 2.0
     */
    boolean orphanRemoval() default false;

    /**
     * (Optional) The operations that must be cascaded to
     * the target of the association.
     * <p> Defaults to no operations being cascaded.
     *
     * <p> When the target collection is a {@link java.util.Map
     * java.util.Map}, the <code>cascade</code> element applies to the
     * map value.
     */
    PlatypusCascadeType[] cascade() default {};

    /**
     * (Optional) <br> Define if this field can be empty when the model is inserted or updated
     */
    Bool required() default Bool.DEFAULT;

    /**
     * (Optional) <br> Define if a new relation can be add or if a existing relation can be removed
     */
    Bool readonly() default Bool.DEFAULT;
}
