package Lab8.Visal1.com;

public class Lab8 {
    public static void main(String[] args){
        int taxRate=10;
        int fullPrice=10;
        int taxPrice=0;
        int price=0;
        //taxPrice = fullPrice - price
        //price=?
        price = fullPrice-(100/(taxRate*fullPrice));
        taxPrice = fullPrice - price;
        System.out.println("Tax_Price = " + taxPrice + "$$");
    }
}
