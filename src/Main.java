import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//-Создать множество ноутбуков.
//-Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map.
//Например:
//        Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//        -Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//-Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        // Добавление ноутбуков в множество
        laptops.add(new Laptop("Asus", 16, 512, "Windows", "Black"));
        laptops.add(new Laptop("Dell", 8, 256, "Linux", "Blue"));
        laptops.add(new Laptop("Apple", 32, 1024, "MacOS", "Silver"));
        laptops.add(new Laptop("HP", 16, 512, "Windows", "White"));

        // Запрос критериев фильтрации у пользователя
        Map<String, Object> filters = LaptopStore.getFiltersFromUser();

        // Фильтрация ноутбуков по критериям
        Set<Laptop> filteredLaptops = LaptopService.filterLaptops(laptops, filters);

        // Вывод результатов фильтрации
        if (filteredLaptops.isEmpty()) {
            System.out.println("Ноутбуков, соответствующих заданным критериям, не найдено.");
        } else {
            System.out.println("Найденные ноутбуки:");
            for (Laptop lap : filteredLaptops) {
                System.out.println(lap);
            }
        }
    }
