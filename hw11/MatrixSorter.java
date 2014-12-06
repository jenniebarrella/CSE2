public class MatrixSorter{
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+ findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }

    public static int [] [] [] buildMat3d () {
        int mat3d [] [] [] = new int [3] [] []; // create three 3d array with 3 slabs
        
        // alot spaces
        for (int s=0; s<3; s++){ // 3 slabs
            int k = (int)3+2*s; // rows
            mat3d [s] = new int [k] []; // items in row, [dont know yet]
            for (int r=0; r<k; r++) { // for all the rows
                mat3d [s][r] = new int [s+r+1]; // each item in row
            }
        }
        
        // fill spaces
        for (int s=0; s<3; s++) { // for each slab
            for (int k=0; k<3+2*s; k++) { // for each row
                for (int t=0; t<s+k+1; t++) { // each spot in row
                    int x = (int)(Math.random()*99+1); // random number between 1 and 99
                    mat3d [s] [k] [t] = x;
                }
            }
        }
        
        return mat3d; // return the array creates
    }
    
    public static int [] [] [] show (int [] [] [] mat3d) {
        
        //print
        for (int s=0; s<3; s++) { // each slab
            System.out.println("----------------------------------- slab "+(s+1)); // print this before each slab
            for (int k=0; k<mat3d[s].length ; k++) { // rows
                for (int t=0; t<mat3d[s][k].length ; t++) { // numbers
                    System.out.print(mat3d[s][k][t]); // print
                    System.out.print(" "); // spaces between each number
                }
                System.out.println(); // new line for new row
            }
        }
        System.out.println("-----------------------------------"); // at the end of all the slabs
        System.out.println(); // new line
        return mat3d;
    }

    public static int findMin (int [] [] [] mat3d) {
        
        int min = 99; // random start for min- largest possible number so all below
        
        for (int s=0; s<3; s++) { // slabs
            for (int k=0; k<mat3d[s].length ; k++) { // rows
                for (int t=0; t<mat3d[s][k].length ; t++) {  // numbers
                    if (mat3d[s][k][t]<min) { // if new number less than previous min
                        min = mat3d[s][k][t]; // set to new min
                    }
                }
            }
        }       
        return min;
    }

    public static void sort (int [] [] mat2d) {
        
        // sort rows
        for (int k=0; k<(3+2*2); k++) { // rows
            for (int t=0; t<(2+k+1); t++) { // compare each number to this
                for (int i=t+1; i<(2+k+1); i++) { // number in row
                    if (mat2d [k][i] < mat2d [k][t]) { // if new number less than big number t
                        int l = mat2d [k][i]; // switch them- set temp
                        mat2d [k][i] = mat2d [k][t]; // set new to old
                        mat2d [k][t] = l; // set old to temp
                    }
                }
            }
        }
        
        // sort by the first in the row
        for (int k=1; k<(3+2*2); k++) { // rows
            int n = k; // number equal to original row number
            while (mat2d [n][0] < mat2d [n-1][0]) { // if the first in the row less than the first in previous row switch
                int [] l = mat2d [n]; // temp for the new
                mat2d [n] = mat2d [n-1]; // set new to old
                mat2d [n-1] = l; // old to new
                if (n > 1) { // cant go below the second term because comparing to one before it
                    n--; // decreas this so follow the "new" term
                }
            }
        }
    }


}

