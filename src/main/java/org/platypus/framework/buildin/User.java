package org.platypus.framework.buildin;

import org.platypus.framework.persistence.model.BaseModel;
import org.platypus.framework.persistence.model.PlatypusModel;
import org.platypus.framework.persistence.model.fields.Field;
import org.platypus.framework.persistence.model.fields.RelatedFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.StringFieldDefinition;
import org.platypus.framework.persistence.model.fields.relation.def.ManyToManyFieldDefinition;
import org.platypus.framework.persistence.model.fields.relation.def.ManyToOneFieldDefinition;
import org.platypus.framework.persistence.model.fields.relation.def.OneToManyFieldDefinition;
import org.platypus.framework.persistence.model.fields.relation.def.OneToOneFieldDefinition;

import static org.platypus.framework.persistence.model.fields.Bool.TRUE;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
@PlatypusModel("base.user")
public class User implements BaseModel{

    @StringFieldDefinition(
            columnDoc = "the name of the user",
            required = StringFieldDefinition.RequiredType.NOT_BLANK
    )
    private Field name;

    @StringFieldDefinition(
            columnDoc = "the password of the user",
            required = StringFieldDefinition.RequiredType.NOT_BLANK
    )
    private Field password;

    @OneToOneFieldDefinition(target = Document.class, mappedBy = "documentIds")
    private Field img;

    @ManyToOneFieldDefinition(Document.class)
    private Field imgMTO;

    @ManyToManyFieldDefinition(Document.class)
    private Field imgMTM;

    @OneToManyFieldDefinition(target = Document.class, mappedBy = "documentIds")
    private Field imgOTM;

    @StringFieldDefinition(
            columnDoc = "the name of the user",
            required = StringFieldDefinition.RequiredType.NOT_BLANK
    )
    @RelatedFieldDefinition(path = {"imgOTM", "name"}, store = TRUE, readonly = TRUE)
    private Field imgOTMName;
}
