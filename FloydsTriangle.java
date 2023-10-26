import java.util.Scanner;
class FloydsTriangle {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=scan.nextInt();
        int number=0;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                number++;
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
