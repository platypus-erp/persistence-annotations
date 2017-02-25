package org.platypus.framework.business.step2.mod3;

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
public class Rule3 {

    int previousStep = 1;
    int currentStepStep = 2;

    @PlatypusApi.MethodCollection
    public String myRule(String userRecords, SuperMethod superMethod){
        String t = userRecords + "->Before " + "Rule3";
        t = superMethod.apply(t);
        return t + "->After " + "Rule3";
    }
}
