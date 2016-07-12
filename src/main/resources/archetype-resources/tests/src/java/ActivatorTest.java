#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ActivatorTest {

    @Test
    public void veryStupidTest() {
        assertEquals("${parentArtifactId}.plugin", Activator.PLUGIN_ID);
    }
}
