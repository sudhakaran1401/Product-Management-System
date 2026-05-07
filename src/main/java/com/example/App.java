package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== PRODUCT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");

            System.out.print("Choose Option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    ProductDAO.addProduct(sc);
                    break;

                case 2:
                    ProductDAO.viewProducts();
                    break;

                case 3:
                    ProductDAO.updateProduct(sc);
                    break;

                case 4:
                    ProductDAO.deleteProduct(sc);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}