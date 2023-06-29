package six_lesson.HW6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NoteBook {

    private String manufacturer;
    private String model;
    private String displaySize;
    private String displayResolution;
    private int ramSize;
    private int hddSize;
    private String os;
    private String color;
    private double price;

    public NoteBook(String manufacturer, String model, String displaySize, String displayResolution, int ramSize,
            int hddSize, String os, String color, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.displaySize = displaySize;
        this.displayResolution = displayResolution;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        List notebooks = new ArrayList<>();
        notebooks.add(new NoteBook("Lenovo", "ThinkPad X1 Carbon", "14 дюймов", "1920x1080", 8, 512, "Windows 10",
                "Black", 100000));
        notebooks.add(new NoteBook("Asus", "ZenBook", "13 дюймов", "1920x1080", 16, 512, "Windows 10",
                "Golden", 200000));
        notebooks.add(new NoteBook("Apple", "MacBook Pro", "15 дюймов", "2880x1800", 16, 256, "macOS",
                "Grey space", 300000));

        Map filters = new HashMap<>();
        System.out.println("Choce filter: ");
        System.out.println("1 - Manufacturer");
        System.out.println("2 - Model");
        System.out.println("3 - displaySize");
        System.out.println("4 - displayResolution");
        System.out.println("5 - ramSize");
        System.out.println("6 - hddSize");
        System.out.println("7 - os");
        System.out.println("8 - color");
        System.out.println("9 - Price");

        Scanner sc = new Scanner(System.in);
        int filterNumber = sc.nextInt();
        String filterKey = "";
        switch (filterNumber) {
            case 1:
                filterKey = "manufacturer";
                System.out.println("Enter manufacturer: ");
                String manufacturer = sc.next();
                filters.put(filterKey, manufacturer);
                break;
            case 2:
                filterKey = "model";
                System.out.println("Enter model: ");
                String model = sc.next();
                filters.put(filterKey, model);
                break;
            case 3:
                filterKey = "displaySize";
                System.out.println("Enter displaySize: ");
                String displaySize = sc.next();
                filters.put(filterKey, displaySize);
                break;
            case 4:
                filterKey = "displayResolution";
                System.out.println("Enter displayResolution: ");
                String displayResolution = sc.next();
                filters.put(filterKey, displayResolution);
                break;
            case 5:
                filterKey = "ramSize";
                System.out.println("Enter ramSize: ");
                int ramSize = sc.nextInt();
                filters.put(filterKey, ramSize);
                break;
            case 6:
                filterKey = "hddSize";
                System.out.println("Enter hddSize: ");
                int hddSize = sc.nextInt();
                filters.put(filterKey, hddSize);
                break;
            case 7:
                filterKey = "os";
                System.out.println("Enter os: ");
                String os = sc.next();
                filters.put(filterKey, os);
                break;
            case 8:
                filterKey = "color";
                System.out.println("Enter color: ");
                String color = sc.next();
                filters.put(filterKey, color);
                break;
            case 9:
                filterKey = "price";
                System.out.println("Enter price: ");
                double price = sc.nextDouble();
                filters.put(filterKey, price);
                break;
        }

        List filteredNotebooks = NotebookFilter.filter(notebooks, filters);
        if (filteredNotebooks.size() == 0) {
            System.out.println("No notebooks, change filters");
        } else {
            for (NoteBook notebook : filteredNotebooks) {
                System.out.println(notebook.getManufacturer() + " " + notebook.getModel() + " "
                        + notebook.getDisplaySize() + " " + notebook.getDisplayResolution() + " "
                        + notebook.getRamSize() + " " + notebook.getHddSize() + " " + notebook.getOs() + " "
                        + notebook.getColor() + " " + notebook.getPrice());
            }
        }
    }
}
