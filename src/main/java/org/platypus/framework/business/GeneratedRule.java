package org.platypus.framework.business;

import org.platypus.framework.business.step1.mod1.Rule1;
import org.platypus.framework.business.step2.mod2.Rule2;
import org.platypus.framework.business.step2.mod3.Rule3;
import org.platypus.framework.business.step3.mod4.Rule4;
import org.platypus.framework.business.step3.mod5.Rule5;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class GeneratedRule {

    Rule1 r1 = new Rule1();
    Rule2 r2 = new Rule2();
    Rule3 r3 = new Rule3();
    Rule4 r4 = new Rule4();
    Rule5 r5 = new Rule5();

    public String myRule(String userRecords) {
        SuperMethod myRuleSuperMethod1 = r -> r;

        SuperMethod myRuleSuperMethod3 = r -> r1.myRule(r, myRuleSuperMethod1);

        SuperMethod myRuleSuperMethod5 = r -> r3.myRule(r, myRuleSuperMethod3);

        SuperMethod myRuleSuperMethod2 = r -> r5.myRule(r, myRuleSuperMethod5);

        SuperMethod myRuleSuperMethod4 = r -> r2.myRule2(r, myRuleSuperMethod2);

        return r4.myRule(userRecords, myRuleSuperMethod4);
    }

    public String myRule2(String userRecords) {
        SuperMethod root = rootVar -> rootVar;

        SuperMethod mod5 = m -> r5.myRule(m, z -> r3.myRule(z, g -> r1.myRule(g, root)));
        SuperMethod mod4 = s -> r4.myRule(s, a -> r2.myRule2(a, mod5));


        return mod4.apply(userRecords);
    }
}
