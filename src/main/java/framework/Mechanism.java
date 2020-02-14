package framework;

import framework.interfaces.IMechanism;

public abstract class Mechanism implements IMechanism {
    protected final IMechanism parent;
    protected final IMechanism[] children;

    protected Mechanism(IMechanism parent, IMechanism[] children) {
        this.parent = parent;
        this.children = children;
    }

    @Override
    public final IMechanism[] getChildren() {
        return children;
    }
    @Override 
    public final IMechanism getParent() {
        return parent;
    }
    @Override
    public final void log() {
        logHere();
        for(IMechanism child : children) {
            child.log();
        }
    }
    protected abstract void logHere();
} 