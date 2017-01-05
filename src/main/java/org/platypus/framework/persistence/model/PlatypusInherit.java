package org.platypus.framework.persistence.model;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public @interface PlatypusInherit {

    Class<? extends BaseModel> value();
}
