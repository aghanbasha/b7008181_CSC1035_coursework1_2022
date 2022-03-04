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


    }

    /*public static void main(String[] args) {
        Branch branch_create = new Branch();
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
    }*/


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


    public int GreatestSale(String branch_name) {
        int input_value = 0;
        int new_value = 0;
        for (int i = 0; i < sales_list.size(); i++) {
            if (branch_name.equals(sales_list.get(i))) {
                if (input_value < sales_value_list.get(i / 5)) {
                    input_value = sales_value_list.get(i / 5);
                    new_value = sales_value_list.get(i / 5);
                }
            }
        }

        if (new_value > 0){
            System.out.println("The greatest valued house at the "+branch_name+" branch is "+new_value);
            return new_value;
        }

        else {
            System.out.println("This branch does not exist");
            return 0;
        }

    }

    public int SaleAverage(String branch_name, String year){
        int average_index = 0;
        int new_value = 0;
        boolean entered = false;
        for (int i=0; i<sales_list.size();i++){
            if (branch_name.equals(sales_list.get(i))){
                if (sales_list.get(i + 3) == year) {
                    average_index++;
                    new_value += sales_value_list.get(i/5);
                    entered = true;
                }
            }

        }

        int average = 0;
        if (new_value>0){
            average = new_value/average_index;
        }

        if (entered == true){
            System.out.println(branch_name+" have an average sale value of "+average);
            return average;
        }
        else{
            System.out.println("This branch have no sales");
            return 0;
        }
    }

}
