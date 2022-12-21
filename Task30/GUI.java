package Pract30;
import Pract29.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.ArrayList;

public class GUI extends JFrame {
    public JTable menuTable;
    OrderManager orderManager1 = new OrderManager();
    OrderManager orderManager2 = new OrderManager();
    OrderManager orderManager3 = new OrderManager();
    OrderManager orderManager4 = new OrderManager();
    OrderManager orderManager5 = new OrderManager();
    OrderManager orderManager6 = new OrderManager();
    OrderManager orderManager7 = new OrderManager();

    public GUI(){
        super("Restaurant");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 300);
        setLocationRelativeTo(null);

        JPanel pN = new JPanel(new FlowLayout());
        JPanel pN1 = new JPanel(new FlowLayout());
        JButton restaurantOrderBtn = new JButton("Restaurant order");
        JButton internetOrderBtn = new JButton("Internet order");
        JButton showRestBtn = new JButton("Show restaurant orders");
        JButton removeRestBtn = new JButton("Remove restaurant order");
        JButton showInterOrderBtn = new JButton("Show internet orders");
        JButton removeInterOrderBtn = new JButton("Remove internet order");

        pN.add(restaurantOrderBtn);
        pN1.add(internetOrderBtn);
        pN.add(showRestBtn);
        pN.add(removeRestBtn);
        pN1.add(showInterOrderBtn);
        pN1.add(removeInterOrderBtn);

        showInterOrderBtn.addActionListener(e -> {
            getInterOrderGUI();
        });
        removeInterOrderBtn.addActionListener(e -> {
            removeInterOrderGUI();
        });

        showRestBtn.addActionListener(e -> {
            getRestOrderGUI();
        });

        removeRestBtn.addActionListener(e -> {
            removeRestOrderGUI();
        });

        internetOrderBtn.addActionListener(e -> {
            internetOrderBtnClick();
        });

