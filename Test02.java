import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();
        for(int i = 1; i <= angka; i++){
            for(int a = 1 + i; a <= angka + i; a++){
                if(a % 2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    
}
