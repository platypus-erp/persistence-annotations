package org.platypus.framework.buildin;

import org.platypus.framework.persistence.model.fields.Record;
import org.platypus.framework.persistence.model.fields.basic.StringField;

public interface UserRecord extends Record {
  StringField password();

  void password(StringField password);

  StringField name();

  void name(StringField name);

  DocumentRecord img();

  void img(DocumentRecord img);

  DocumentRecordCollection imgOTM();

  void imgOTM(DocumentRecordCollection imgOTM);

  DocumentRecordCollection imgMTM();

  void imgMTM(DocumentRecordCollection imgMTM);

  DocumentRecord imgMTO();

  void imgMTO(DocumentRecord imgMTO);
}
