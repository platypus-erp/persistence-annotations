package org.platypus.framework.persistence.entity;

import org.platypus.framework.persistence.model.fields.Record;

import java.time.LocalDateTime;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @author Alexandre SALAUN
 * @version 0.1
 * @since 0.1
 */
public interface BaseEntity {
    String getTableName();

    long getId();
    void setId(long id);

    LocalDateTime getCreateDate();
    void setCreateDate(LocalDateTime createDate);

    LocalDateTime getWriteDate();
    void setWriteDate(LocalDateTime createDate);

    String getDisplayName();
    void setDisplayName(String name);

    String getCode();
    void setCode(String code);

    long getVersion();
    void setVersion(long version);

    <R extends Record> R wrap();
}
