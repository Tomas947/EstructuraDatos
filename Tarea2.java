
/*6) Dada una matriz A, que es la representación de una matriz sparse, generar una matriz M, que es la sparse de la dada */

public class Tarea2{
    
    static int M[][] = new int[100][100];  
    static int A[][] = {{3,3,3},
                        {0,1,2},
                        {1,0,4},
                        {2,2,-7}};

    public static void a() {
//imprimimos  la matriz optimizada
        System.out.println("Matriz sparse.\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[" + A[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        MatrizOriginal();
    }

   //tranformamos la matriz optimizada a a su version descomprimida                   

    public static void MatrizOriginal(){

        int rows = A[0][0];
        int columns = A[0][1];
	
        for(int i = 1; i < 4; i++){
            
            int fila = A[i][0];
            int columna = A[i][1];
            int valor = A[i][2];
            
            M[fila][columna] = valor;
            
        }

        ImprimirMatriz(rows,columns);

    }

// y luego la imprimimos

    public static void ImprimirMatriz(int rows,int columns) {

        System.out.println("");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print("[" + M[i][j] + "]");
            }
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args) {
        a();
    }
}