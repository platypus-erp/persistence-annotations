package org.platypus.generated.jpa;

import static javax.persistence.GenerationType.AUTO;
import static org.platypus.generated.jpa.ImplBaseDocumentJPA.MODEL_NAME;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import org.platypus.framework.buildin.DocumentRecord;
import org.platypus.framework.persistence.internal.BinaryFieldImpl;
import org.platypus.framework.persistence.internal.DateTimeFieldImpl;
import org.platypus.framework.persistence.internal.LongFieldImpl;
import org.platypus.framework.persistence.internal.StringFieldImpl;
import org.platypus.framework.persistence.model.fields.basic.BinaryField;
import org.platypus.framework.persistence.model.fields.basic.LongField;
import org.platypus.framework.persistence.model.fields.basic.StringField;
import org.platypus.framework.persistence.model.fields.basic.UnmutableDateTimeField;
import org.platypus.framework.persistence.model.fields.basic.UnmutableStringField;

@Table(
    name = MODEL_NAME
)
@Entity
public class ImplBaseDocumentJPA implements DocumentRecord {
  public static final String MODEL_NAME = "base.document";

  @Column(
      name = "\"id\""
  )
  @Id
  @GeneratedValue(
      strategy = AUTO
  )
  private long id;

  private final LongField idField;

  @Column(
      name = "\"create_date\""
  )
  private LocalDateTime createDate;

  private final UnmutableDateTimeField createDateField;

  private final UnmutableStringField displayNameField;

  @Column(
      name = "\"write_date\""
  )
  private LocalDateTime writeDate;

  private final UnmutableDateTimeField writeDateField;

  @Column(
      name = "\"name\"",
      insertable = true,
      updatable = true
  )
  private String name;

  private final StringFieldImpl nameField;

  @Column(
      name = "\"mime_type\"",
      insertable = true,
      updatable = true
  )
  private String mimeType;

  private final StringFieldImpl mimeTypeField;

  @Lob
  @Basic(
      fetch = FetchType.EAGER
  )
  @Column(
      name = "\"file\"",
      nullable = true,
      insertable = true,
      updatable = true
  )
  private byte[] file;

  private final BinaryFieldImpl fileField;

  public ImplBaseDocumentJPA() {
    idField = new LongFieldImpl<>(this, ImplBaseDocumentJPA::getId, ImplBaseDocumentJPA::setId);
    createDateField = new DateTimeFieldImpl<>(this, ImplBaseDocumentJPA::getCreateDate, ImplBaseDocumentJPA::setCreateDate);
    displayNameField = new StringFieldImpl<>(this, ImplBaseDocumentJPA::getDisplayName, ImplBaseDocumentJPA::setDisplayName);
    writeDateField = new DateTimeFieldImpl<>(this, ImplBaseDocumentJPA::getWriteDate, ImplBaseDocumentJPA::setWriteDate);
    nameField = new StringFieldImpl<>(this, ImplBaseDocumentJPA::getName, ImplBaseDocumentJPA::setName);
    mimeTypeField = new StringFieldImpl<>(this, ImplBaseDocumentJPA::getMimeType, ImplBaseDocumentJPA::setMimeType);
    fileField = new BinaryFieldImpl<>(this, ImplBaseDocumentJPA::getFile, ImplBaseDocumentJPA::setFile);
  }

  long getId() {
    return this.id;}

  void setId(final long id) {
    this.id = id;}

  @Override
  public LongField id() {
    return idField;}

  @Override
  public void id(final LongField id) {
    this.id = id.get();}

  LocalDateTime getCreateDate() {
    return this.createDate;}

  void setCreateDate(final LocalDateTime createDate) {
    this.createDate = createDate;}

  @Override
  public UnmutableDateTimeField createDate() {
    return createDateField;}

  String getDisplayName() {
    return this.name;}

  void setDisplayName(final String displayName) {
    this.name = displayName;}

  @Override
  public UnmutableStringField displayName() {
    return displayNameField;}

  LocalDateTime getWriteDate() {
    return this.writeDate;}

  void setWriteDate(final LocalDateTime writeDate) {
    this.writeDate = writeDate;}

  @Override
  public UnmutableDateTimeField writeDate() {
    return writeDateField;}

  String getName() {
    return this.name;}

  void setName(final String name) {
    this.name = name;}

  @Override
  public StringField name() {
    return nameField;}

  @Override
  public void name(final StringField name) {
    this.name = name.get();}

  String getMimeType() {
    return this.mimeType;}

  void setMimeType(final String mimeType) {
    this.mimeType = mimeType;}

  @Override
  public StringField mimeType() {
    return mimeTypeField;}

  @Override
  public void mimeType(final StringField mimeType) {
    this.mimeType = mimeType.get();}

  byte[] getFile() {
    return this.file;}

  void setFile(final byte[] file) {
    this.file = file;}

  @Override
  public BinaryField file() {
    return fileField;}

  @Override
  public void file(final BinaryField file) {
    this.file = file.get();}
}
