import java.util.Scanner;

/* 7) Dada una matriz M, encontrar “el punto de silla”. Se recuerda que “el punto de silla” es aquel elemento que siendo el 
mayor de la fila, es el menor de su columna. No toda matriz tiene “punto de silla”, pero si existe es único. Considere que 
no hay elementos repetidos*/


public class Tarea3 {

    static Scanner in = new Scanner(System.in);
    static int rows=3,columns=3,referencia,elementos,i,j;
    static int matriz[][] = new int[rows][columns];


    public static void RellenarMatriz() {

        System.out.println("");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print("Ingrese los elementos de la matriz: ");
                elementos = in.nextInt();
                matriz[i][j] = elementos;
            }
        }
            for (i = 0; i < rows; i++) {
                for (j = 0; j < columns; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
        
        System.out.println("");

        PuntoDeSilla();
    }

    public static void PuntoDeSilla() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                referencia = matriz[i][j];


                if(i== 0){
                    switch(j){
                        case 0:
                            if(matriz[i][j] > matriz[i][j+1] && matriz[i][j] > matriz[i][j+2]){
                                if(matriz[i][j] < matriz[i+1][j] && matriz[i][j] < matriz[i+2][j]){
                                    System.out.println("Este elemento es un punto de silla: " + matriz[i][j]);
                                }
                            }
                            break;
                        case 1:
                            if(matriz[i][j] > matriz[i][j-1] && matriz[i][j] > matriz[i][j+1]){
                                if(matriz[i][j] < matriz[i+1][j] && matriz[i][j] < matriz[i+2][j]){
                                    System.out.println("Este elemento es un punto de silla: " + matriz[i][j]);   
                                }
                      
                            }
                            break;
                        case 2:
                            if(matriz[i][j] > matriz[i][j-1] && matriz[i][j] > matriz[i][j-2]){
                                if(matriz[i][j] < matriz[i+1][j] && matriz[i][j] < matriz[i+2][j]){
                                    System.out.println("Este elemento es un punto de silla: " + matriz[i][j]);   
                                }
                      
                            }
                            break;                   
                    }
                }
                if(i == 1){
                    switch(j){
                        case 0:
                            if(matriz[i][j] > matriz[i][j+1] && matriz[i][j] > matriz[i][j+2]){
                                if(matriz[i][j] < matriz[i-1][j] && matriz[i][j] < matriz[i+1][j]){
                                    System.out.println("Este elemento es un punto de silla: " + matriz[i][j]);
                                }
                            }
                            break;
                        case 1:
                            if(matriz[i][j] > matriz[i][j-1] && matriz[i][j] > matriz[i][j+1]){
                                if(matriz[i][j] < matriz[i-1][j] && matriz[i][j] < matriz[i+1][j]){
                                    System.out.println("Este elemento es un punto de silla: " + matriz[i][j]);   
                                }
                      
                            }
                            break;
                        case 2:
                            if(matriz[i][j] > matriz[i][j-1] && matriz[i][j] > matriz[i][j-2]){
                                if(matriz[i][j] < matriz[i-1][j] && matriz[i][j] < matriz[i+1][j]){
                                    System.out.println("Este elemento es un punto de silla: " + matriz[i][j]);   
                                }
                      
                            }
                            break;
                    }
                }
                if(i == 2){
                    switch(j){
                        case 0:
                            if(matriz[i][j] > matriz[i][j+1] && matriz[i][j] > matriz[i][j+2]){
                                if(matriz[i][j] < matriz[i-1][j] && matriz[i][j] < matriz[i-2][j]){
                                    System.out.println("Este elemento es un punto de silla: " + matriz[i][j]);
                                }
                            }
                            break;
                        case 1:
                            if(matriz[i][j] > matriz[i][j-1] && matriz[i][j] > matriz[i][j+1]){
                                if(matriz[i][j] < matriz[i-1][j] && matriz[i][j] < matriz[i-2][j]){
                                    System.out.println("Este elemento es un punto de silla: " + matriz[i][j]);   
                                }
                      
                            }
                            break;
                        case 2:
                            if(matriz[i][j] > matriz[i][j-1] && matriz[i][j] > matriz[i][j-2]){
                                if(matriz[i][j] < matriz[i-1][j] && matriz[i][j] < matriz[i-2][j]){
                                    System.out.println("Este elemento es un punto de silla: " + matriz[i][j]);   
                                }
                      
                            }
                            break;                  
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        RellenarMatriz();
        
    }
}




















/*Pd: no es el mejor algoritmo que e escrito por ende no estoy orgulloso de el ya que no es general sino encambio es especifico 
 y a la vsita de cualquier informatico profesional esto es una caca, una falta de respeto pero bueno estoy dispuesto a recibir y 
   soportar las criticas de nuestra comunidad */ 

