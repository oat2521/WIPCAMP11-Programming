/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package exercise;

import static java.awt.SystemColor.menu;
import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class Stock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = 5;
        int limit = 10;
        int menu;

        System.out.println("Limit : " + limit);
        System.out.println("Item  : " + item);
        System.out.println("---ให้ทำรายยยยย---");
        System.out.println("1.add");
        System.out.println("2.Remove");
        System.out.println("3.Check");
        System.out.println("----------------");
        System.out.print("enter menu id : ");
        menu = sc.nextInt();
        if (menu == 1) {
            if (item < limit) {
                System.out.print("ADD Iteam : ");

                int amount = sc.nextInt();
                if (amount + item > limit) {
                    System.out.println("ไอเท็ม เกินลิมิต");
                } else {
                    item = item + amount;
                    System.out.println("Item : " + item);

                }

            } else {
                System.out.println("ไอเท็ม เต็มแล้ว");
            }
        } else if (menu == 2) {
            if (item > 0) {
                int amount = sc.nextInt();
                if (item - amount >= 0) {
                    item = item - amount;
                    System.out.println("item : " + item);

                } else {
                    System.out.println("ไอเท็ม ไม่พอให้ลบ");

                }
            } else {
                System.out.println("ไม่มีไอเทม ในโกดัง");
                {

                }
            }
        }
        else if (menu == 3){
            System.out.println("item :"+item+"limit :"+limit);
        }else{
            System.out.println("เมนูไม่ถูกต้อง");
        
            
        }
    

    }
}
