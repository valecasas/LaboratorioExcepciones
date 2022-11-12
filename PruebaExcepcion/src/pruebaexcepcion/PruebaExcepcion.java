
package pruebaexcepcion;

public class PruebaExcepcion{

public static void main(String args[]){

formatoNumero();
desborde();
aritmetico();
}

public static void formatoNumero(){

int numero;

String cadena=" 1";

try{

numero = Integer.parseInt(cadena);

}

catch(NumberFormatException ex){

System.out.println("No es un número, es una cadena de texto."+ex.getMessage());

}

}

public static void desborde(){

int v[]= new int[3];
try{
for(int i =0; i<5;i++){

v[i]=i;
}}
catch(ArrayIndexOutOfBoundsException ex){
        
        System.out.println("El numero esta mas grande que el vector."+ex.getMessage());
        }
}

public static void aritmetico(){

int numero=5, resultado;
try{
    
resultado= numero/0;

}
catch(ArithmeticException ex){
 
    System.out.println("No se puede dividir por cero."+ex.getMessage());

}
}

}
