package ${package};

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "${node}" Node.
 *
 */
public class ${node}Factory
        extends NodeFactory<${node}Model> {

    /**
     * {@inheritDoc}
     */
    @Override
    public ${node}Model createNodeModel() {
        return new ${node}Model();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<${node}Model> createNodeView(final int viewIndex,
            final ${node}Model nodeModel) {
        return new ${node}View(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new ${node}Dialog();
    }

}
