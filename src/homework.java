public class homework {
    public static void main(String[] args) {
        int[][] field = new int [11][11];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field [i].length; j++) {
                if (i==j)
                    field[i][j]=1;
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
