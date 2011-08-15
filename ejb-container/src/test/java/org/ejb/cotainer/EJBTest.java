package org.ejb.cotainer;

import org.junit.Test;

import junit.framework.TestCase;

public class EJBTest extends TestCase {

    @Test
    public void testSaludaConNombre() {
        JotaEJB ejb = new JotaEJB();
        assertEquals("Hola usuario usuario", ejb.saludando("usuario"));
    }

    @Test
    public void testSaludaConNull() {
        JotaEJB ejb = new JotaEJB();
        assertEquals("Hola usuario usuario2", ejb.saludando("usuario2"));
    }
}
