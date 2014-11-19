// Jennie-rose Barrella
// CSE2
// November 19,2014

public class lab13 {
    public static void main(String [] args) {
        
        int [] [] stuff  = new int [5] [];
        
        for (int j =0; j<5; j++) {
            stuff [j] = new int [j*3+5];   
        }
        
        for (int i = 0; i<5; i++) {
            for (int j =0; j<(i*3+5); j++) {
                int x = (int)(Math.random()*39);
                stuff [i] [j] = x;
                System.out.print(stuff[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        
        for (int i = 0; i<5; i++) {
            for (int j =1; j<((int)(i*3+5)); j++) {
                for (int x = 0; x<((int)(i*3+5)); x++) {
                if (stuff[i] [j] < stuff [i] [x]) {
                    int temp = stuff [i] [j];
                    stuff [i] [j] = stuff [i] [x];
                    stuff [i] [x] = temp;
                    
                }
                }
            }
        }
        
        System.out.println();
        for (int i = 0; i<5; i++) {
            for (int j =0; j<(i*3+5); j++) {
                System.out.print(stuff[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}