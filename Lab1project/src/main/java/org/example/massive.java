package org.example;

public class massive {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {8, 7, 8}
        };
        int n = matrix.length;

        int[][] newMatrix = new int[n][n];

        // Правильный поворот на 90° по часовой стрелке
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][n - 1 - i] = matrix[i][j];
                //                  ↑         ↑   ↑
                //              новая строка  ←  старый столбец
                //             новый столбец  ←  (n-1 - старый ряд)
            }
        }

        // Просто выводим новую матрицу как есть
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
