package six_lesson.HW6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotebookFilter {
    public static List filter(List notebooks, Map filters) {
        List filteredNotebooks = new ArrayList();
        for (NoteBook notebook : notebooks) {
            boolean allFiltersMatch = true;
            for (String filterKey : filters.keySet()) {
                Object filterValue = filters.get(filterKey);
                switch (filterKey) {
                    case "manufaturer":
                        if (!notebook.getManufacturer().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "model":
                        if (!notebook.getModel().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "displaySize":
                        if (!notebook.getDisplaySize().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "displayResolution":
                        if (!notebook.getDisplayResolution().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "ramSize":
                        if (notebook.getRamSize() != (int) filterValue) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "hddSize":
                        if (notebook.getHddSize() != (int) filterValue) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "os":
                        if (!notebook.getOs().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "color":
                        if (!notebook.getColor().equals(filterValue)) {
                            allFiltersMatch = false;
                        }
                        break;
                    case "price":
                        if (notebook.getPrice() != (double) filterValue) {
                            allFiltersMatch = false;
                        }
                        break;
                }
                if (!allFiltersMatch) {
                    break;
                }
            }
            if (allFiltersMatch) {
                filteredNotebooks.add(notebooks);
            }
        }
        return filteredNotebooks;
    }
}
