package org.ejb.cotainer;

import org.junit.Test;

import junit.framework.TestCase;

public class EJBTest extends TestCase {

    @Test
    public void testSaludaConNombre() {
        JotaEJB2 ejb = new JotaEJB2();
        assertEquals("Hola usuario usuario", ejb.saludando("usuario"));
    }

    @Test
    public void testSaludaConNull() {
        JotaEJB2 ejb = new JotaEJB2();
        assertEquals("Hola usuario usuario2", ejb.saludando("usuario2"));
    }
}
