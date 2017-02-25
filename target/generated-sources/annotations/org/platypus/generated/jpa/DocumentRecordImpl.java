package org.platypus.generated.jpa;

import java.lang.Class;
import java.lang.Override;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.platypus.framework.buildin.DocumentRecord;
import org.platypus.framework.persistence.internal.RecordImpl;
import org.platypus.framework.persistence.model.fields.Record;
import org.platypus.framework.persistence.model.fields.basic.BinaryField;
import org.platypus.framework.persistence.model.fields.basic.StringField;

public class DocumentRecordImpl<T extends Record> extends RecordImpl<T, DocumentRecord, ImplBaseDocumentJPA> implements DocumentRecord {
  public DocumentRecordImpl(T instance, Class<ImplBaseDocumentJPA> targetRecordImpl,
      Function<T, ImplBaseDocumentJPA> getter, BiConsumer<T, ImplBaseDocumentJPA> setter) {
    super(instance, targetRecordImpl, getter, setter);}

  @Override
  public StringField name() {
    return get().name();}

  @Override
  public void name(final StringField name) {
    this.get().name(name);}

  @Override
  public StringField mimeType() {
    return get().mimeType();}

  @Override
  public void mimeType(final StringField mimeType) {
    this.get().mimeType(mimeType);}

  @Override
  public BinaryField file() {
    return get().file();}

  @Override
  public void file(final BinaryField file) {
    this.get().file(file);}
}
