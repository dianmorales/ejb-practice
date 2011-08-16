package org.ejb.cotainer;

import javax.ejb.Stateless;

@Stateless(name="HelloWorldEJB2dd2")
public class StatelessHelloWorldBean implements StatelessHelloWorldRemote
{
        public String sayHello(String name) {
                return "Hello, "+name+" !";
        }
}

