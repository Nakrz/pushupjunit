package com.junitpushup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    private Example example;
    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    @Test
    public void testSumar(){
        //Given - elementos que se tienen para realizar la prueba
        int numberA = 5;
        int numberB = 10;
        //When : Cuando
        int result = example.sumar(numberA, numberB);
        //Then - Entonces
        assertNotNull(result);
        assertEquals(15, result);
        assertInstanceOf(Integer.class, result);
    }   

    // 3
    @Test
    public void testContarLetras() {
        // Given
        String cadena = "balaclawada";
        // When
        int result = example.contarLetrasA(cadena);
        // Then
        assertNotNull(result);
        assertEquals(5, result);
        assertInstanceOf(Integer.class, result);
    }

    // 4
    @Test
    public void testContenerElemento() {
        // Given
        List<String> lista = Arrays.asList("espada", "ametralladora", "sniper");
        String elemento = "sniper";
        // When
        boolean result = example.contieneElemento(lista, elemento);
        // Then
        assertNotNull(result);
        assertTrue(result);
        assertInstanceOf(Boolean.class, result);
    }

    // 5
    @Test
    public void testRevertirString() {
        // Given
        String cadena = "tempanos";
        // When
        String result = example.revertirCadena(cadena);
        // Then
        assertNotNull(result);
        assertEquals("sonapmet", result);
        assertInstanceOf(String.class, result);
    }

    // 6
    @Test
    public void testFactorial() {
        // Given
        int numero = 5;
        // When
        long result = example.factorial(numero);
        // Then
        assertNotNull(result);
        assertEquals(120, result);
        assertInstanceOf(Long.class, result);
    }

    // 7
    @Test
    public void testEsPrimo() {
        // Given
        int numero = 7;
        // When
        boolean result = example.esPrimo(numero);
        // Then
        assertNotNull(result);
        assertTrue(result);
        assertInstanceOf(Boolean.class, result);
    }

    // 8
    @Test
    public void testMensajeRetraso() throws InterruptedException {
        // When
        String result = example.mensajeConRetraso();
        // Then
        assertNotNull(result);
        assertEquals("Listo después de retraso", result);
        assertInstanceOf(String.class, result);
    }

    // 9
    @Test
    public void testConvertirString() {
        // Given
        List<Integer> lista = Arrays.asList(7, 5, 6);
        // When
        List<String> result = example.convertirAString(lista);
        // Then
        assertNotNull(result);
        assertEquals(Arrays.asList("7", "5", "6"), result);
        assertInstanceOf(List.class, result);
    }

    // 10
    @Test
    public void testCalcularMedia() {
        // Given
        List<Integer> lista = Arrays.asList(10, 8, 16);
        // When
        double result = example.calcularMedia(lista);
        // Then
        assertNotNull(result);
        assertEquals(11.333333333333334, result);
        assertInstanceOf(Double.class, result);
    }

    // 11
    @Test
    public void testConvertirListaStr() {
        // Given
        List<String> lista = Arrays.asList("papanatas", "azucaradas");
        // When
        String result = example.convertirListaAString(lista);
        // Then
        assertNotNull(result);
        assertEquals("PAPANATAS,AZUCARADAS", result);
        assertInstanceOf(String.class, result);
    }
}

