package ObjectPoolPattern.ObjectPoolJDBC;


import java.util.ArrayList;
import java.util.List;

public class ObjectPool<T> {

    private List<T> availableObjects;
    private List<T> borrowedObjects;
    private int maxSize;
    private ObjectFactory<T> objectFactory;

    public ObjectPool(int maxSize, ObjectFactory<T> objectFactory) {
        this.maxSize = maxSize;
        availableObjects = new ArrayList<>();
        borrowedObjects = new ArrayList<>();
        this.objectFactory = objectFactory;
    }

    public synchronized T borrowObject() throws Exception {
        if (availableObjects.isEmpty()) {
            if (borrowedObjects.size() < maxSize) {
                T object = objectFactory.createObject();
                borrowedObjects.add(object);
                return object;
            } else {
                throw new Exception("No objects available in the pool.");
            }
        } else {
            T object = availableObjects.remove(availableObjects.size() - 1);
            borrowedObjects.add(object);
            return object;
        }
    }

    public synchronized void returnObject(T object) {
        if (borrowedObjects.remove(object)) {
            availableObjects.add(object);
        }
    }

    public interface ObjectFactory<T> {
        T createObject();
    }
}