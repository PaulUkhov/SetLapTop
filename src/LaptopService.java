import java.util.*;

public class LaptopService {

    // Метод для фильтрации ноутбуков по критериям, указанным пользователем
    public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, Object> filters) {
        Set<Laptop> filteredLaptops = new HashSet<>(laptops);

        for (Laptop laptop : laptops) {
            boolean matches = true;

            // Проверка по каждому критерию
            for (Map.Entry<String, Object> filter : filters.entrySet()) {
                String criterion = filter.getKey();
                Object value = filter.getValue();

                switch (criterion) {
                    case "ram":
                        if (laptop.getRam() < (Integer) value) {
                            matches = false;
                        }
                        break;
                    case "storage":
                        if (laptop.getStorage() < (Integer) value) {
                            matches = false;
                        }
                        break;
                    case "os":
                        if (!laptop.getOs().equalsIgnoreCase((String) value)) {
                            matches = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equalsIgnoreCase((String) value)) {
                            matches = false;
                        }
                        break;
                }
                if (!matches) break;
            }

            if (!matches) {
                filteredLaptops.remove(laptop);
            }
        }
        return filteredLaptops;
    }


}


