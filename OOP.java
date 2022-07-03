package Lesson2;

public class OOP {
    public static void main(String[] args) {
        //Задание 1,2.
        /*
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 6);
        System.out.println(p1.distanceTo(p2));
        */

        //Задание 3.
        /*
        Triangle tr = new Triangle(3, 4, 5);
        tr.print();
        System.out.println(tr.isTriangle());
        */

        //Задание 4,5,6.
        /*
        Fraction f1 = new Fraction(7, 7);
        Fraction f2 = new Fraction(3, 2);
        //f1.subtract(f2);
        System.out.println(f1.toString());
        */
    }
}

//Задание 1,2.
/*
class Point {
    private double x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(x);
        System.out.println(y);
    }

    double distanceTo(Point other) {
        return Math.sqrt((other.x-x)*(other.x-x) + (other.y-y)*(other.y-y));
    }
}
*/

//Задание 3.
/*
class Triangle {
    private double a, b, c;

    Triangle() {
        a = 0;
        b = 0;
        c = 0;
    }

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double get_a() {return a;}
    double get_b() {return b;}
    double get_c() {return c;}

    void set_a(double a) {
        this.a = a;
    }
    void set_b(double b) {
        this.b = b;
    }
    void set_c(double c) {
        this.c = c;
    }

    void print() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    boolean isTriangle() {
        return (a+b>c && a+c>b && b+c>a);
    }
}
*/

//Задание 4,5,6.
/*
class Fraction {
    private int num, den; // Числитель, знаменатель

    // Сокращение дроби
    private void cut() {
        // Алгоритм Евклида
        int a = Math.abs(num), b = Math.abs(den);

        while (a!=0 && b!=0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }

        int gcd = a+b;

        num /= gcd;
        den /= gcd;
    }

    Fraction() {
        num = 0;
        den = 1;
    }

    Fraction(int num, int den) {
        if (den == 0) {
            System.out.println("Ошибка. 0 не может быть в знаменателе. Установлено значение 1");
            this.den = 1;
        }
        else {
            this.den = den;
        }
        this.num = num;

        cut();
    }

    int get_num() {return num;}
    int get_den() {return den;}

    void set_num(int num) {
        this.num = num;
        cut();
    }
    void set_den(int den) {
        if (den == 0) {
            System.out.println("Ошибка. 0 не может быть в знаменателе. Установлено значение 1");
            this.den = 1;
        }
        else {
            this.den = den;
        }

        cut();
    }

    @Override
    public String toString() {
        if (num > den) {
            return num/den + "_" + num%den + "/" + den;
        }
        else {
            return num + "/" + den;
        }
    }

    void multiply(Fraction other) {
        num *= other.num;
        den *= other.den;
        cut();
    }

    void divide(Fraction other) {
        num *= other.den;
        den *= other.num;
        cut();
    }

    void sum(Fraction other) {
        num = num*other.den + den*other.num;
        den *= other.den;
        cut();
    }

    void subtract(Fraction other) {
        num = num*other.den - den*other.num;
        den *= other.den;
        cut();
    }
}
*/
