package org.platypus.framework.generate;

import java.util.Set;

/**
 * TODO Add JavaDoc
 *
 * @author Alexis PASQUIER
 * @version 0.1
 * @since 0.1
 */
public interface ModuleInfo {
    String name();

    String version();

    PlatypusVersion platypusVersion();

    Set<String> depends();
}
