package org.platypus.framework.persistence.model.fields;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface TypedRecordCollection<R extends Record> extends Collection<R> {

    <R> Collection<R> unWrap();
    <R> Set<R> unWrapAsSet();
    <R> List<R> unWrapAsList();

    RecordCollection where(Object predicate);
    <R>  RecordCollection filter(Predicate<R> predicate);

    RecordCollection sort(Object predicate);
    <R> RecordCollection orderBy(boolean asc, Object... field);

    <R> R first();
    <R> R last();

    void requiredOne();
    boolean isSingleValue();
}
