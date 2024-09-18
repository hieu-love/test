package tuan2;

import java.util.Scanner;
public class bai3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao 2 so nguyen ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tong = a+b;
        int hieu = a-b;
        int tich = a*b;
        int thuong = 0;
        int phandu = 0;
        
        if (b!=0){
            thuong = a/b;
            phandu = a%b;
        }else{
            System.out.println("khong the chia cho 0");
        }
        System.out.println("Tong 2 so nguyen la "+tong);
        System.out.println("hieu 2 so nguyen la "+hieu);
        System.out.println("tich 2 so nguyen la "+tich);
        
        if(b!=0){
            System.out.println("thuong cua hai so la "+thuong);
            System.out.println("phan du cua hai so la "+phandu);
        }
    }   
}