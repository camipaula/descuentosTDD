package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescuentosTest {
    @Test
    public void testDescuentoPorcentaje10() {
        assertEquals(90.0, CalculadoraDescuentos.aplicarDescuentoPorcentaje(100.0, 10.0));
    }

    @Test
    public void testDescuentoPorcentaje30() {
        assertEquals(70.0, CalculadoraDescuentos.aplicarDescuentoPorcentaje(100.0, 30.0));
    }

    @Test
    public void testDescuentoPorcentaje200() {
        assertEquals(0, CalculadoraDescuentos.aplicarDescuentoPorcentaje(100.0, 200.0));
    }

    @Test
    public void testDescuentoFijo(){
        assertEquals(95.0, CalculadoraDescuentos.aplicarDescuentoFijo(100.0, 5.0));
    }
    
    @Test
    public void testDescuentoAcumulado() {
    assertEquals(85.0, CalculadoraDescuentos.aplicarDescuentoAcumulado(100.0, 10.0, 5.0));
    }

    @Test
    public void testPrecioFinal(){
        double original = 200.0;
        double esperado = 200 - (200 * 0.15) -10;
        double resultado = CalculadoraDescuentos.aplicarDescuentoAcumulado(original, 15.0, 10.0);
        assertEquals(esperado, resultado);
    }
}