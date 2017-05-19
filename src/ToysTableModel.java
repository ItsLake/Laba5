

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ToysTableModel extends AbstractTableModel {

    List<Toy> toys;

    public ToysTableModel(List<Toy> toys) {
        this.toys=toys;
    }
    public int getRowCount() {
        return toys.size();
    }
    public int getColumnCount() {
        return 5;
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return toys.get(rowIndex).getName();
            case 1: return toys.get(rowIndex).getPrice();
            case 2: return toys.get(rowIndex).getMinAge();
            case 3: return toys.get(rowIndex).getMaxAge();
            case 4: return toys.get(rowIndex).getParam();
        }
        return "";
    }
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Имя";
            case 1: return "Цена";
            case 2: return "Мин.возраст";
            case 3: return "Макс.возраст";
            case 4: return "Параметры";
        }
        return "";
    }
}