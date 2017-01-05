package org.platypus.framework.persistence.model.fields.relation.def;

import org.platypus.framework.persistence.model.BaseModel;
import org.platypus.framework.persistence.model.fields.Bool;

/**
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public @interface ManyToManyFieldDefinition {
    String DEFAULT = "__DEFAULT__VALUE__";

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
    PlatypusCascadeType[] cascade() default {};

    /**
     * (Optional) a where predicate add to the query when the relation is fetched
     */
    String where() default DEFAULT;

    /**
     * (Optional) an <code>ORDER BY "field_name" ASC</code> clause add to the query when the relation is fetched
     */
    String sortAsc() default DEFAULT;

    /**
     * (Optional) an <code>ORDER BY "field_name" DESC</code> clause add to the query when the relation is fetched
     */
    String sortDesc() default DEFAULT;

    /**
     * (Optional) <br> Define if this field can be empty when the model is inserted or updated
     */
    Bool required() default Bool.DEFAULT;

    /**
     * (Optional) <br> Define if a new relation can be add or if a existing relation can be removed
     */
    Bool readonly() default Bool.DEFAULT;
}
