package org.platypus.framework.persistence.buildin;

import org.platypus.framework.persistence.model.BaseModel;
import org.platypus.framework.persistence.model.PlatypusModel;
import org.platypus.framework.persistence.model.fields.Bool;
import org.platypus.framework.persistence.model.fields.Field;
import org.platypus.framework.persistence.model.fields.basic.def.BinaryFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.StringFieldDefinition;

/**
 * The Definition of the document persisted in the Database.
 * this model can be inherited
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
@PlatypusModel("base.document")
public class Document implements BaseModel {

    public static final String HINT_DOCUMENT_NAME = "name";

    @StringFieldDefinition(
            columnDoc = "the name of the document",
            uniqueHint = HINT_DOCUMENT_NAME,
            required = StringFieldDefinition.RequiredType.NOT_BLANK
    )
    private Field name;

    @StringFieldDefinition(
            columnDoc = "the mime type of the file",
            required = StringFieldDefinition.RequiredType.NOT_BLANK
    )
    private Field mimeType;

    @BinaryFieldDefinition(
            columnDoc = "the file",
            lazy = Bool.TRUE
    )
    private Field file;

}
