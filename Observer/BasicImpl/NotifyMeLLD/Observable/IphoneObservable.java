package Observable;

import Observer.NotifObserver;

import java.util.List;
import java.util.Objects;

public class IphoneObservable implements NotifObservable {

    private Integer currentStock;
    private List<NotifObserver> notifObservers;

    @Override
    public void registerUser(NotifObserver notifObserver) {
        notifObservers.add(notifObserver);
    }

    @Override
    public void removeRegisteredUser(NotifObserver notifObserver) {
        notifObservers.remove(notifObserver);
    }

    @Override
    public void notifyRegUsers() {
        if(currentStock > 0) {
            for(NotifObserver notifObserver : notifObservers) {
                notifObserver.updateAboutProduct();
            }
        }

    }

    @Override
    public void updateStock(Integer stock) {
        if(!Objects.equals(currentStock, stock))
            currentStock = stock;
    }

    @Override
    public Integer getProductStock() {
        return currentStock;
    }


}