/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dp.Mobile;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class Category {
    String[] arr = new String[]{"APPLE", "NOKIA", "SAMSUNG", "HUAWEI", "ACCESSORIES", "Edit Cart","Place your Order"};

    public void displayMenu() {
        System.out.println("0) Exit");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ") " + arr[i]);
        }
    }

    List<IMobile> list;
    Scanner s1 = new Scanner(System.in);
    Cart cart = new Cart();
    public Boolean orderSelection(String inp) {
        if (inp.equals("0")){
            System.out.println("X----------------------------------------------------------X" + "\n");
            return true;
        }
        if (inp.equals("1")) {
            CatApple apple = new CatApple();
            list = apple.AppleList;
            addingMobileCart(list);
            return false;
        } else if (inp.equals("2")) {
            CatNokia Nokia = new CatNokia();
            list = Nokia.NokiaList;
            addingMobileCart(list);
            return false;
        } else if (inp.equals("3")) {
            CatSamsung samsung = new CatSamsung();
            list = samsung.SamsungList;
            addingMobileCart(list);
            return false;
        } else if (inp.equals("4")) {
            CatHuawei Huawei = new CatHuawei();
            list = Huawei.HuaweiList;
            addingMobileCart(list);
            return false;
        } else if (inp.equals("5")) {
            CatAccessories accessories = new CatAccessories();
            List<IAccessories> list = accessories.AccessoriesList;
            addingAccessoriesCart(list);
            return false;
        }else if (inp.equals("6")) {
            cart.editOrder();
            System.out.println("X----------------------------------------------------------X" + "\n");
            return false;
        
        } else if (inp.equals("7")) {
            cart.getPlacedOrder();
            cart.getTotalPrice();
            System.out.println("X----------------------------------------------------------X" + "\n");
            return true;
        }  else {
            System.out.println("Wrong Option");
            System.out.println("X----------------------------------------------------------X" + "\n");
            return false;
        }
    }
    public void addingMobileCart(List<IMobile> list) {
        int count = 1;
        for (IMobile item : list) {
            System.out.println(count + ") " + item.MobileName()+ " " + item.MobilePrice());
            count++;
        }
        System.out.print("Enter Option: ");
        int option = s1.nextInt();
        if (option <= list.size()) {
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }

            cart.addItem(list.get(option - 1).MobileName(), list.get(option - 1).MobilePrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("X----------------------------------------------------------X" + "\n");
        }
        else {
            System.out.println("Wrong Option");
        }
    }
    public void addingAccessoriesCart(List<IAccessories> list){
        int count = 1;
        for (IAccessories item : list) {
            System.out.println(count + ") " + item.AccessoriesName() + " " + item.AccessoriesPrice());
            count++;
        }
        System.out.print("Enter Option: ");
        int option = s1.nextInt();
        if (option <= list.size()) {
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option - 1).AccessoriesName(), list.get(option - 1).AccessoriesPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("X----------------------------------------------------------X" + "\n");
        }
        else{
            System.out.println("Wrong option");
        }
    }
    
}
