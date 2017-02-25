package org.platypus.generated.jpa;

import java.lang.Class;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.platypus.framework.buildin.UserRecord;
import org.platypus.framework.buildin.UserRecordCollection;
import org.platypus.framework.persistence.internal.RecordCollectionImpl;
import org.platypus.framework.persistence.model.fields.Record;

public class UserRecordCollectionImpl<T extends Record> extends RecordCollectionImpl<T, UserRecord, ImplBaseUserJPA, UserRecordCollection> implements UserRecordCollection {
  public UserRecordCollectionImpl(T instance, Class<ImplBaseUserJPA> recordTarget,
      Function<T, List<ImplBaseUserJPA>> getter, BiConsumer<T, List<ImplBaseUserJPA>> setter) {
    super(instance, recordTarget, getter, setter);}
}
