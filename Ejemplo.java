public class Ejemplo {
    /**Metodo principal donde vemos un ejemplo de paso de parametros por valor y por referencia
    *@param args Argumentos
    **/
    public static void main(String[] args){
	int a = 2; //Es una variable de tipo int
	int[] b = new int [20]; //Un arreglo que tiene 20 enteros
	for(int i = 0; i < b.length; i++){
	    b[i] = i;
	}

	sucesor(a);
	System.out.println("El valor de a es: " + a); //Aqui se trata de paso de parametros por por valor ya que a no se esta modificando
	sucesor(b);
	System.out.println("El sucesor del lugar 14 es: " + b[b.length - 5]); //Este es paso de parametros por referencia, es decir por medio de una especie de puntero
	a = sucesor1(a);
	System.out.println("El sucesor de 2 es: " + a);//El valor se modifica

    }

    /**
     * Metodo que regresa el sucesor de un numero
     * @param a El numero
     **/
    public static void sucesor(int a) {
	a = a + 1;
   }

    /**
     * Metodo que da los sucesores de un arreglo
     * @param a El numero
     **/
    public static void sucesor(int[] a) {
	int d = 0;
	for(int i = 0; i < a.length; i++){
	    d = a[i] + 1; //Da todos los sucesores del arreglo
	}
    }
    /**
     * Metodo que regresa el sucesor de un numero
     * @param a El numero
     * @return El sucesor del numero
     **/
    public static int sucesor1(int a) {
	a = a + 1;
	return a;
    }
}
