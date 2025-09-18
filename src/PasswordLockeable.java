public interface PasswordLockeable {
    void setPassword();
    void Unlock();
    void Lock();
    boolean isLocked();
}
