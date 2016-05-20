#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.knime.core.node.NodeView;

/**
 * <code>NodeView</code> for the "SomeNode" Node.
 * Some node does something.
 *
 * @author Your Name
 */
public class SomeNodeView extends NodeView<SomeNodeModel> {

    /**
     * Creates a new view.
     *
     * @param nodeModel The model (class: {@link SomeNodeModel})
     */
    protected SomeNodeView(final SomeNodeModel nodeModel) {
        super(nodeModel);

        // TODO instantiate the components of the view here.

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void modelChanged() {

        // TODO retrieve the new model from your nodemodel and
        // update the view.
        SomeNodeModel nodeModel =
            (SomeNodeModel)getNodeModel();
        assert nodeModel != null;

        // be aware of a possibly not executed nodeModel! The data you retrieve
        // from your nodemodel could be null, emtpy, or invalid in any kind.

    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onClose() {

        // TODO things to do when closing the view
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onOpen() {

        // TODO things to do when opening the view
    }

}
