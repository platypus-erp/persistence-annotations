package org.platypus.framework.persistence.model.fields.relation;

import org.platypus.framework.persistence.model.BaseModel;
import org.platypus.framework.persistence.model.fields.Field;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public interface RelationField<T extends BaseModel> extends Field {
    @Override
    default FieldType getFieldType() {
        return FieldType.RELATION;
    }

    Class<T> getTarget();
}