import java.util.ArrayList;
import java.util.List;

public class Reporting extends Branch{
    private List<String> branches_list = new ArrayList<>();

    public List<String> getBranches_list() {
        return branches_list;
    }

    public static void main(String[] args) {
        Reporting branch_create = new Reporting();

        branch_create.CreateSale("Newcastle", "34","NE18GD",300000,"2013","January");
        branch_create.CreateSale("Newcastle", "87","NE34VJ",180000,"2019","November");
        branch_create.CreateSale("Newcastle", "91","NE53SI",140000,"2019","February");
        branch_create.CreateSale("Durham", "12","DH15SJ",270000,"2014","September");
        branch_create.CreateSale("Durham", "93","DH39OP",10000,"2017","June");
        branch_create.CreateSale("Durham", "7","NE34",500000,"2019","November");
        branch_create.CreateSale("London", "77","SE18GF",2000000,"2021","August");
        branch_create.CreateSale("London", "3","SE29JH",500000,"2016","March");
        branch_create.GreaterThan(200000,"Durham");
        branch_create.GreatestSale("Newcastle");
        branch_create.SaleAverage("Newcastle", "2019");
        branch_create.addToBranch("Newcastle");
        branch_create.addToBranch("Durham");
        branch_create.addToBranch("London");
        branch_create.GreaterThanAll(15000);
        branch_create.GreatestSaleAll();
    }

    public void setBranches_list(List<String> branches_list) {
        this.branches_list = branches_list;
    }
    public void addToBranch(String branch_name){
        branches_list.add(branch_name);
    }

    public void GreatestAverageForYear(String year){

    }

    public void GreaterThanAll(int input_value){
        String branch_name = "";
        for (int i =0; i < getBranches_list().size();i++){
            GreaterThan(input_value,getBranches_list().get(i));
        }
    }

    public void GreatestSaleAll(){
        int input_value = 0;
        int new_value = 0;
        int number_store = 0;
        String branch_store = "";
        for (int i = 0; i < branches_list.size(); i++) {
            new_value = GreatestSale(branches_list.get(i));
            if (input_value<new_value){
                branch_store = branches_list.get(i);
                input_value = new_value;
                number_store = new_value;
            }

        }
        if (new_value>0){
            System.out.println(branch_store+" has the greatest sale with "+number_store);
        }
        else{
            System.out.println("There are no branches");
        }
    }


}
