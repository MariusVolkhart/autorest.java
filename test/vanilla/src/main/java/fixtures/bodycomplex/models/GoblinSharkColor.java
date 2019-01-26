/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.v3.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for GoblinSharkColor.
 */
public final class GoblinSharkColor extends ExpandableStringEnum<GoblinSharkColor> {
    /**
     * Static value pink for GoblinSharkColor.
     */
    public static final GoblinSharkColor PINK = fromString("pink");

    /**
     * Static value gray for GoblinSharkColor.
     */
    public static final GoblinSharkColor GRAY = fromString("gray");

    /**
     * Static value brown for GoblinSharkColor.
     */
    public static final GoblinSharkColor BROWN = fromString("brown");

    /**
     * Creates or finds a GoblinSharkColor from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GoblinSharkColor.
     */
    @JsonCreator
    public static GoblinSharkColor fromString(String name) {
        return fromString(name, GoblinSharkColor.class);
    }

    /**
     * @return known GoblinSharkColor values.
     */
    public static Collection<GoblinSharkColor> values() {
        return values(GoblinSharkColor.class);
    }
}
