public class homework2 {
    public static void main(String[] args) {
        int [] [] romb = new int[9][9];
        for (int i = 0; i < romb.length; i++) {
            for (int j = 0; j < romb[i].length; j++) {
               if ((i+j)>=romb[i].length/2 && (j-i)<=romb[i].length/2)

                romb [i][j]=1;

                System.out.print( romb[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
