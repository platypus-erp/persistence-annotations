package org.platypus.generated.jpa;

import static javax.persistence.GenerationType.AUTO;
import static org.platypus.generated.jpa.ImplBaseUserJPA.MODEL_NAME;

import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.platypus.framework.buildin.DocumentRecord;
import org.platypus.framework.buildin.DocumentRecordCollection;
import org.platypus.framework.buildin.UserRecord;
import org.platypus.framework.persistence.internal.DateTimeFieldImpl;
import org.platypus.framework.persistence.internal.LongFieldImpl;
import org.platypus.framework.persistence.internal.StringFieldImpl;
import org.platypus.framework.persistence.model.fields.basic.LongField;
import org.platypus.framework.persistence.model.fields.basic.StringField;
import org.platypus.framework.persistence.model.fields.basic.UnmutableDateTimeField;
import org.platypus.framework.persistence.model.fields.basic.UnmutableStringField;

@Table(
    name = MODEL_NAME
)
@Entity
public class ImplBaseUserJPA implements UserRecord {
  public static final String MODEL_NAME = "base.user";

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
      name = "\"password\"",
      insertable = true,
      updatable = true
  )
  private String password;

  private final StringFieldImpl passwordField;

  @Column(
      name = "\"name\"",
      insertable = true,
      updatable = true
  )
  private String name;

  private final StringFieldImpl nameField;

  @OneToOne(
      mappedBy = "documentIds"
  )
  @JoinColumn(
      name = "\"img\"",
      updatable = true
  )
  private ImplBaseDocumentJPA img;

  private final DocumentRecord imgField;

  @OneToMany(
      mappedBy = "documentIds"
  )
  @JoinColumn(
      name = "\"img_otm\"",
      updatable = true
  )
  private List<ImplBaseDocumentJPA> imgOTM;

  private final DocumentRecordCollection imgOTMField;

  @ManyToMany
  @JoinTable
  @JoinColumn(
      name = "\"img_mtm\"",
      updatable = true
  )
  private List<ImplBaseDocumentJPA> imgMTM;

  private final DocumentRecordCollection imgMTMField;

  @ManyToOne
  @JoinColumn(
      name = "\"img_mto\"",
      updatable = true
  )
  private ImplBaseDocumentJPA imgMTO;

  private final DocumentRecord imgMTOField;

  public ImplBaseUserJPA() {
    idField = new LongFieldImpl<>(this, ImplBaseUserJPA::getId, ImplBaseUserJPA::setId);
    createDateField = new DateTimeFieldImpl<>(this, ImplBaseUserJPA::getCreateDate, ImplBaseUserJPA::setCreateDate);
    displayNameField = new StringFieldImpl<>(this, ImplBaseUserJPA::getDisplayName, ImplBaseUserJPA::setDisplayName);
    writeDateField = new DateTimeFieldImpl<>(this, ImplBaseUserJPA::getWriteDate, ImplBaseUserJPA::setWriteDate);
    passwordField = new StringFieldImpl<>(this, ImplBaseUserJPA::getPassword, ImplBaseUserJPA::setPassword);
    nameField = new StringFieldImpl<>(this, ImplBaseUserJPA::getName, ImplBaseUserJPA::setName);
    imgField = new DocumentRecordImpl<>(this,ImplBaseDocumentJPA.class, ImplBaseUserJPA::getImg, ImplBaseUserJPA::setImg);
    imgOTMField = new DocumentRecordCollectionImpl<>(this,ImplBaseDocumentJPA.class, ImplBaseUserJPA::getImgOTM, ImplBaseUserJPA::setImgOTM);
    imgMTMField = new DocumentRecordCollectionImpl<>(this,ImplBaseDocumentJPA.class, ImplBaseUserJPA::getImgMTM, ImplBaseUserJPA::setImgMTM);
    imgMTOField = new DocumentRecordImpl<>(this,ImplBaseDocumentJPA.class, ImplBaseUserJPA::getImgMTO, ImplBaseUserJPA::setImgMTO);
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

  String getPassword() {
    return this.password;}

  void setPassword(final String password) {
    this.password = password;}

  @Override
  public StringField password() {
    return passwordField;}

  @Override
  public void password(final StringField password) {
    this.password = password.get();}

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

  ImplBaseDocumentJPA getImg() {
    return this.img;}

  void setImg(final ImplBaseDocumentJPA img) {
    this.img = img;}

  @Override
  public DocumentRecord img() {
    return imgField;}

  @Override
  public void img(final DocumentRecord img) {
    this.img = img.unWrap(ImplBaseDocumentJPA.class);}

  List<ImplBaseDocumentJPA> getImgOTM() {
    return this.imgOTM;}

  void setImgOTM(final List<ImplBaseDocumentJPA> imgOTM) {
    this.imgOTM = imgOTM;}

  @Override
  public DocumentRecordCollection imgOTM() {
    return imgOTMField;}

  @Override
  public void imgOTM(final DocumentRecordCollection imgOTM) {
    this.imgOTM = imgOTM.unWrapAsList(ImplBaseDocumentJPA.class);}

  List<ImplBaseDocumentJPA> getImgMTM() {
    return this.imgMTM;}

  void setImgMTM(final List<ImplBaseDocumentJPA> imgMTM) {
    this.imgMTM = imgMTM;}

  @Override
  public DocumentRecordCollection imgMTM() {
    return imgMTMField;}

  @Override
  public void imgMTM(final DocumentRecordCollection imgMTM) {
    this.imgMTM = imgMTM.unWrapAsList(ImplBaseDocumentJPA.class);}

  ImplBaseDocumentJPA getImgMTO() {
    return this.imgMTO;}

  void setImgMTO(final ImplBaseDocumentJPA imgMTO) {
    this.imgMTO = imgMTO;}

  @Override
  public DocumentRecord imgMTO() {
    return imgMTOField;}

  @Override
  public void imgMTO(final DocumentRecord imgMTO) {
    this.imgMTO = imgMTO.unWrap(ImplBaseDocumentJPA.class);}
}
