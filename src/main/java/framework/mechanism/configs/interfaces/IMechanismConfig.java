package framework.mechanism.configs.interfaces;

import framework.mechanism.interfaces.IMechanism;

public interface IMechanismConfig {
    IMechanismConfig[] getChildrenConfigs();
    IMechanism build(IMechanism parent);
}