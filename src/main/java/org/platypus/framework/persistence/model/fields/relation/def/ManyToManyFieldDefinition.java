package org.platypus.framework.persistence.model.fields.relation.def;

import org.platypus.framework.persistence.model.BaseModel;
import org.platypus.framework.persistence.model.fields.Bool;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public @interface ManyToManyFieldDefinition {
    String DEFAULT = "__DEFAULT__VALUE__";

    Class<? extends BaseModel> value();

    /**
     * (Optional) a where clause add to the relation
     */
    String where() default DEFAULT;

    Bool required() default Bool.DEFAULT;
}
