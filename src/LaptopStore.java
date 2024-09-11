import java.util.*;

public class LaptopStore {
    public static Map<String, Object> getFiltersFromUser() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Марку ноутбука");    
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("5 - ОЗУ");

        String input = scanner.nextLine();
        String[] criteria = input.split(",");

        for (String criterion : criteria) {
            switch (criterion.trim()) {
                case "1":
                    System.out.println("Введите марку:");
                    String brand = scanner.nextLine();
                    filters.put("brand", brand);
                    break;
                case "2":
                    System.out.println("Введите минимальный объем ЖД:");
                    int storage = scanner.nextInt();
                    filters.put("storage", storage);
                    break;
                case "3":
                    System.out.println("Введите операционную систему:");
                    String os = scanner.next();
                    filters.put("os", os);
                    break;
                case "4":
                    System.out.println("Введите цвет:");
                    String color = scanner.next();
                    filters.put("color", color);
                    break;
                case "5":
                     System.out.println("Введите минимальное значение ОЗУ:");
                    int ram = scanner.nextInt();
                    filters.put("ram", ram);
                    break;
                default:
                    System.out.println("Некорректный ввод, попробуйте снова.");
                    break;
            }
        }
        return filters;
    }
    }





