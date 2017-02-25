package org.platypus.generated.jpa;

import java.lang.Class;
import java.lang.Override;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.platypus.framework.buildin.DocumentRecord;
import org.platypus.framework.buildin.DocumentRecordCollection;
import org.platypus.framework.buildin.UserRecord;
import org.platypus.framework.persistence.internal.RecordImpl;
import org.platypus.framework.persistence.model.fields.Record;
import org.platypus.framework.persistence.model.fields.basic.StringField;

public class UserRecordImpl<T extends Record> extends RecordImpl<T, UserRecord, ImplBaseUserJPA> implements UserRecord {
  public UserRecordImpl(T instance, Class<ImplBaseUserJPA> targetRecordImpl,
      Function<T, ImplBaseUserJPA> getter, BiConsumer<T, ImplBaseUserJPA> setter) {
    super(instance, targetRecordImpl, getter, setter);}

  @Override
  public StringField password() {
    return get().password();}

  @Override
  public void password(final StringField password) {
    this.get().password(password);}

  @Override
  public StringField name() {
    return get().name();}

  @Override
  public void name(final StringField name) {
    this.get().name(name);}

  @Override
  public DocumentRecord img() {
    return get().img();}

  @Override
  public void img(final DocumentRecord img) {
    this.get().img(img);}

  @Override
  public DocumentRecordCollection imgOTM() {
    return get().imgOTM();}

  @Override
  public void imgOTM(final DocumentRecordCollection imgOTM) {
    this.get().imgOTM(imgOTM);}

  @Override
  public DocumentRecordCollection imgMTM() {
    return get().imgMTM();}

  @Override
  public void imgMTM(final DocumentRecordCollection imgMTM) {
    this.get().imgMTM(imgMTM);}

  @Override
  public DocumentRecord imgMTO() {
    return get().imgMTO();}

  @Override
  public void imgMTO(final DocumentRecord imgMTO) {
    this.get().imgMTO(imgMTO);}
}
