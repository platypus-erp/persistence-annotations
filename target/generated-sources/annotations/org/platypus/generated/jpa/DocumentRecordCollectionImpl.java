package org.platypus.generated.jpa;

import java.lang.Class;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.platypus.framework.buildin.DocumentRecord;
import org.platypus.framework.buildin.DocumentRecordCollection;
import org.platypus.framework.persistence.internal.RecordCollectionImpl;
import org.platypus.framework.persistence.model.fields.Record;

public class DocumentRecordCollectionImpl<T extends Record> extends RecordCollectionImpl<T, DocumentRecord, ImplBaseDocumentJPA, DocumentRecordCollection> implements DocumentRecordCollection {
  public DocumentRecordCollectionImpl(T instance, Class<ImplBaseDocumentJPA> recordTarget,
      Function<T, List<ImplBaseDocumentJPA>> getter,
      BiConsumer<T, List<ImplBaseDocumentJPA>> setter) {
    super(instance, recordTarget, getter, setter);}
}
