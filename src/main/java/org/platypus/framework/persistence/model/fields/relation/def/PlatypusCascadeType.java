package org.platypus.framework.persistence.model.fields.relation.def;

/**
 * Defines the set of cascadable operations that are propagated
 * to the associated entity.
 * The value <code>cascade=ALL</code> is equivalent to
 * <code>cascade={PERSIST, MERGE, REMOVE, REFRESH, DETACH}</code>.
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public enum PlatypusCascadeType {
    /**
     * Default value is None
     */
    DEFAULT,
    /**
     * Never cascade operation
     **/
    NONE,
    /**
     * Cascade all operations
     */
    ALL,

    /**
     * Cascade persist operation
     */
    PERSIST,

    /**
     * Cascade merge operation
     */
    MERGE,

    /**
     * Cascade remove operation
     */
    REMOVE,

    /**
     * Cascade refresh operation
     */
    REFRESH,

    /**
     * Cascade detach operation
     *
     * @since Java Persistence 2.0
     */
    DETACH
}
