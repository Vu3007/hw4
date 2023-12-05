import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n= sc.nextInt();
        for (int i=n;i<n++;i++);
        int [] number = new int[n];
        for (int i=1;i<n;i++){
            System.out.println("phần tử thứ " +i+" của mảng là");
            number[i]=sc.nextInt();
        }
        for (int i=1;i<n;i++){
            System.out.println("mảng vừa nhập");
            System.out.println(number[i]+"\t");}
        System.out.println("mảng sau khi nhập : ");
        for (int i=1;i<n;i++){
            if (number[i]%2==0){
                number[i]++;
                System.out.print(number[i]+"\t");
            }
            else {
                System.out.print(number[i]+"\t");
            }
        }



    }
}
