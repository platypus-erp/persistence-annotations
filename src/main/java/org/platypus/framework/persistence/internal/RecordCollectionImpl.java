package org.platypus.framework.persistence.internal;

import org.platypus.framework.persistence.internal.api.AbstractFieldImpl;
import org.platypus.framework.persistence.internal.api.GenericField;
import org.platypus.framework.persistence.model.fields.Record;
import org.platypus.framework.persistence.model.fields.RecordCollection;
import org.platypus.framework.persistence.model.fields.TypedRecordCollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class RecordCollectionImpl<T extends Record,R extends Record,RI extends R, RC extends RecordCollection<R>> extends AbstractFieldImpl<T,List<RI>> implements GenericField<List<RI>>, RecordCollection<R> {


    public RecordCollectionImpl(T instance, Class<RI> recordTarget,  Function<T, List<RI>> getter, BiConsumer<T, List<RI>> setter) {
        super(instance, getter, setter);
    }


    //<editor-fold desc="Methode to impl">
    @Override
    public <R1 extends R> Class<R1> getType() {
        return null;
    }

    @Override
    public <R1 extends R> Set<R1> unWrap(Class<R1> record) {
        return null;
    }

    @Override
    public <R1 extends R> List<R1> unWrapAsList(Class<R1> record) {
        return null;
    }

    @Override
    public <R1 extends R> TypedRecordCollection<R1> type() {
        return null;
    }

    @Override
    public <R1 extends R> TypedRecordCollection<R1> type(Class<R1> type) {
        return null;
    }

    @Override
    public RecordCollection where(Object predicate) {
        return null;
    }

    @Override
    public <R1 extends R> RecordCollection filter(Predicate<R1> predicate) {
        return null;
    }

    @Override
    public RecordCollection sort(Object predicate) {
        return null;
    }

    @Override
    public <R1 extends R> RecordCollection orderBy(Class<R1> type, boolean asc, Object... field) {
        return null;
    }

    @Override
    public <R1 extends R> R1 first() {
        return null;
    }

    @Override
    public <R1 extends R> R1 last() {
        return null;
    }

    @Override
    public void requiredOne() {

    }

    @Override
    public boolean isSingleValue() {
        return false;
    }

    @Override
    public <R1 extends R> boolean replace(R1 record) {
        return false;
    }

    @Override
    public <R1 extends R> boolean merge(R1 record, BiFunction<R1, R1, R1> mergeFunction) {
        return false;
    }

    @Override
    public <R1 extends R> boolean remove(R1 record) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<R> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(R r) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends R> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
    //</editor-fold>
}
