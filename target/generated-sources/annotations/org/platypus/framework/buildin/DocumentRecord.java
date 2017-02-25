package org.platypus.framework.buildin;

import org.platypus.framework.persistence.model.fields.Record;
import org.platypus.framework.persistence.model.fields.basic.BinaryField;
import org.platypus.framework.persistence.model.fields.basic.StringField;

public interface DocumentRecord extends Record {
  StringField name();

  void name(StringField name);

  StringField mimeType();

  void mimeType(StringField mimeType);

  BinaryField file();

  void file(BinaryField file);
}
