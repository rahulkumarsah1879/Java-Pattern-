import java.util.Scanner;
class HollowRectangle {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of rows and column");
        int a= scan.nextInt();
        int b= scan.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==1 || j==1 || i==a || j==b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
