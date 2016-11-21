package org.platypus.framework.persistence.model.fields.relation.def;

import org.platypus.framework.persistence.model.BaseModel;
import org.platypus.framework.persistence.model.fields.Bool;

/**
 * Copy of {@linkplain javax.persistence.OneToMany @OneToMany}
 * Used to generate Entity class for the platypus framework
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public @interface OneToManyFieldDefinition {
    String DEFAULT = "__DEFAULT__VALUE__";

    /**
     * The target model for the relation.
     *
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
     * (Optional) a where clause add to the relation
     */
    String where() default DEFAULT;

    Bool required() default Bool.DEFAULT;
}
