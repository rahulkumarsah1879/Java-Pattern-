import java.util.Scanner;
class SolidRectangle {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number X and Y");
        int a=scan.nextInt();
        int n=scan.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
