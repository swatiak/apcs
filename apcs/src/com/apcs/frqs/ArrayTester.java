package com.apcs.frqs;

public class ArrayTester {
    public static void main(String[] args) {
        //int[][] arr2D = new int[4][3];

        int[][] arr2D = {{0, 1, 2}, {3, 4, 5}, {6,7,8}, {9, 10, 11}};
        int[] column = getGivenColumn(arr2D, 1);

        for(int i =0; i< column.length; i++){
            System.out.println("column: " +i +":" + column[i]);
        } 

        int[] rows = getGivenRow(arr2D, 1);
        for(int i=0; i<rows.length; i++){
            System.out.println("rows: " + rows[i]);
        } 
//printRows(arr2D, 2);
//printColumns(arr2D, 0);
         
        
    }
    
/** Returns an array containing the elements of column c of arr2D in the same order as they * appear in arr2D.
* Precondition: c is a valid column index in arr2D.
* Postcondition: arr2D is unchanged.
    */
    public static int[] getGivenColumn(int[][] arr2D, int c){
        int[] column = new int[arr2D.length];

        for(int r=0; r< arr2D.length; r++){
            column[r] = arr2D[r][c];
        }

        return column;

    }

    public static int[] getGivenRow(int[][] arr2D, int row){
        int[] rows = new int[arr2D.length];
        for(int r=0; r<arr2D.length; r++){
            for(int c=0; c< arr2D.length-1; c++){
                    rows[c] = arr2D[row][c];
            
                
            }
            
        }
        return rows;
    }

    public static void printRows(int[][] arr2D, int column){
        for(int i=0; i<arr2D.length; i++){
            System.out.println(arr2D[i][column]);
           
        }
        

    }

    public static void printColumns(int[][] arr2D, int row){
        for(int i=0; i<arr2D.length; i++){
            for(int j=0; j<arr2D.length-1; j++){
                if(i == row){
                System.out.println("columns: " + arr2D[row][j]);
            }
            }
        }
    }
    
}
