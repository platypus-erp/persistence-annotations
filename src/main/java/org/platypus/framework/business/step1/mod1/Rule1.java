package org.platypus.framework.business.step1.mod1;

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
public class Rule1 {

    int previousStep = 0;
    int currentStepStep = 1;

    @PlatypusApi.MethodCollection
    public String myRule(String userRecords, SuperMethod superMethod){
        String t = userRecords + "->Before " + "Rule1";
        t = superMethod.apply(t);
        return t + "->After " + "Rule1";
    }
}
