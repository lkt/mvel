package org.mvel.optimizers.impl.refl;

import org.mvel.AccessorNode;
import org.mvel.integration.VariableResolverFactory;

public class ThisValueAccessor implements AccessorNode {
    private AccessorNode nextNode;

    public Object getValue(Object ctx, Object elCtx, VariableResolverFactory vars) {
        if (nextNode != null) {
            return this.nextNode.getValue(elCtx, elCtx, vars);
        }
        else {
            return elCtx;
        }
    }

    public ThisValueAccessor() {
    }

    public AccessorNode getNextNode() {
        return nextNode;
    }

    public AccessorNode setNextNode(AccessorNode nextNode) {
        return this.nextNode = nextNode;
    }
}
