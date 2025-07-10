import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    int m1 = var.nextInt();
    int m2 = var.nextInt();
    int m3 = var.nextInt();
    int m4 = var.nextInt();
    int m5 = var.nextInt();
    int m6 = var.nextInt();
    float avg=(m1+m2+m3+m4+m5+m6)/6;
    System.out.println("THE AVERAGE MARK: "+avg);
}
}