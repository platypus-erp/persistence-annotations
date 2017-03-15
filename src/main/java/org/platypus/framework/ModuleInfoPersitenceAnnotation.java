package org.platypus.framework;

import org.platypus.framework.generate.ModuleInfo;
import org.platypus.framework.generate.PlatypusVersion;

import java.util.Collections;
import java.util.Set;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public class ModuleInfoPersitenceAnnotation implements ModuleInfo{
    @Override
    public String name() {
        return "persitence-annotation";
    }

    @Override
    public String version() {
        return "0.1";
    }

    @Override
    public PlatypusVersion platypusVersion() {
        return PlatypusVersion.V1;
    }

    @Override
    public Set<String> depends() {
        return Collections.emptySet();
    }
}
