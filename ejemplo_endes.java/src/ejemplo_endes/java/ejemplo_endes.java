package ejemplo_endes.java;
import java.util.Arrays;
import java.util.Scanner;

public class ejemplo_endes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []numeros;
        int[]destino;
        int tam,rotacion;


        System.out.println("Introduce el tamaño");
        tam= sc.nextInt();

        numeros = new int[tam];
        destino = new int[tam];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= (int) (Math.random()*10);
        }
        System.out.println("Introduce el desplazamiento");
        rotacion= sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            destino[(i+rotacion)% numeros.length] = numeros[i];
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(destino));
    }
}
