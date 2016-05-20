package ${package};

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodePluginTest {

    @Test
    public void veryStupidTest() {
        assertEquals("${parentArtifactId}.plugin", SomeNodePlugin.PLUGIN_ID);
    }
}
