package operacionesmatemaricas;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculadoraTest {
    Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora= new Calculadora();
    }

    @AfterEach
    void tearDown() {
        calculadora=null;
    }

    @BeforeAll
    static void  alIniciarTodasLasPruevas(){
        System.out.println("Iniciar todas las pruevas");
    }

    @AfterAll
    static void alFinalizarTodasLasPruevas(){
        System.out.println("Finalizar todas las pruevas");
    }

    @Test
    @Order(1)
    void sumar() {
        int num1=5;
        int num2=6;
        int resultadoEsperado=11;

        int resultado = calculadora.sumar(num1,num2);
        assertEquals(resultadoEsperado,resultado);
    }

    @Test
    @Order(1)
    void restar() {
        int num1=10;
        int num2=6;
        int resultadoEsperado=4;

        int resultado = calculadora.restar(num1,num2);
        //assertTrue(resultadoEsperado==resultado);
    }

    @Test
    @Order(1)
    void multiplicar() {
        int num1=10;
        int num2=6;
        int resultadoEsperado=60;

        int resultado = calculadora.multiplicar(num1,num2);
       if (resultadoEsperado!=resultado){
           fail("Que pendejo ni mutiplicar save");
       }
    }
    @Test
    @Order(1)
    void dividir() {
        int num1=10;
        int num2=0;
        int resultadoEsperado=0;

        if(num2!=0){
            int resultado = calculadora.dividir(num1,num2);
            if (resultadoEsperado!=resultado){
                fail("Que pendejo ni mutiplicar save");
            }

        }else {
            assertThrows(
                    ArithmeticException.class,
                    () ->{
                        int result= calculadora.dividir(num1,num2);
                    }
            );
        }

    }

}