public interface PasswordLockeable {
    void setPassword(String password);
    void Unlock(String password);
    void Lock(String password);
    boolean isLocked();
}