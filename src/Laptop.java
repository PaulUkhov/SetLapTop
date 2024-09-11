import java.util.*;

public class Laptop {
    private String brand; // Марка
    private int ram; // Объем оперативной памяти
    private int storage; // Объем жесткого диска
    private String os; // Операционная система
    private String color; // Цвет



    // Конструктор класса
    public  Laptop(String brand, int ram, int storage, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return STR."Laptop{brand='\{brand}\{'\''}, ram=\{ram}, storage=\{storage}, os='\{os}\{'\''}, color='\{color}\{'\''}\{'}'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laptop laptop = (Laptop) obj;
        return ram == laptop.ram &&
                storage == laptop.storage &&
                Objects.equals(os, laptop.os) &&
                Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, storage, os, color);
    }
}
