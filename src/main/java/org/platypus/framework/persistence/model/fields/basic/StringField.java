package org.platypus.framework.persistence.model.fields.basic;


import org.platypus.framework.persistence.internal.api.GenericField;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface StringField extends UnmutableStringField, GenericField<String> {

    static StringField of(String toto) {
        return new StringFiledImpll(toto);
    }

    class StringFiledImpll implements StringField{
        private String value;

        private StringFiledImpll(String value){
            this.value = value;
        }

        @Override
        public String get() {
            return value;
        }

        @Override
        public void set(String value) {
            this.value = value;
        }
    }
}
