package org.platypus.framework.persistence;


import org.platypus.framework.persistence.model.fields.Record;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface Repository<R extends Record> {

    R create();

    void insert(@NotNull R e);

    void update(@NotNull R e);

    void delete(@NotNull R e);

    void delete(long id);

    R getById(long id);

    List<R> getList();

    int count();
}
