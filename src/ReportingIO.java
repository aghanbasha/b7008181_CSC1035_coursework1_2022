import java.util.Scanner;

public class ReportingIO {

    public static void main(String[] args) {


        Scanner user_scan = new Scanner(System.in);
        Reporting branch_create = new Reporting();
        boolean end = false;
        while (!end){

            System.out.println("Enter 1 to add sale data");
            System.out.println("Enter 2 to add branch data");
            System.out.println("Enter 3 to view the branch with the greatest sale average for a given year");
            System.out.println("Enter 4 to view the highest sale ever reported");
            System.out.println("Enter 5 to view all sales greater than a given value");
            System.out.println("Enter 6 to exit");
            int user_input_full = user_scan.nextInt();
            if (user_input_full==1){
                System.out.println("Branch name: ");
                user_scan.nextLine();
                String branch_name = user_scan.nextLine();
                for (int i = 0; i < branch_create.getBranches_list().size();i++){
                    if (branch_name.equals(branch_create.getBranches_list().get(i))== true){
                        end = true;
                    }
                }
                if (end == false){
                    System.out.println("Branch does not exist");
                }
                else {
                    System.out.println("House number: ");
                    String house_number = user_scan.nextLine();
                    System.out.println("Postcode: ");
                    String postcode = user_scan.nextLine();
                    System.out.println("Year of sale: ");
                    String year = user_scan.nextLine();
                    System.out.println("Month of sale: ");
                    String month = user_scan.nextLine();
                    System.out.println("Value: ");
                    int value = user_scan.nextInt();
                    branch_create.CreateSale(branch_name, house_number, postcode, Integer.parseInt(year), month, String.valueOf(value));
                    System.out.println("Data added");

                }


            }

            if (user_input_full==2){
                System.out.println("Branch name: ");
                user_scan.nextLine();
                String branch_name = user_scan.nextLine();
                branch_create.addToBranch(branch_name);
                System.out.println("Branch added");

            }

            if (user_input_full == 3) {

            }
            if (user_input_full==4){
                branch_create.GreatestSaleAll();
            }
            if (user_input_full==5){
                System.out.println("Enter value");
                int value = user_scan.nextInt();
                branch_create.GreatestSaleAll();
            }
            if (user_input_full==6){
                System.out.println("Program done");
                end=true;
            }

        }
    }
}
