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
public interface PlatypusRootModelInfo {

    String name();

    List<StringFieldDefinition> stringField();
    List<LongFieldDefinition> longField();
    List<IntFieldDefinition> intField();
    List<FloatFieldDefinition> floatField();
    List<DecimalFieldDefinition> decimalField();
    List<BigStringFieldDefinition> bigStringField();
    List<BinaryFieldDefinition> binaryField();
    List<DateFieldDefinition> dateField();
    List<DateTimeFieldDefinition> dateTimeField();
    List<TimeFieldDefinition> timeField();


    List<OneToManyFieldDefinition> oneToMany();
    List<OneToOneFieldDefinition> oneToOne();
    List<ManyToOneFieldDefinition> manyToOne();
    List<ManyToManyFieldDefinition> manyToMany();

    List<ComputedFieldDefinition> computed();
    List<RelatedFieldDefinition> related();
}
