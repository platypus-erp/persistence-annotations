package org.platypus.framework.persistence.model.fields;

import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface RecordSet {
    <R extends Record> Class<R> getType();

    <R extends Record> Set<R> unWrap(Class<R> record);

    <R extends Record> TypedRecordSet<R> type();

    int size();
    boolean isEmpty();
    boolean contains(Object o);

    RecordSet where(Object predicate);
    <R extends Record> RecordSet filter(Class<R> type, Predicate<R> predicate);

    RecordSet sort(Object predicate);
    <R extends Record> RecordSet orderBy(Class<R> type, boolean asc, Object... field);

    <R extends Record> R ensureOne();

    <R extends Record> boolean add(R record);
    <R extends Record> boolean replace(R record);
    <R extends Record> boolean merge(R record, BiFunction<R,R,R> mergeFunction);
    <R extends Record> boolean remove(R record);
}
