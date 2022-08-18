package classwork;
import java.util.Random;
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        //Proc1. Описать функцию PowerA3(A), вычисляющую третью степень числа A
        //и возвращающую ее. С помощью этой процедуры найти третьи степени пяти данных чисел.
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        /*
        for (int i = 0;i<5;i++){
            System.out.print("Enter number: ");
            int x = in.nextInt();
            System.out.println(x+"^3="+powerA3(x));
        }
         */
        /*
--------------------------------------------------------------------------------------------------------
         */
        //Proc3. Описать 2 функции aMean(X, Y, aMean, gMean), вычисляющую
        //среднее арифметическое aMean = (X+Y)/2 и среднее геометрическое
        //gMean = √X·Y двух положительных чисел X и Y. С помощью
        //этих функиций найти среднее арифметическое и среднее геометрическое
        //для пар (A, B), (A, C), (A, D), если даны A, B, C, D.
        /*
        int a = 5;
        for (int i = 0;i<3;i++){
            int x = gen.nextInt(10);
            System.out.println(a+ " " +x+ " aMean = "+aMean(a,x));
            System.out.println(a+ " " +x+ " gMean = "+gMean(a,x));
        }
         */
        /*
--------------------------------------------------------------------------------------------------------
         */
        //Proc4. Описать 2 функции triangleP(a), вычисляющую по стороне a
        //равностороннего треугольника его периметр P = 3·a и площадь
        //S = (a^2*√3)/4 (все параметры являются вещественными).
        //С помощью этой процедуры найти периметры и площади
        //трех равносторонних треугольников с данными сторонами.
        /*
        System.out.print("Enter A: ");
        double a = in.nextDouble();
        System.out.println("Периметр = "+triangleP(a)+"\nПлощадь = "+triangleS(a));
         */
        /*
--------------------------------------------------------------------------------------------------------
         */
        //Proc5. Описать функцию RectP(x1, y1, x2, y2), вычисляющую периметр P
        //прямоугольника со сторонами, параллельными осям координат, по координатам (x1, y1), (x2, y2)
        //его противоположных вершин. С помощью этой функции найти периметры трех
        //прямоугольников с данными противоположными вершинами.
        /*
        for (int i = 1;i<=3;i++) {
            System.out.println("Введите стороны прямоугольника "+i+": ");
            System.out.print("X1=");
            int x1 = in.nextInt();
            System.out.print("X2=");
            int x2 = in.nextInt();
            System.out.print("Y1=");
            int y1 = in.nextInt();
            System.out.print("Y2=");
            int y2 = in.nextInt();
            System.out.println("P="+rectP(x1,y1,x2,y2));
        }
        */
        /*
--------------------------------------------------------------------------------------------------------
         */
        //Вычислить площадь треугольника по формуле Герона
        // S = √p*(p-a)*(p-b)*(p-c)
        // р - полупериметр, a, b, c - стороны
        //Проверить с помощью функции, что по сторонам a, b, c можно построить треугольник
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите стороны треуголника: ");
            System.out.print("a=");
            int a = in.nextInt();
            System.out.print("b=");
            int b = in.nextInt();
            System.out.print("c=");
            int c = in.nextInt();
            if (isTriangle(a, b, c)) System.out.println(sGeron(a, b, c));
            else System.out.println("Не треугольник");
        }
    }
    static boolean isTriangle(int a, int b, int c){
        return a+b > c && a+c > b && b+c > a;
    }
    static double sGeron(int a, int b, int c){
        double p = p(a, b, c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    static double p(int a, int b, int c){
        return (a+b+c)/2.0;
    }


    static int rectP(int x1, int y1, int x2, int y2){
        int absX = Math.abs(x2-x1);
        int absY = Math.abs(y2-y1);
        int p = 2*(absX+absY);
        return p;
    }
    static double triangleS(double a){
        return ((a*a)*Math.sqrt(3)/4.0);
    }
    static double triangleP(double a){
        return (3*a);
    }
    static double aMean(int x, int y){
        return (x*y)/2.0;
    }
    static double gMean(int x, int y){
        return Math.sqrt((x*y));
    }
    static int powerA3(int a){
        return a*a*a;
    }
}
