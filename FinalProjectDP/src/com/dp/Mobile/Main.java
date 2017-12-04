/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.dp.Mobile;

import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class Main {
    public static void main(String[] args) {
        Category category = new Category();
        while (true) {
            System.out.println("X----------------------------------------------------------X");
            category.displayMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Option: ");
            String input = scanner.nextLine();
            Boolean flag = category.orderSelection(input);
            if(flag == true) {
                break;
            }
            // write your code here
        }
    }
}
