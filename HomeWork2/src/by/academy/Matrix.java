package by.academy;


import java.util.Arrays;

public class Matrix {


    public void findNumber(int[] matrix) {
        int numOfElement = 0;
        Arrays.sort(matrix);
        for (int i = 0; i < matrix.length; i++) {

            if (matrix.length == 2) {
                System.out.println("Невозможно определить");          // добавил проверку, если массив состоит из 2-х элементов
                break;
            }

            int count = 0;
            for (int j = 1; j < matrix.length; j++) {                  //с этой частью были проблемы. пока не сделал счетчик,
                if (matrix[i] == matrix[j]) count++;                   // пытался сравнить matrix[i] == matrix[i+1] но постоянно выходил за диапазон массива
            }
            if (count % 2 != 0) numOfElement = i;
        }
        System.out.println(matrix[numOfElement]);
    }
}
