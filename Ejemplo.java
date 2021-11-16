public class Ejemplo {
    /**Metodo principal donde vemos un ejemplo de paso de parametros por valor y por referencia
    *@param args Argumentos
    **/
    public static void main(String[] args){
	int a = 2; //Es una variable de tipo int
	int c = a; //Es otra variable de tipo int que es igual a c
	int[] b = new int [20]; //Un arreglo que tiene 20 enteros
	for(int i = 0; i < b.length; i++){
	    b[i] = i
	}

	sucesor(a);
	System.out.println("El valor de a es: " + a); //Aqui se trata de paso de parametros por por valor ya que a no se esta modificando
	sucesor(b);
	System.out.println("El sucesor del lugar 14 es: " + b[b.length - 5]); //Este es paso de parametros por referencia, es decir por medio de una especie de puntero
	sucesor1(c);
    }

    public static void sucesor(int a) { //Metodo que nos da el sucesor de "a"
	a = a + 1;
    }

    public static void sucesor1(int c) { //Metodo que da el sucesor de "c"
	c = c + 1;
	System.out.println("El sucesor de c es: " + c); //Por medio del s.o.p. el valor se modifica y al salir del metodo tendra un nuevo valor
    }
}
