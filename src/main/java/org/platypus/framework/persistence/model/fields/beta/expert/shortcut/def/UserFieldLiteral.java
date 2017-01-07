package org.platypus.framework.persistence.model.fields.beta.expert.shortcut.def;

import org.platypus.framework.persistence.model.BaseModel;
import org.platypus.framework.persistence.model.fields.Field;
import org.platypus.framework.persistence.model.fields.relation.RelationField;
import org.platypus.framework.persistence.model.fields.beta.expert.shortcut.BoolShortcutParameter;
import org.platypus.framework.persistence.model.fields.beta.expert.shortcut.PlatypusShortcutRelation;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
@PlatypusShortcutRelation(type = RelationField.RelationType.ONE_TO_ONE, target = BaseModel.class)
public interface UserFieldLiteral extends Field {

    @BoolShortcutParameter(defaultValue = BoolShortcutParameter.DefaultValue.TRUE)
    boolean isRequired();


}
