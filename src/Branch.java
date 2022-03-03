import java.util.ArrayList;
import java.util.List;
public class Branch extends Sale{
    private String branch_name;
    private List<String> sales_list = new ArrayList<>();
    private List<Integer> sales_value_list = new ArrayList<>();

    public String getBranch_name() {
        return branch_name;

    }

    public List<String> getSales_list() {
        return sales_list;

    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public void setSales_list(List<String> sales_list) {
        this.sales_list = sales_list;
    }

    public void setSales_value_list(List<Integer> sales_value_list) {
        this.sales_value_list = sales_value_list;
    }

    public List<Integer> getSales_value_list() {
        return sales_value_list;
    }

    public void sales_list (String branch_name, int comparison){

    }

    public void average_sale(String branch_name){
        
    }

    public void CreateSale(String branch_name, String house_number, String postcode, int value, String year, String month) {

        setHouse_number(house_number);
        setPostcode(postcode);
        setValue(value);
        setYear(year);
        setMonth(month);
        sales_list.add(branch_name);
        sales_list.add(house_number);
        sales_list.add(getPostcode());
        sales_list.add(getYear());
        sales_list.add(getMonth());
        sales_value_list.add(getValue());
        return;

    }

    public static void main(String[] args) {
        Branch branch_create = new Branch();
        branch_create.CreateSale("Newcastle", "34","NE18GD",300000,"2015","January");
        branch_create.CreateSale("Newcastle", "87","NE34VJ",180000,"2019","November");
        branch_create.CreateSale("Newcastle", "91","NE53SI",140000,"2018","February");
        branch_create.CreateSale("Durham", "12","DH15SJ",270000,"2014","September");
        branch_create.CreateSale("Durham", "93","DH39OP",10000,"2017","June");
        branch_create.CreateSale("Durham", "7","NE34",500000,"2019","November");
        branch_create.CreateSale("London", "77","SE18GF",2000000,"2021","August");
        branch_create.CreateSale("London", "3","SE29JH",500000,"2016","March");
        branch_create.GreaterThan(200000,"Durham");
        branch_create.GreatestSale("Newcastle");
    }


    public void GreaterThan(int input_value, String branch_name){
        boolean entered = false;
        for(int i = 0; i<sales_list.size(); i++){
            if (branch_name.equals(sales_list.get(i))){
                if(input_value<sales_value_list.get(i/5)){
                    entered=true;
                    int increased_value = sales_value_list.get(i/5);
                    System.out.println(branch_name+" has a higher sale than "+input_value+" as the sale amount is "+increased_value);
                }
            }
        }
        if (entered==false){
            System.out.println(branch_name+"has no sales greater than"+input_value);
        }
    }


    public void GreatestSale(String branch_name) {
        int value_compare = 0;
        int new_value = 0;
        for (int i = 0; i < sales_list.size(); i++) {
            if (branch_name.equals(sales_list.get(i))) {
                if (value_compare < sales_value_list.get(i / 5)) {
                    value_compare = sales_value_list.get(i / 5);
                    new_value = sales_value_list.get(i / 5);
                }
            }
        }

        if (new_value > 0){
            System.out.println("The greatest valued house at the "+branch_name+" branch is "+new_value);
        }

        else {
            System.out.println("This branch does not exist");
        }

    }

}
