import java.util.*;
import java.util.function.Predicate;

public class Main {

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Введите число!");
            long price = scanner.nextLong();
            Predicate<Deal> isFair = x -> x.getSum() >= x.getArea().getAveragePrice();
            List<Deal> list = generate(new ArrayList<>(), 1500, price);
            long badDeal = list.stream()
                    .filter(isFair)
                    .count();
            System.out.println("Честных сделок: " + badDeal);
        } catch (InputMismatchException exception) {
            System.out.println("Введено не число");
            scanner.nextLine();
            main(args);
        } finally {
            scanner.close();
        }
    }

    public static List<Deal> generate(List<Deal> list, int count, long averagePrice) {
        if (count == 0) {
            return list;
        } if (count < 0) {
            throw new IllegalArgumentException("Количество не может быть отрицательным");
        } else {
            list.add(new Deal(new Area(random.nextLong(), random.nextInt(), averagePrice), random.nextInt()));
            return generate(list, count - 1, averagePrice);
        }
    }
}
