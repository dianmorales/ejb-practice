package org.ejb.cotainer;

import javax.ejb.Remote;

@Remote
public interface StatelessHelloWorldRemote {
        public String sayHello(String name);
}

