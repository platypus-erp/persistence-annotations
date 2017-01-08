package org.platypus.framework.persistence.buildin;

import org.platypus.framework.persistence.model.fields.TypedRecordSet;

import java.util.List;
import java.util.stream.Collectors;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class Test {



    private void tt(){
        UserRecord user = null;
        user.img().name("name");
        DocumentRecord rr = user.imgMTM().ensureOne();
        TypedRecordSet<DocumentRecord> rr2 = user.imgMTM().type();
        rr2.add(null);
        rr.name("sdkh");

        List<DocumentRecord> l = rr2.stream().filter(d -> d.name().get().isEmpty())
                .collect(Collectors.toList());
        l.clear();
        for (DocumentRecord r : user.imgMTM().unWrap(DocumentRecord.class)){
            r.name("name");
        }
    }
}
