package com.sau.workshop;

import java.util.Scanner;

public class SumProject {
    //ป้อนตัวเลข 2 จำนวนทางแป้นพิมพ์ แล้วแสดงผลรวมทางหน้าจอ
    //ทั้งนี้หากผลรวมยังไม่เกิน 500
    //ให้วนป้อนตัวเลข 2 จำนวนทางแป้นพิมพ์ แล้วแสดงผลรวมทางหน้าจอไปเรื่อย ๆ
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double i, i2, sum;
        do{
            System.out.print("Enter Number : ");
            i = sc.nextDouble();
            System.out.print("Enter Number : ");
            i2 = sc.nextDouble();
            sum = i + i2;
            System.out.println(i + " + " + i2 + " = " + sum);
            System.out.println("---------------------------------");
        }while(sum <= 500);
    }
}
