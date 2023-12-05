import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên bạn : ");
        String name=sc.nextLine();
        String a=name.substring(0,1);
        char[] charArray = name.toCharArray();
        boolean foundSpace = true;
        for (int i=0;i<charArray.length;i++){
            if (Character.isLetter(charArray[i])){
                if (foundSpace){ charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;}
            }
            else {
                foundSpace = true;}
        }
        name = String.valueOf(charArray);

        System.out.println("In hoa chữ cái đầu họ và tên : "+ name);
    }
}
