package com.apcs.frqs;

public class Position {

    public Position(int r, int c) {
        System.out.println("(" + r + "," + +c + ")");

    }

    public static void main(String[] args) {
        int[][] intArr = { { 15, 5, 9, 10 }, { 12, 16, 11, 6 }, { 14, 8, 13, 7 } };
        /*
         * for(int r=0; r<intArr.length; r++){
         *  for(int c=0; c<intArr[r].length; c++){
         * System.out.print(intArr[r][c] + " "); } }
         */
       // Position pos = findPosition(8, intArr);
        Position[][] position = getSuccessorArray(intArr);

    }

    public static Position findPosition(int num, int[][] intArr) {

        // define return
        Position pos = null;
        for (int r = 0; r < intArr.length; r++) {
            for (int c = 0; c < intArr[r].length; c++) {
                if (intArr[r][c] == num) {

                    pos = new Position(r, c);

                    return pos;
                }
            }
        }

        return pos;
    }

    public static Position[][] getSuccessorArray(int[][] intArr) {
        Position[][] position = new Position[intArr.length][intArr[0].length];
        for (int r = 0; r < intArr.length; r++) {
            for (int c = 0; c < intArr[r].length; c++) {
                int num = intArr[r][c];
                Position newPos = findPosition(num+1, intArr);
                position[r][c] = newPos;
            }
        }
        return position;
    }

}
