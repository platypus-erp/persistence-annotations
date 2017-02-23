package org.platypus.framework.persistence.model.fields.beta.expert.shortcut;

import org.platypus.framework.persistence.model.BaseModel;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public @interface PlatypusShortcutRelation {
    /**
     * The target Platypus model for the relation
     */
    Class<? extends BaseModel> target();


    boolean function() default false;
}
