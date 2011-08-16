package org.ejb.cotainer;

import javax.ejb.Stateless;

@Stateless(name = "jotaEBJ222")
public class JotaEJB2 implements MiInterfaceEJB2{
    public String saludando(final String saludo){
        return "Hola usuario "+saludo;
    }
}
