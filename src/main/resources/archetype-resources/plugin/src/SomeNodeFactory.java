#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "SomeNode" Node.
 * Some node does something.
 *
 * @author Your Name
 */
public class SomeNodeFactory
        extends NodeFactory<SomeNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public SomeNodeModel createNodeModel() {
        return new SomeNodeModel();
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
    public NodeView<SomeNodeModel> createNodeView(final int viewIndex,
            final SomeNodeModel nodeModel) {
        return new SomeNodeView(nodeModel);
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
        return new SomeNodeDialog();
    }

}
