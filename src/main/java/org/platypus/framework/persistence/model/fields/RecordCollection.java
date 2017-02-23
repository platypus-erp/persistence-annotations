package org.platypus.framework.persistence.model.fields;

import java.util.Collection;
import java.util.List;
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
public interface RecordCollection<T extends Record> extends Collection<T> {
    <R extends T> Class<R> getType();

    <R extends T> Set<R> unWrap(Class<R> record);
    <R extends T> List<R> unWrapAsList(Class<R> record);

    <R extends T> TypedRecordCollection<R> type();
    <R extends T> TypedRecordCollection<R> type(Class<R> type);

    RecordCollection where(Object predicate);
    <R extends T>  RecordCollection filter(Predicate<R> predicate);

    RecordCollection sort(Object predicate);
    <R extends T> RecordCollection orderBy(Class<R> type, boolean asc, Object... field);

    <R extends T> R first();
    <R extends T> R last();

    void requiredOne();
    boolean isSingleValue();

    <R extends T> boolean replace(R record);
    <R extends T> boolean merge(R record, BiFunction<R,R,R> mergeFunction);
    <R extends T> boolean remove(R record);
}
