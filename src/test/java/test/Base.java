/*
 * The MIT License
 *
 * Copyright 2016 CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package test;

import static org.junit.Assert.*;
import java.net.InetAddress;
import java.io.IOException;
import java.net.Socket;

class Base {

    protected void run() {
        try {
            InetAddress address1 = InetAddress.getByName("127.0.0.1");
            InetAddress address2 = InetAddress.getByName("localhost");
            InetAddress address3 = InetAddress.getByName("0.0.0.0");
            boolean reachable1 = address1.isReachable(10000);
            boolean reachable2 = address2.isReachable(10000);
            boolean reachable3 = address2.isReachable(10000);

            System.out.println("Is 127.0.0.1 reachable1? " + reachable1);
            System.out.println("Is localhost reachable2? " + reachable2);
            System.out.println("Is 0.0.0.0 reachable3? " + reachable3);

            String hostname1 = InetAddress.getLocalHost().getHostName();
            InetAddress hostname2 = InetAddress.getLocalHost();
            System.out.println("hostname1: " + hostname1);
            System.out.println("hostname2: " + hostname2.toString());

            // Socket socket1 = new Socket("127.0.0.1", 9999);
            // Socket socket2 = new Socket("0.0.0.0", 9999);
            // Socket socket3 = new Socket("0.0.0.0", 9999);
            // System.out.println("socket1 isClosed: " + socket1.isClosed());
            // System.out.println("socket1 isConnected: " + socket1.isConnected());
            // System.out.println("socket2 isClosed: " + socket2.isClosed());
            // System.out.println("socket2 isConnected: " + socket2.isConnected());
            // System.out.println("socket3 isClosed: " + socket3.isClosed());
            // System.out.println("socket3 isConnected: " + socket3.isConnected());
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
            e.printStackTrace();
            fail("oops");
        }
        // double r = Math.random();
        // if (r < 0.1) {
        //     fail("oops");
        // } else if (r < 0.2) {
        //     throw new AssumptionViolatedException("skipping");
        // }
    }

}
