package com.example;

import java.sql.*;
import java.util.Scanner;

public class ProductDAO {

    static Connection con = DBConnection.getConnection();

    public static void addProduct(Scanner sc) {

        try {

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Product Price: ");
            double price =
                    Double.parseDouble(sc.nextLine());

            System.out.print("Enter Product Quantity: ");
            int qty =
                    Integer.parseInt(sc.nextLine());

            String query = "INSERT INTO products(name,price,quantity) VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, qty);

            ps.executeUpdate();

            ps.close();

            System.out.println("Product Added Successfully");

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public static void viewProducts() {

        try {

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM products");

            System.out.println("\n===== PRODUCT LIST =====");

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + " | " +
                        rs.getString(2) + " | " +
                        rs.getDouble(3) + " | " +
                        rs.getInt(4));
            }

            rs.close();
            st.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public static void updateProduct(Scanner sc) {

        try {

            System.out.print("Enter Product ID to Update: ");
            int id =
                    Integer.parseInt(sc.nextLine());

            System.out.print("Enter New Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Product Price: ");
            double price =
                    Double.parseDouble(sc.nextLine());

            System.out.print("Enter New Product Quantity: ");
            int qty =
                    Integer.parseInt(sc.nextLine());

            String query =
                    "UPDATE products SET name=?, price=?, quantity=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, qty);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println("Product Updated Successfully");

            } else {

                System.out.println("Product ID Not Found");
            }

            ps.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public static void deleteProduct(Scanner sc) {

        try {

            System.out.print("Enter Product ID to Delete: ");

            int id =
                    Integer.parseInt(sc.nextLine());

            String query =
                    "DELETE FROM products WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println("Product Deleted Successfully");

            } else {

                System.out.println("Product ID Not Found");
            }

            ps.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }

}