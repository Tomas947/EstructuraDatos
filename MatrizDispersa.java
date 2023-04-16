import java.util.Scanner;

public class MatrizDispersa {
  
    int dato = 0,fil = 1,col = 0,cantidad = 0, elementos = 0;
    int i,j,fila,columna;
    final int COLUMNA_DISPERSA = 3;
    
    int matriz[][] = new int[100][100];//esta es la matriz normal
    int matrizDispersa[][] = new int[100][100];//esta la optimizada
    int matrizRestaurada[][] = new int[100][100];//y esta es una nueva pero que es igual a la normal ya que es la optimizada pero descomprimida ergo la normal

    Scanner in = new Scanner(System.in);

    //inicializamos desde la clase Main
    public MatrizDispersa(int fila, int columna){
        this.fila = fila;
        this.columna = columna;

        RellenarMatriz();
    }

    
   //Ingresamos los elementos que va a poseer la matriz
    public void RellenarMatriz(){ 

        for(i = 0; i < fila; i++){
            for(j = 0; j < columna; j++){	

                System.out.print("Ingrese los elementos: ");             
                elementos = in.nextInt();
                matriz[i][j] = elementos;
            }		
        }
        System.out.println("");
        ImprimirMatriz();
    }
    //la imprimimos
    public void ImprimirMatriz(){

        for(i = 0; i < fila; i++){
            for(j = 0; j < columna; j++){             
                System.out.print("[" + matriz[i][j]+ "]");
             
            }
            System.out.println("");		
        }

        RecoleccionDatos();

    }
    // calculamos
    public void RecoleccionDatos(){
	
        dato = 0;
        //contamos la cantidad de elementos distintos de 0
        for(i = 0; i < fila; i++){
            for(j = 0; j < columna; j++){	
                    
                dato = matriz[i][j];			
                if(dato != 0){
                    cantidad++;
                }
            }
        } 

        System.out.print("\n Cantidad de elementos distintos de cero: " + cantidad + "\n\n");
        RecoleccionDatosIndividuales();
    }

   /// generamos la matriz optimizada
    public void RecoleccionDatosIndividuales(){
		
        matrizDispersa[0][0] = fila;
        matrizDispersa[0][1] = columna;
        matrizDispersa[0][2] = cantidad;
              
        for(i = 0; i < fila; i++){
            for(j = 0; j < columna; j++){
                
                dato = matriz[i][j];
                                    
                    if(dato != 0){
                        matrizDispersa[fil][col] = i;
                        matrizDispersa[fil][col+1] = j;
                        matrizDispersa[fil][col+2] = matriz[i][j];
                        fil++;	
                    }
            }
           
        }
        
        ImprimirMatrizDispersa();
    }
//imprimimos la mtriz optimizada
    void ImprimirMatrizDispersa(){
	
        for(i = 0; i < cantidad+1; i++){
            for(j = 0; j < 3; j++){			
                System.out.print("[" + matrizDispersa[i][j]+ "]");
    
            }
            System.out.println("");
        
        }

        MatrizOriginal();
    }
//aqui en base a la matraiz optimizada generamos la matriz original de esa optimizada

    public void MatrizOriginal(){
	
        int rows = matrizDispersa[0][0];
        int columns = matrizDispersa[0][1];
    
        for(int i = 1; i < cantidad+1; i++){
            
            int fila = matrizDispersa[i][0];
            int columna = matrizDispersa[i][1];
            int valor = matrizDispersa[i][2];
            
            matrizRestaurada[fila][columna] = valor;
            
        }	
    
        
        RellenarMatrizOriginal(rows,columns);
        
    }
    
    public void RellenarMatrizOriginal(int rows, int columns){
        
        System.out.println("");
        
        for(i = 0; i < rows; i++){
            for(j = 0; j < columns; j++){               
                System.out.print("[" + matrizRestaurada[i][j] + "]");
                
            }
            System.out.println("");
                      
       }
    }
    
}