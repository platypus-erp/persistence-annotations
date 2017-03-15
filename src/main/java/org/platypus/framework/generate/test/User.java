package org.platypus.framework.generate.test;

import org.platypus.framework.generate.AbstractPlatypusRootModel;

import static org.platypus.framework.generate.StringFieldDef.str;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class User extends AbstractPlatypusRootModel<User> {


    public User() {
        addField(
                str("login")
                        .insertable(true)
        ).addField(
                str("password")
                .insertable(false)
        );
    }
}
