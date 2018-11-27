public class Server {
    private int maxConnections;
    
    private static Server singleton;
    
    private Server() {
    }
    
    
    
    
    public static Server getInstance() {
        if (singleton == null) {
            synchronized (Server.class) {
                if (singleton == null) {
                    singleton = new Server();
                }
            }
        }
        return singleton;
    }
}