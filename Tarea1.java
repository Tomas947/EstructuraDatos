/*Dada una lista ordenada L de n elementos, eliminar, si es que se encuentra en L, un elemento x. Si x no existe en 
L, emitir un mensaje. Si x se encuentra en L, eliminarlo, manteniendo la densidad de la lista. 
Para señalar que se eliminó un elemento ponga un “*” en L( n ) .
*/

public class Tarea1{

    public static void main(String[] args) {
        boolean bandera = false;
        int L[] = {1,2,3,4,5};


        System.out.println("");
        for (int i = 0; i < L.length; i++) {
            System.out.print("["+L[i]+"]");
        }
        System.out.println("\n");

        for(int i = 0; i < 5; i++){// en nuestro caso el elemento x sera los numeros pares
            int par = L[i] % 2;
        
            
            if (par == 0) {
                bandera = true;
                System.out.println("El elemento par " + L[i] + " ah sido borrado y reemplazado por 0.\n");
                L[i] = 0;
            }

        }

        for (int i = 0; i < L.length; i++) {
            System.out.print("["+L[i]+"]");
        }
        System.out.println("");


        if(bandera == false){
            System.out.println("No se han encontrado elementos pares en la lista.\n");
        }
        
    }




}