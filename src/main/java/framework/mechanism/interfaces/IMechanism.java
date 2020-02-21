package framework.mechanism.interfaces;

import framework.interfaces.ILog;

public interface IMechanism extends ILog {
    IMechanism[] getChildren();
    IMechanism getParent();
    void logMechanisms();
}