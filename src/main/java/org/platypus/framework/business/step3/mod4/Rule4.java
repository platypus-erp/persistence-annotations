package org.platypus.framework.business.step3.mod4;

import org.platypus.framework.buildin.User;
import org.platypus.framework.business.SuperMethod;
import org.platypus.framework.business.annotation.PlatypusApi;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
@PlatypusApi.ClassApi(User.class)
public class Rule4 {
    int previousStep = 2;
    int currentStepStep = 3;

    @PlatypusApi.MethodCollection
    public String myRule(String userRecords, SuperMethod superMethod) {
        String t = userRecords + "->Before " + "Rule4";
        t = superMethod.apply(t);
        return t + "->After " + "Rule4";
    }
}
