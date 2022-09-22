//import java.util.Arrays;

public class uwu {
    public static void main(String[] args) {
        // Возможно, что первая версия варианта просила создать массив d,
        // хотя два одноименных массива не поставить.
        // Я хотел сделать что-то вроде нормального копирования во 
        // временный массив и пересоздания массива с названием a,
        // но быстрый гуглопоиск показал, что "Java вам не C++"
        long [] d = new long [14];
        int it = 0;
        for (int i = 2; it < 14; i++) { // it < 14 - количество элементов в отрезке [2, 15] 
            d[it] = i;
            it++;
        }
        float [] x = new float [11];
        for (int i = 0; i < 11; i++) {
            x[i] = (float)(Math.random()) * (15 + 14) - 14; 
        }
        double[][] a = new double[14][11];
        for (int i = 0; i < 14; i++) {
            if (i == 8) {
                for (int j = 0; j < 11; j++) {
                    a[i][j] = func_1(x[j]);
                }
            } else if (i == 3 || i == 5 || i == 6 || i == 7 || i == 9 || i == 11 || i == 14) {
            // } else if (Arrays.asList({3, 5, 6, 7, 9, 11, 14}).contains(i)) { // кринж момент, плюсы лучше
                for (int j = 0; j < 11; j++) {
                    a[i][j] = func_2(x[j]);
                }
            } else {
                for (int j = 0; j < 11; j++) {
                    a[i][j] = func_3(x[j]);
                }
            }
        }
        System.out.print("i\t");
        for (int j = 0; j < 11; j++) {
            System.out.print("i[" + j + "]\t");
        }
        System.out.print("\n");
        for (int i = 0; i < 14; i++) {
            System.out.print(i +"\t");
            for (int j = 0; j < 11; j++) {
                System.out.printf("%.2f\t", a[i][j]);
            }
            System.out.print("\n");

        }
    }

    public static double func_1 (float x) {
        return 4 - Math.sin(x/(x+4));
    }

    public static double func_2 (float x) {
        double degree = 1/3 * (0.5 + Math.asin((x+0.5)/29));
        double result = Math.pow(2*Math.pow((x-1), degree), 3);
        return result;
    }

    public static double func_3 (float x) {
        double degree = Math.pow(Math.pow(x, 1/3 * Math.pow(Math.E, x)/(1 - Math.atan((x+0.5)/29)))/3, 2);
        double result = Math.pow(Math.asin(Math.pow((x+0.5)/29, 2))/6, degree);
        return result;
    }
}
