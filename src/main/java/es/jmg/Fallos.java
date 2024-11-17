package es.jmg;

public class Fallos {

    public static void main(String[] args) {
        int[] matriz = new int[5];
        matriz[0] = 11;
        matriz[1] = 24;
        matriz[2] = 65;
        matriz[3] = 89;
        matriz[4] = 101;
        // o bien int[] matriz = {11,24,65,89,101};

        for (int i : matriz) {
            System.out.println(i+", ");
        }
        
        // Provocamos un error.
        // Normalmente haríamos: if (indice>=0 && indice<matriz.length) { entonces entra}
        System.out.println("Tamaño de la matriz: "+matriz.length);
        try{
            matriz[200] = 120;
        } 
        // ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ha habido una asignación de un valor a un índice fuera del rango de esa matriz");
            System.out.println("Mensaje de error: " + e.getMessage()); 
            // La 'e' es la variable del objeto error que crea Java ante cualquier error. Se le puede dar casi cualquier nombre.
        }
        

        for (int i=0;i<matriz.length;i++){
            matriz[i]+= 2;
        }


    }
}
