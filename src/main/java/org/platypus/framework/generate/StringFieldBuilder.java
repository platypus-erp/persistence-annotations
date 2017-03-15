package org.platypus.framework.generate;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class StringFieldBuilder {
    private final String name;

    public StringFieldBuilder(String name) {
        this.name = name;
    }

    public StringFieldBuilder insertable(Boolean insertable){
        return this;
    }
}
