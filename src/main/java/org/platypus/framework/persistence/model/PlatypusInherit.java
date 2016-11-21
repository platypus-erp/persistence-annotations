package org.platypus.framework.persistence.model;

import org.platypus.framework.persistence.model.BaseModel;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public @interface PlatypusInherit {

    Class<? extends BaseModel> value();
}
