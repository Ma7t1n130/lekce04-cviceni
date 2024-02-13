import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();

        Computer computer1 = new Computer("Dell",2019, BigDecimal.valueOf(15000));
        Computer computer2 = new Computer("HP",2018,BigDecimal.valueOf(12000));
        Computer computer3 = new Computer("Lenovo",2017,BigDecimal.valueOf(10000));

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);

        //computers.forEach(System.out::println);

        Collections.sort(computers, Comparator.comparing(Computer::getYearOfProduction).reversed());
        computers.forEach(System.out::println);
        System.out.println("\n");
        Collections.sort(computers, Comparator.comparing(Computer::getPrice));
        computers.forEach(System.out::println);
        System.out.println("\n");
        computers.sort(Comparator.comparing(Computer::getPrice));

    }
}