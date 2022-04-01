import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//to get all order value prices in a list

public class Account {
      // provides total sum of the orders
        public int orderTotal(ArrayList<Integer> orderPrice) {

            int sum = 0;
            //store all order prices in an arrayList

            for (int i = 0; i < orderPrice.size(); i++) {
                sum += orderPrice.get(i);
            }
            return sum;
        }
    
    //to get all expenses value prices in a list
    public int expensesTotal(ArrayList<Integer> expensesTotal){

        int sum=0;
        //store all order prices in an arrayList

        for(int i = 0 ; i<expensesTotal.size();i++){
            sum+= expensesTotal.get(i);
        }
        return sum;
    }

    // total profit of the restaurant
    public int profit(int ordervalue,int expensesvalue){
        return ordervalue - expensesvalue;
    }
}