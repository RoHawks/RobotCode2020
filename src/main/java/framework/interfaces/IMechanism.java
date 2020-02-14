package framework.interfaces;

public interface IMechanism extends ILog {
    IMechanism[] getChildren();
    IMechanism getParent();
}