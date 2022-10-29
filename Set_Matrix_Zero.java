import java.util.* ;
import java.io.*;
import java.util.* ;
import java.io.*;

public class Set_Matrix_Zero {
    public void setZeros(int matrix[][]) {
        int rows = matrix.length;
        //int columns = matrix[1].length;

        ArrayList<ArrayList<Integer>> save = new ArrayList<>();
        ArrayList<Integer> position = new ArrayList<>();

        for (int i=0; i<rows; i++) {
            int columns = matrix[i].length;
            System.out.println("rows -> " + rows + " and columns -> " + columns);
            for (int j=0; j<columns; j++) {
                if (matrix[i][j] == 0) {

                    position.add(i);
                    position.add(j);
                    save.add(position);

                    for (int m = 0; m < position.size(); m++) {
                        position.clear();
                    }

//                    System.out.println("first one" + "\n");
//                    for (int a=0; a<columns; a++) {
//                        System.out.println("i -> " + i + " a -> " + a);
//                        matrix[i][a] = 0;
//                    }
//                    System.out.println("second" + "\n");
//                    for (int b=0; b<rows; b++) {
//                        System.out.println("b -> " + b + " j -> " + j);
//                        matrix[b][j] = 0;
//                    }
                }
            }
        }

        for (int i=0; i< save.size(); i++) {
            System.out.println(save.get(i));
        }
    }

    public static void main(String[] args) {
        Set_Matrix_Zero smz = new Set_Matrix_Zero();
        //make a 2d matrix
        int [][] mat = {
                {1, 2, 3},
                {4, 0, 6, 6}
        };

        //call setZero function
        smz.setZeros(mat);
    }
}
