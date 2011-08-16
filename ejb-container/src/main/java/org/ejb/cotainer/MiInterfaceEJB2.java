package org.ejb.cotainer;

import javax.ejb.Remote;

@Remote
public interface MiInterfaceEJB2 {
    public String saludando(String nombre);
}
