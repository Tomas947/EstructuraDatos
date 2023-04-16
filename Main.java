import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("\n Ingrese la cantidad de fila: ");
        int fila = in.nextInt();

        System.out.print("\n Ingrese la cantidad de columnas: ");
        int columna = in.nextInt();
        System.out.println("");

        MatrizDispersa mensajero = new MatrizDispersa(fila,columna);
    }
    
}
