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
	System.out.println("El valor de a es: " + a);
	sucesor(b);
	System.out.println("El sucesor del lugar 14 es: " + b[b.length - 5]);

}
