package org.platypus.framework.persistence.model.fields.beta.expert.shortcut;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public @interface StringShortcutParameter {

    String DEFAULT = "__DEFAULT_VALUE__";

    String defaultValue();

    boolean required();
}