        restaurantOrderBtn.addActionListener(e -> {
            try {
                restaurantOrderBtnClick();
            }catch (Exception ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        ArrayList<String> dish = new ArrayList<>();
        dish.add("Pasta: Carbonara: 490");
        dish.add("Pasta: Lasagna: 500");
        dish.add("Pizza: Pepperoni: 470");
        dish.add("Pizza: 4 cheeses: 490");
        dish.add("Salad: Caesar: 340");
        dish.add("Water: Still, Sparkling: 120");
        dish.add("Juice: Orange, Apple, Cherry: 190");
        dish.add("Beer: Light, Dark: 300");

        Object[] headers = new String[] {"Name", "Description", "Price"};
        Object [][] startMenu = new String[dish.size()][3];
        String[] str = new String[10];
        for(int i = 0; i < dish.size(); i++){
            str = dish.get(i).split(":");
            startMenu[i][0] = str[0];
            startMenu[i][1] = str[1];
            startMenu[i][2] = str[2];
        }
        menuTable = new JTable( new DefaultTableModel(startMenu, headers)){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };

        JTableHeader header = menuTable.getTableHeader();
        header.setReorderingAllowed(false);  // метод разрешения перемещения колонок
        header.setResizingAllowed(false);  // метод изменения ширины колонок


        getContentPane().add(new JScrollPane(menuTable), BorderLayout.CENTER);

        getContentPane().add(pN, BorderLayout.NORTH);

        getContentPane().add(pN1, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void removeRestOrderGUI() {
        String s = JOptionPane.showInputDialog("Table number");
        int i = Integer.valueOf(s);
        if (i == 1) orderManager1.removeOrder(i);
        else if (i==2) orderManager2.removeOrder(i);
        else if (i==3) orderManager3.removeOrder(i);
        else if (i==4) orderManager4.removeOrder(i);
        else if (i==5) orderManager5.removeOrder(i);
        else {
            JOptionPane.showMessageDialog(this,"This table doesn't exist!");
            return;
        }
    }

    public void getRestOrderGUI() {
        String s = JOptionPane.showInputDialog("Table number");
        int i = Integer.valueOf(s);
        Object obj;
        if (i == 1) obj = orderManager1.getOrder(i);
        else if (i==2) obj = orderManager2.getOrder(i);
        else if (i==3) obj = orderManager3.getOrder(i);
        else if (i==4) obj = orderManager4.getOrder(i);
        else if (i==5) obj = orderManager5.getOrder(i);
        else {
            JOptionPane.showMessageDialog(this,"This table doesn't exist!");
            return;
        }
        JOptionPane.showMessageDialog(this,"Order of table "+i+": "+obj);
    }
    public void restaurantOrderBtnClick() throws OrderExceptions {

        String str = JOptionPane.showInputDialog("Table number");
        int i = Integer.valueOf(str);

        if (i < 1 || i > 5) {
            JOptionPane.showMessageDialog(this,"This table doesn't exist!");
            return;
        }
        if (i==1) orderManager1.add(getRestOrder(),i);
        else if (i==2) orderManager2.add(getRestOrder(),i);
        else if (i==3) orderManager3.add(getRestOrder(),i);
        else if (i==4) orderManager4.add(getRestOrder(),i);
        else orderManager5.add(getRestOrder(),i);

    }

    public RestaurantOrder getRestOrder() {
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        String s = JOptionPane.showInputDialog("How many positions?");
        int x = Integer.valueOf(s);
        while (x > 0) {
            String s1 = JOptionPane.showInputDialog("Dish or drink?");
            if (s1.equals("Dish") || s1.equals("dish")) {
                String s2 = JOptionPane.showInputDialog("Name of dish");
                String s3 = JOptionPane.showInputDialog("Description");
                String s4 = JOptionPane.showInputDialog("Price");
                restaurantOrder.addPosition(new Dish(s2,s3,Integer.valueOf(s4)));
            }
            else {
                String s2 = JOptionPane.showInputDialog("Name of drink");
                String s3 = JOptionPane.showInputDialog("Description");
                String s4 = JOptionPane.showInputDialog("Price");
                restaurantOrder.addPosition(new Drink(s2,s3,Integer.valueOf(s4)));
            }
            x--;
        }

        return restaurantOrder;
    }

    public void internetOrderBtnClick() {
        String str = JOptionPane.showInputDialog("Moscow or St.Petersburg");

        if (!str.equals("Moscow") && !str.equals("St.Petersburg") && !str.equals("St. Petersburg")) {
            JOptionPane.showMessageDialog(this,"There is no delivery to this city!");
            return;
        }
        if (str.equals("Moscow")) orderManager6.add(getInterOrder(),str);
        else orderManager7.add(getInterOrder(),str);
    }

    public InternetOrder getInterOrder() {
        InternetOrder internetOrder = new InternetOrder();
        String s = JOptionPane.showInputDialog("How many positions?");
        int x = Integer.valueOf(s);
        while (x > 0) {
            String s1 = JOptionPane.showInputDialog("Dish or drink?");
            if (s1.equals("Dish") || s1.equals("dish")) {
                String s2 = JOptionPane.showInputDialog("Name of dish");
                String s3 = JOptionPane.showInputDialog("Description");
                String s4 = JOptionPane.showInputDialog("Price");
                internetOrder.addPosition(new Dish(s2,s3,Integer.valueOf(s4)));
            }
            else {
                String s2 = JOptionPane.showInputDialog("Name of drink");
                String s3 = JOptionPane.showInputDialog("Description");
                String s4 = JOptionPane.showInputDialog("Price");
                internetOrder.addPosition(new Drink(s2,s3,Integer.valueOf(s4)));
            }
            x--;
        }
        return internetOrder;
    }

    public void removeInterOrderGUI() {
        String str = JOptionPane.showInputDialog("Moscow or St.Petersburg");

        if (!str.equals("Moscow") && !str.equals("St.Petersburg") && !str.equals("St. Petersburg")) {
            JOptionPane.showMessageDialog(this,"There is no such city!");
            return;
        }
        if (str.equals("Moscow")) orderManager6.removeOrderInternet(str);
        else orderManager7.removeOrderInternet(str);
    }

    public void getInterOrderGUI() {
        String str = JOptionPane.showInputDialog("Moscow or St.Petersburg");

        if (!str.equals("Moscow") && !str.equals("St.Petersburg") && !str.equals("St. Petersburg")) {
            JOptionPane.showMessageDialog(this,"There is no such city!");
            return;
        }

        Object obj;
        if (str.equals("Moscow")) obj = orderManager6.getOrder(str);
        else obj = orderManager7.getOrder(str);

        JOptionPane.showMessageDialog(this,"Order in city "+str+": "+obj);
    }

    public static void main(String[] args) {

        new GUI();
    }

}