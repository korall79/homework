public class homework1 {
    public static void main(String[] args) {
        int [][] twoDiagonal = new int[9][9];
        for (int i = 0; i < twoDiagonal.length; i++) {
            for (int j = 0; j < twoDiagonal[i].length; j++) {
                if ((i==j)||(i+j==twoDiagonal [i].length-1))
                    twoDiagonal[i][j]=1;
                    System.out.print(twoDiagonal[i][j] + "  ");
                }
                System.out.println();

            }
        }
    }

