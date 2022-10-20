/***
 * реализовать ромб из единиц посередине квадратного поля
 */


public class homework2 {
    public static void main(String[] args) {
        int[][] romb = new int[9][9];

        if (romb.length != romb[0].length || romb.length % 2 == 0) {
            System.out.println("Ошибка! Массив должен быть квадратным и нечетной длины.");
        }

        int startIndex = romb.length / 2;
        int endIndex = startIndex;

        for (int i = 0; i < romb.length; i++) {
            for (int j = 0; j < romb[i].length; j++) {

//                if ((i + j) >= romb[i].length / 2 && (j - i) <= romb[i].length / 2 && (i - j) <= romb[i].length / 2)

                if (j >= startIndex && j <= endIndex)
                    romb[i][j] = 1;
                System.out.print(romb[i][j] + "  ");
            }

            if (i < romb.length / 2) {
                startIndex--;
                endIndex++;

            } else {
                startIndex++;
                endIndex--;

            }
            System.out.println();
        }
    }
}
