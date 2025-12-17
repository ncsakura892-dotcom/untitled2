import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//     Срок сдачи: ----
// Треугольник деген класс тузунуз.
//Класстын 3 поляси болсун a, b, c.
//Класстын "площадь" деген методу болсун.
//метод "площадь" полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
//таянып консолго уч бурчтуктун аянтын чыгарсын.

        Scanner sc = new Scanner(System.in);


        Trugolnic trugolnic = new Trugolnic();
        System.out.println("san jaz");
        trugolnic.a = sc.nextInt();
        System.out.println("san jaz");
        trugolnic.b = sc.nextInt();
        System.out.println("san jaz");
        trugolnic.c = sc.nextInt();

        trugolnic.ploshat();
    }
}
