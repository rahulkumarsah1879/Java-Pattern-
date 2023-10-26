import java.util.Scanner;
class InvertedHalfPyramidNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scan.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
