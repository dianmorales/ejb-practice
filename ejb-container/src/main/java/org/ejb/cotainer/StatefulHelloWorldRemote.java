package org.ejb.cotainer;

import javax.ejb.Remote;

@Remote
public interface StatefulHelloWorldRemote {
        public String sayHello(String name);
        public String sayHello(int name);
}

