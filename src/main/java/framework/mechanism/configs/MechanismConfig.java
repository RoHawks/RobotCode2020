package framework.mechanism.configs;

import framework.mechanism.configs.interfaces.IMechanismConfig;
import framework.mechanism.interfaces.IMechanism;

public abstract class MechanismConfig implements IMechanismConfig {
    protected IMechanismConfig[] childrenConfigs;
    
    @Override
    public IMechanismConfig[] getChildrenConfigs() {
        return childrenConfigs;
    }
}