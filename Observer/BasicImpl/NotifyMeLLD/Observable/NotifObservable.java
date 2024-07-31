package Observable;

import Observer.NotifObserver;

public interface NotifObservable {
    void registerUser(NotifObserver notifObserver);
    void removeRegisteredUser(NotifObserver notifObserver);
    void notifyRegUsers();
    void updateStock(Integer stock);
    Integer getProductStock();
}