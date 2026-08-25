import java.util.Scanner;

public class ElectricityBill {
    static void calculateBill(int units) {
        int bill = 0;
        if (units < 0){
            System.out.println("Invalid number of units");
        }else if(units <= 100){
            bill = units*5;
        } else if(units <= 200){
            bill = 100*5 + (units-100)*7;
        } else {
            bill = 100*5 + 100*7 + (units-200)*10;
        }
        System.out.println("The electricity bill is Rs "+bill);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of units: ");
        int units = sc.nextInt();
        ElectricityBill.calculateBill(units);
    }
}
