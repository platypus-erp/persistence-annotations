package org.platypus.framework.generate;

import org.platypus.framework.persistence.model.BaseModel;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface PlatypusInheritModelInfo extends PlatypusRootModelInfo {

    Class<? extends BaseModel> target();
}
