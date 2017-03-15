package org.platypus.framework.generate;

import org.platypus.framework.persistence.model.fields.RelatedFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.BigStringFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.BinaryFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.DateFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.DateTimeFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.DecimalFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.FloatFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.IntFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.LongFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.StringFieldDefinition;
import org.platypus.framework.persistence.model.fields.basic.def.TimeFieldDefinition;
import org.platypus.framework.persistence.model.fields.relation.def.ManyToManyFieldDefinition;
import org.platypus.framework.persistence.model.fields.relation.def.ManyToOneFieldDefinition;
import org.platypus.framework.persistence.model.fields.relation.def.OneToManyFieldDefinition;
import org.platypus.framework.persistence.model.fields.relation.def.OneToOneFieldDefinition;
import org.platypus.framework.persistence.model.fields.special.ComputedFieldDefinition;

import java.util.List;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class AbstractPlatypusRootModel<T extends AbstractPlatypusRootModel<T>> implements PlatypusRootModelInfo {




    protected final T addField(StringFieldBuilder stringFieldDef){
        return (T)this;
    }



    @Override
    public String name() {
        return null;
    }

    @Override
    public List<StringFieldDefinition> stringField() {
        return null;
    }

    @Override
    public List<LongFieldDefinition> longField() {
        return null;
    }

    @Override
    public List<IntFieldDefinition> intField() {
        return null;
    }

    @Override
    public List<FloatFieldDefinition> floatField() {
        return null;
    }

    @Override
    public List<DecimalFieldDefinition> decimalField() {
        return null;
    }

    @Override
    public List<BigStringFieldDefinition> bigStringField() {
        return null;
    }

    @Override
    public List<BinaryFieldDefinition> binaryField() {
        return null;
    }

    @Override
    public List<DateFieldDefinition> dateField() {
        return null;
    }

    @Override
    public List<DateTimeFieldDefinition> dateTimeField() {
        return null;
    }

    @Override
    public List<TimeFieldDefinition> timeField() {
        return null;
    }

    @Override
    public List<OneToManyFieldDefinition> oneToMany() {
        return null;
    }

    @Override
    public List<OneToOneFieldDefinition> oneToOne() {
        return null;
    }

    @Override
    public List<ManyToOneFieldDefinition> manyToOne() {
        return null;
    }

    @Override
    public List<ManyToManyFieldDefinition> manyToMany() {
        return null;
    }

    @Override
    public List<ComputedFieldDefinition> computed() {
        return null;
    }

    @Override
    public List<RelatedFieldDefinition> related() {
        return null;
    }
}
