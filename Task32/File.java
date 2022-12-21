package Pract32;
import Pract29.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File extends JFrame {
    public JTable menuTable;
    OrderManager orderManager1 = new OrderManager();
    OrderManager orderManager2 = new OrderManager();
    OrderManager orderManager3 = new OrderManager();
    OrderManager orderManager4 = new OrderManager();
    OrderManager orderManager5 = new OrderManager();
    OrderManager orderManager6 = new OrderManager();
    OrderManager orderManager7 = new OrderManager();

    public File(){
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
        JButton addFromFile = new JButton("Add from file");

        pN.add(restaurantOrderBtn);
        pN1.add(internetOrderBtn);
        pN.add(showRestBtn);
        pN.add(removeRestBtn);
        pN1.add(showInterOrderBtn);
        pN1.add(removeInterOrderBtn);
        pN1.add(addFromFile);

        addFromFile.addActionListener(e -> {
            try{
                addFromFileGUI();
            }catch (Exception ex) {
                ex.getMessage();
            }
        });

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

    public void addFromFileGUI() throws Exception {
        List<String> list = Files.readAllLines(Paths.get("C:\\Users\\Administrator\\IdeaProjects\\Pract29\\src\\Pract32\\myFile.txt"));

        String[] str;
        int k1 = 0, k2 = 0, k3 = 0, k4 = 0, k5 = 0;
        for (String item : list) {
            str = item.split(" ");

            if (str.length != 6) {
                JOptionPane.showMessageDialog(this,"Line '"+ item+"' error!");
                continue;
            }

            RestaurantOrder restaurantOrder = new RestaurantOrder();
            InternetOrder internetOrder = new InternetOrder();
            if (str[0].equals("restaurant") || str[0].equals("Restaurant")) {
                if (str[2].equals("Dish") || str[2].equals("dish")) {
                    restaurantOrder.addPosition(new Dish(str[3],str[4],Integer.valueOf(str[5])));
                }
                else if (str[2].equals("Drink") || str[2].equals("drink")) {
                    restaurantOrder.addPosition(new Drink(str[3],str[4],Integer.valueOf(str[5])));
                }

                int i = Integer.valueOf(str[1]);
                if (i < 1 || i > 5) JOptionPane.showMessageDialog(this,"Line "+ item+" error! This table don't exist!");
                else if (i==1) {
                    if (k1 == 0)  {
                        orderManager1.add(restaurantOrder,i);
                        k1++;
                    }
                    else JOptionPane.showMessageDialog(this,"Line "+ item+" error! Order for 1 table already exist!");
                }
                else if (i==2)  {
                    if (k2 == 0)  {
                        orderManager2.add(restaurantOrder,i);
                        k2++;
                    }
                    else JOptionPane.showMessageDialog(this,"Line "+ item+" error! Order for 2 table already exist!");
                }
                else if (i==3) {
                    if (k3 == 0)  {
                        orderManager3.add(restaurantOrder,i);
                        k3++;
                    }
                    else JOptionPane.showMessageDialog(this,"Line "+ item+" error! Order for 3 table already exist!");
                }
                else if (i==4) {
                    if (k4 == 0)  {
                        orderManager4.add(restaurantOrder,i);
                        k4++;
                    }
                    else JOptionPane.showMessageDialog(this,"Line "+ item+" error! Order for 4 table already exist!");
                }
                else {
                    if (k5 == 0)  {
                        orderManager5.add(restaurantOrder,i);
                        k5++;
                    }
                    else JOptionPane.showMessageDialog(this,"Line "+ item+" error! Order for 5 table already exist!");
                }
            }
            else if (str[0].equals("internet") || str[0].equals("Internet")) {
                if (str[2].equals("Dish") || str[2].equals("dish")) {
                    internetOrder.addPosition(new Dish(str[3],str[4],Integer.valueOf(str[5])));
                }
                else if (str[2].equals("Drink") || str[2].equals("drink")) {
                    internetOrder.addPosition(new Drink(str[3],str[4],Integer.valueOf(str[5])));
                }

                if (str[1].equals("Moscow")) orderManager6.add(internetOrder,str[1]);
                else orderManager7.add(internetOrder,str[1]);
            }
            else {
                JOptionPane.showMessageDialog(this,"Line "+ item+" error!");
                continue;
            }
        }
    }

    public void addToFileRestaurant(OrderManager orderManager, int table) {
        try(FileWriter writer = new FileWriter("C:\\Users\\Administrator\\IdeaProjects\\Pract29\\src\\Pract32\\myFile2.txt", true)) {

            Object obj = orderManager.getOrder(table);
            writer.write(table + " " + obj.toString());
            writer.append('\n');
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public void addToFileInternet(OrderManager orderManager, String city) {
        try(FileWriter writer = new FileWriter("C:\\Users\\Administrator\\IdeaProjects\\Pract29\\src\\Pract32\\myFile2.txt", true)) {

            Object obj = orderManager.getOrder(city);
            writer.write(city + " " + obj.toString());
            writer.append('\n');
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
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
        if (i==1) {
            orderManager1.add(getRestOrder(),i);
            addToFileRestaurant(orderManager1,1);
        }
        else if (i==2) {
            orderManager2.add(getRestOrder(),i);
            addToFileRestaurant(orderManager2,2);
        }
        else if (i==3) {
            orderManager3.add(getRestOrder(),i);
            addToFileRestaurant(orderManager3,3);
        }
        else if (i==4) {
            orderManager4.add(getRestOrder(),i);
            addToFileRestaurant(orderManager4,4);
        }
        else {
            orderManager5.add(getRestOrder(),i);
            addToFileRestaurant(orderManager5,5);
        }

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
        if (str.equals("Moscow")) {
            orderManager6.add(getInterOrder(),str);
            addToFileInternet(orderManager6, "Moscow");
        }
        else {
            orderManager7.add(getInterOrder(),str);
            addToFileInternet(orderManager7,"St.Petersburg");
        }
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

    public static void main(String[] args)  {

        new File();
    }

}