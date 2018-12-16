package programowanie.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void getData(double[] familySalaries, Scanner scan){
        for (int i = 0; i < familySalaries.length; i++) {
            System.out.println("Enter salary for person " + (i + 1));
            familySalaries[i] = scan.nextDouble();
        }

        sortData(familySalaries);
    }

    public static void sortData(double[] familySalaries) {
        Arrays.sort(familySalaries);

        System.out.println("Family salaries (min - max): ");

        for (double i : familySalaries) {
            System.out.println(i);
        }

        System.out.println(" ");

        addData(familySalaries);
    }

    public static double addData(double[] familySalaries) {
        double sum = 0;

        for (double i : familySalaries){
            sum += i;
        }

        System.out.println("Sum of family salaries - " + sum);
        avertageData(sum, familySalaries);
        return sum;
    }

    public static double avertageData(double sum, double[] familySalaries) {
        double avertage = sum / familySalaries.length;

        System.out.println("Avertage salary - " + avertage);
        maxData(familySalaries);
        return avertage;
    }

    public static double maxData(double[] familySalaries) {
        double max = familySalaries[0];

        for (int i = 0; i < familySalaries.length; i++) {
            if(familySalaries[i] > max) {
                max = familySalaries[i];
            }
        }

        System.out.println("The highest salary - " + max);
        minData(familySalaries);
        return max;
    }

    public static double minData(double[] familySalaries) {
        double min = familySalaries[0];

        for (int i = 0; i < familySalaries.length; i++) {
            if (familySalaries[i] < min) {
                min = familySalaries[i];
            }
        }

        System.out.println("The lowest salary - " + min);
        return min;
    }

    public static void main(String[] args) {
        double[] familySalaries = new double[4];
        Scanner scan = new Scanner (System.in);

        getData(familySalaries, scan);
    }
}
