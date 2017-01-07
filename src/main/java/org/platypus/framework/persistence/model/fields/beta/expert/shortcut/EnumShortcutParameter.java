package org.platypus.framework.persistence.model.fields.beta.expert.shortcut;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public @interface EnumShortcutParameter {

    Class<? extends Enum> enumType();

    String enumValue() default "";
}
