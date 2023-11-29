public class Test03 {
    public static void main(String[] args){
        for(int i = 5; i >= 1; i--){
            for(int a = 1 ; a <= 5 - i; a++){
                System.out.print(" ");
            }

            for(int b = 1 ; b <= i * 2 - 1; b++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
