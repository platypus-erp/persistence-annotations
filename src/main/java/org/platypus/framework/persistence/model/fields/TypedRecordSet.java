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
public interface TypedRecordSet<R extends Record> extends Set<R>{

    Set<R> unWrap();

    TypedRecordSet<R> filter(Predicate<R> predicate);

    TypedRecordSet<R> orderBy(boolean asc, Object... field);

    TypedRecordSet<R> ensureOne();

    boolean merge(R record, BiFunction<R,R,R> mergeFunction);
}
