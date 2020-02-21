package framework.mechanism;

import framework.mechanism.interfaces.IMechanism;
import framework.mechanism.configs.interfaces.IMechanismConfig;

public abstract class Mechanism implements IMechanism {
    protected final IMechanism parent;
    protected final IMechanism[] children;

    protected Mechanism(IMechanismConfig config, IMechanism parent) {
        this.parent = parent;
        var configs = config.getChildrenConfigs();
        this.children = new IMechanism[configs.length];
        for (int i = 0; i < configs.length; i++) {
            children[i] = configs[i].build(this);
        }
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
    public void logMechanisms() {
        log();
        for(IMechanism child : children) {
            child.logMechanisms();
        }
    }
} 