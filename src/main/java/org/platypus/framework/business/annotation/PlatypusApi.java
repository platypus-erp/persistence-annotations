package org.platypus.framework.business.annotation;

import org.platypus.framework.persistence.model.BaseModel;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public @interface PlatypusApi {

    @interface ClassApi{
        Class<? extends BaseModel> value();
    }

    @interface MethodCollection{
        int value() default -1;

    }


    @interface MethodRecord{

    }

    @interface Method{

    }
}
