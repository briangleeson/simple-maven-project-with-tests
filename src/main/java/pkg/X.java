package pkg;

import java.net.InetAddress;

/**
 * A utility.
 */
public class X {
    /**
     * Does something.
     */
    public void someMethod() {
        try {
            InetAddress address1 = InetAddress.getByName("127.0.0.1");
            InetAddress address2 = InetAddress.getByName("localhost");
            InetAddress address3 = InetAddress.getByName("0.0.0.0");
            boolean reachable1 = address1.isReachable(10000);
            boolean reachable2 = address2.isReachable(10000);
            boolean reachable3 = address2.isReachable(10000);

            System.out.println("Is host reachable1? " + reachable1);
            System.out.println("Is host reachable2? " + reachable2);
            System.out.println("Is host reachable3? " + reachable3);

            String hostname1 = InetAddress.getLocalHost().getHostName();
            InetAddress hostname2 = InetAddress.getLocalHost();
            System.out.println("hostname1: " + hostname1);
            System.out.println("hostname2: " + hostname2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
