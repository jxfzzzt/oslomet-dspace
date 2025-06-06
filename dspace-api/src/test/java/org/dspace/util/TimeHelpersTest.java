/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.util;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.Test;

/**
 * Test {@link TimeHelpers}.
 * @author Mark H. Wood <mwood@iupui.edu>
 */
public class TimeHelpersTest {
    /**
     * Test of toMidnightUTC method, of class TimeHelpers.
     */
    @Test
    public void testToMidnightUTC() {
        System.out.println("toMidnightUTC");
        LocalDateTime from = ZonedDateTime.of(1957, 01, 27, 04, 05, 06, 007,
                                              ZoneOffset.UTC).toLocalDateTime();
        LocalDateTime expResult = ZonedDateTime.of(1957, 01, 27, 00, 00, 00, 000,
                                                   ZoneOffset.UTC).toLocalDateTime();
        LocalDateTime result = TimeHelpers.toMidnightUTC(from);
        assertEquals(expResult, result);
    }
}
