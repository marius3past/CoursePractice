public class Matrice {
    public static void main(String[] args) {
        int[][] matrice = new int[4][6];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = i + j;
                System.out.println(matrice[i][j]);
            }
        }

        for (int j = 0; j < 6; j++) {
            int sum = 0;
            for (int i = 0; i< 4; i++) {
                sum+= matrice[i][j];
            }
            System.out.println(sum);
        }
    }
}

