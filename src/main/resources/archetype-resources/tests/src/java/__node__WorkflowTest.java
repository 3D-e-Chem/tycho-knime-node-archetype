package ${package};

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.knime.core.node.CanceledExecutionException;
import org.knime.core.node.InvalidSettingsException;
import org.knime.core.node.workflow.UnsupportedWorkflowVersionException;
import org.knime.core.util.LockFailedException;
import org.knime.testing.core.TestrunConfiguration;

import nl.esciencecenter.e3dchem.knime.testing.TestFlowRunner;

public class ${node}WorkflowTest {
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    private TestFlowRunner runner;

    @Before
    public void setUp() {
        TestrunConfiguration runConfiguration = new TestrunConfiguration();
        runConfiguration.setTestDialogs(true);
        runConfiguration.setReportDeprecatedNodes(true);
        runConfiguration.setCheckMemoryLeaks(true);
        runConfiguration.setLoadSaveLoad(false);
        runner = new TestFlowRunner(collector, runConfiguration);
    }

    @Test
    public void test_simple() throws IOException, InvalidSettingsException, CanceledExecutionException,
            UnsupportedWorkflowVersionException, LockFailedException, InterruptedException {
        File workflowDir = new File("src/knime/simple-test");
        runner.runTestWorkflow(workflowDir);
    }
}
