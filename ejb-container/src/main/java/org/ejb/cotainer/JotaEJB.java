package org.ejb.cotainer;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class JotaEJB implements MiInterfaceEJB{
    public String saludando(final String saludo){
        return "Hola usuario "+saludo;
    }
}
