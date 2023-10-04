package Retangulo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void calcularArear() {
        //Calcular area do retangulo
        Retangulo retangulo = new Retangulo();
        retangulo.setWidth(10);
        retangulo.setHeight(20);
        assertEquals(200, retangulo.calcularArear());
    }

    @Test
    void getWidth() {
        Retangulo retangulo = new Retangulo();
        retangulo.setWidth(10);
        assertEquals(10, retangulo.getWidth());
    }

    @Test
    void setWidth() {
        Retangulo retangulo = new Retangulo();
        retangulo.setWidth(10);
    }

    @Test
    void getHeight() {
        Retangulo retangulo = new Retangulo();
        retangulo.setHeight(20);
        assertEquals(20, retangulo.getHeight());
    }

    @Test
    void setHeight() {
        Retangulo retangulo = new Retangulo();
        retangulo.setHeight(20);
    }
}