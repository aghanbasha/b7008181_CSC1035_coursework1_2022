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

    public void CreateSale(String branch_name, String house_number, String postcode, int value, String year, String month){

    setHouse_number(house_number);
    setPostcode(postcode);
    setValue(value);
    setYear(year);
    setMonth(month);
    sales_list.add(branch_name);
    sales_list.add(getPostcode());
    sales_list.add(getYear());
    sales_list.add(getMonth());
    sales_value_list.add(getValue());
    return;
}
}
