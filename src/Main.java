import com.john.*;
import com.john.Table.Drawers;
import com.john.Table.Table;
import com.john.Utility.AppConstants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wood wood = null;

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Password: ");
//        String password = scanner.nextLine();
//
//        if(password == AppConstants.PASSWORD) {
//            break;
//        } else {
//
//        }
//

        System.out.println("Enter table type: ");
        String woodType = scanner.nextLine();
        System.out.println("Enter table length: ");
        int length = scanner.nextInt();
        System.out.println("Enter table width: ");
        int width = scanner.nextInt();
        System.out.println("Enter number of drawers: ");
        int drawersNumber = scanner.nextInt();
        System.out.println("Enter number of tables: ");
        int noOfTables = scanner.nextInt();
        System.out.println("Pay Here. Enter Amount: ");
        int payment = scanner.nextInt();

        Drawers drawer = Drawers.values()[drawersNumber];

        switch (woodType) {
            case "Mahogany" -> {
                System.out.println("Mahogany");
                wood = new Mahogany();
            }
            case "Oak" -> {
                System.out.println("Oak");
                wood = new Oak();
            }
            case "Pine" -> {
                System.out.println("Pine");
                wood = new Pine();
            }
        }

        Table table = new Table(length, width, wood, drawer);
        System.out.println(table.getPrice());
        Invoice invoice = new Invoice(table, noOfTables, payment);
        System.out.println(invoice.getBalance());
        invoice.printInvoice();
    }
}