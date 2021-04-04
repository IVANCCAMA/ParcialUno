
/**
 * Write a description of class Fraccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraccion
{
    // instance variables - atributos
    int numerador;
    int denominador;
    /**
     * Constructor for objects of class Fraccion
     */
    public Fraccion(int numerador, int denominador)
    {
        // initialise instance variables
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * sumar permite a una fraccion dado otra obtener
     * resultado de sumarlos
     * 
     * @param  otr es de clase Fraccion
     * @return     Una Fraccion resultado 
     */
    Fraccion sumar(Fraccion otra)
    {
        // put your code here
        Fraccion suma;
        int numSuma = (numerador * otra.denominador) 
        + (otra.numerador * denominador);
        int denSuma = denominador * otra.denominador;
        suma = new Fraccion(numSuma, denSuma);
        return suma;
    }
    
    String mostrar (){
        return numerador + "/" + denominador;
    }
    
    // hacer resta de fraaciones 
}
