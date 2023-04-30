package A0_BASIC;

public class Pattern {

    void pattern1(int row, int col) {
        /*
         * #Solid Rectangle
         ****
         ****
         **** 
         */
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern2(int row, int col) {
        /*
         * #Hollow Rectangle
         *****
         * *
         *****
         */

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }

    }

    void pattern3(int row, int col) {
        /*
         * #Butteryfly Rectangle
         *****
         * *
         *****
         */

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (j <= i || j > col - i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= col; j++) {
                if (j <= i || j > col - i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }

    }

}
