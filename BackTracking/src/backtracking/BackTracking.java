package backtracking;

import java.util.Random;
//Encontrar los nomos perdidos
public class BackTracking {
    int fil = 4, col = 4;
    int mat [] [] = new int [fil] [col];
    public void llenar (){
        Random rnd = new Random ();
        for (int i = 0; i < fil; i++){
            for (int j = 0; j < col; j++){
                mat [i] [j] = rnd.nextInt(2);
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
    public void hacerBacktracking (){
        back (0,0);
    }
    public void back (int x, int y){
        if (x>0){ // Hacia Arriba
            if (mat [x-1][y]==1){
                mat [x-1][y] = 2;
                System.out.println("Nomo:" +(x-1+1) + " " + (y+1));
                back ((x-1),(y));
            }
        }
        if (x<fil-1){ //Hacia Abajo
            if (mat[x+1][y]==1){
                mat [x+1][y] = 2;
                System.out.println("Nomo:" + (x+1+1) + " " + (y+1));
                back (x+1,y);
            }
        }
        if (y>0){ // Hacia la Izquierda
            if (mat[x][y-1]==1){
                mat [x][y-1] = 2;
                System.out.println("Nomo:" + (x+1) + " " + (y-1+1));
                back (x,y-1);
            }
        }
        if (y<col-1){ //Hacia la Derecha
            if (mat[x][y+1]==1){
                mat [x][y+1] = 2;
                System.out.println("Nomo:" + (x+1) + " "+ (y+1+1));
                back (x,y+1);
            }
        }
        if (x<fil-1 && y<col-1){ //Hacia Abajo y Derecha
            if (mat[x+1][y+1]==1){
                mat [x+1][y+1] = 2;
                System.out.println("Nomo:" + (x+1+1) + " " + (y+1+1));
                back (x+1,y+1);
            }
        }
        if (x>0 && y<col-1){ //Hacia Arriba y Derecha
            if (mat[x-1][y+1]==1){
                mat [x-1][y+1] = 2;
                System.out.println("Nomo:" + (x-1+1)+ " " + (y+1+1));
                back (x-1,y+1);
            }
        }
        if (x>0 && y>0){ //Hacia Abajo Izquierda
            if (mat[x-1][y-1]==1){
                mat [x-1][y-1] = 2;
                System.out.println("Nomo:" + (x-1+1) + " " + (y-1+1));
                back (x-1,y-1);
            }
        }
        if (x<fil-1 && y>0){
            if (mat[x+1][y-1]==1){ // Hacia Arriba izquierda
                    mat [x+1][y-1] = 2;
                    System.out.println("Nomo:" + (x+1+1) + " " + (y-1+1));
                    back (x+1,y-1);
            }
        }
        
    }
    public static void main(String[] args) {
        BackTracking b = new BackTracking();
        b.llenar();
        b.hacerBacktracking();
    }
    
}
