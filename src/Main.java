import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Практическое задание № 1.6, РИБО-03-22, Тувыкин Михаил Денисович, Вариант №4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название растения: ");
        String name = scanner.nextLine();
        Plant plant = new Plant(name);
        System.out.println("Введенное вами название: ");
        System.out.println(plant.getTitle());
        Sadovnik Vasia = new Sadovnik(plant);
        Vasia.filter(plant);
        System.out.println("Измененное Васей название: ");
        System.out.println(plant.getTitle());
    }
}