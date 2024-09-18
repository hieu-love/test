package tuan2;

import java.util.Scanner;
public class bai4
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao so tien goc ");
        double sotiengoc = sc.nextDouble();
        System.out.print("nhap vao lai suat hang nam ");
        double laisuathangnam = sc.nextDouble();
        System.out.print("nhap vao so thang gui ");
        int thanggui = sc.nextInt();
        
        double laisuatHN = laisuathangnam/100;
        double sotienlai = sotiengoc * laisuatHN * (thanggui/12.0);
        double sotiengocck = sotienlai + sotiengoc;
        
        System.out.println("so tien lai la "+sotienlai);
        System.out.println("so tien goc cuoi ky la "+sotiengocck);
    }
}