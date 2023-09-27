/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumiii;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PraktikumIII3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int barang = 0 , bonus = 0, cashback = 0,total = 0;
        System.out.println("======= Selamat Datang di Indomaret =======");
        System.out.print("Banyak pembelian barang  : "); barang=input.nextInt();
        System.out.println("===========================================");
        if (barang < 0|| bonus < 0 || cashback < 0 || total < 0) {
            System.out.println("ERROR - inputan harus lebih dari 0");
        }else{
            
        if (barang % 7 == 0){
            cashback=barang/7*5500;
            System.out.println("Cashback                 : "+ cashback);
        }if  (barang >=3){
            bonus= barang/3;
            total= barang + bonus;
            System.out.println("Bonus Barang             : " + bonus);
            System.out.println("Total Pembelian          : "+ total);
        }else{
            System.out.println("Cashback                 : -");
            System.out.println("Bonus Barang             : -");
            System.out.println("Total Pembelian          : "+ barang);
        }
        }               
        }
    }
