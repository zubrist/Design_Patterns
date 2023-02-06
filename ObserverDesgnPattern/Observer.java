package ObserverDesignPatter;

public interface Observer {
    /*
     * The Observer interface is implemented by all observers, so they all have
     * to implement the update() method.
     */
    public void update();
   }