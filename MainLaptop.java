import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainLaptop {
    public static void main(String[] args) throws Exception {
        Laptop laptop1 = new Laptop("ASUS Vivobook Go 15", 8, 512, "Windows 11", "серый", 15.6);
        Laptop laptop2 = new Laptop("MSI GF76 Katana 17", 8, 256, "без ОС", "чёрный", 17.3);
        Laptop laptop3 = new Laptop("Lenovo IdealPad 5", 8, 256, "Windows 11", "белый", 15.6);
        Laptop laptop4 = new Laptop("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
        Laptop laptop5 = new Laptop("HP 250 G7", 4, 1024, "без ОС", "черный", 15.6);
        Laptop laptop6 = new Laptop("ASUS Laptop 15", 4, 1000, "Windows 10", "чёрный", 15.6);
        Laptop laptop7 = new Laptop("Acer Extensa 15", 4, 256, "Windows 11", "чёрный", 15.6);
        Laptop laptop8 = laptop1;

        Set<Laptop> unicLaptop = new HashSet<>(
                Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8));

        System.out.printf("Первый ноутбук идентичен десятому: %b \n", laptop1.equals(laptop6));
        System.out.printf("Всего уникальных ноутбуков: %d \n", unicLaptop.size());

        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.println("объем накопителя: ");
        int storUser = sc.nextInt();
        System.out.println("диагональ: ");
        double digUser = sc.nextDouble();
        sc.nextLine();
        System.out.println("операционная система: ");
        String osUser = sc.nextLine();
        System.out.println();
        for (Laptop lap : unicLaptop) {
            if ((lap.getRam() >= ramUser) && (lap.getStorageCap() >= storUser) && (lap.getDiagonal() >= digUser)
                    && (lap.getOS().equals(osUser))) {
                System.out.println(lap.toString());
            }
        }
        sc.close();
    }
}