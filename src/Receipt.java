import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Receipt {
    String item = "";
    private double subTotal = 0;
    private double total;
    private double discountPercentage = 0;
    private double discount = 0.00;

    double billTotal = 0.00;
    private String name = "";

    private int quantity;


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//    public Receipt(String item, int quantity, double pricePerUnit,double total, double subTotal, double discountPercentage, double discount, String name) {
//        this.item = item;
//        this.quantity = quantity;
//        this.pricePerUnit = pricePerUnit;
//        this.total = total;
//        this.subTotal = subTotal;
//        this.discountPercentage = discountPercentage;
//        this.discount = discount;
//      this.name = name;
//
//
//    }



        public Receipt(String item, int quantity, double pricePerUnit,double total) {
        this.item = item;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.total = total;
    }

    public String toString(){
        return item + "\t" + quantity + "\t" + pricePerUnit + "\t" + total;
    }

    public void setItem(String item) {
        this.item = item;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    double pricePerUnit;
    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }



    public void setDiscountPercentage(double discountPercentage) {
        this.discount = (discountPercentage / 100) * subTotal;
    }

    public void setName(String name) {
        this.name = name;
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public double getDiscount() {
        return discount;
    }

    public String getName() {
        return name;
    }

    public double getTotal(){
        return quantity * pricePerUnit;
    }



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Receipt receipt1 = new Receipt("soda" , 2 ,10 , 100);

        String addMoreItems = "yes";

        ArrayList<Receipt> myReceipts  = new ArrayList<>();

        while (addMoreItems.equals("yes")) {

            System.out.print("What did the user buy : ");
            String itemName = input.nextLine();
            receipt1.setItem(itemName);

            System.out.print("How many pieces? : ");
            int quantity = input.nextInt();
            receipt1.setQuantity(quantity);

            System.out.print("How much per unit? : ");
            int pricePerUnit = input.nextInt();
            receipt1.setPricePerUnit(pricePerUnit);
            input.nextLine();

            double newTotal = receipt1.getTotal();


            myReceipts.add(new Receipt(itemName, quantity, pricePerUnit , newTotal));


            System.out.println("\nAdd more Items? : ");
            addMoreItems = input.nextLine();



            }
    
//-----------------------------------------------------------------------// After the loop....

//            System.out.println("What is your name? : ");
//            String cashierName = input.nextLine();
//            receipt1.setName(cashierName);
//
//            System.out.println("How much discount will he get? :");
//            int discountPercentage = input.nextInt();
//            receipt1.setDiscountPercentage(discountPercentage);
//
//
//        double vat = 17.5 / 100 * receipt1.getSubTotal();
//
//
//        double billTotal;
//        billTotal = receipt1.getSubTotal() + vat - receipt1.getDiscount();


       /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        LocalDateTime now = LocalDateTime.now();

        System.out.println("\n\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MERCURLY WAY, SABO, YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date : " + now );
        System.out.println("Cashier: " + receipt1.getName());
        System.out.println("Customer Name: Sister Ace");
        System.out.println("=======================================================");
        System.out.println("ITEM       QTY        PRICE       TOTAL(NGN)");
        System.out.println("-------------------------------------------------------\n\n");
        for (Receipt items : myReceipts) {
            System.out.println(items);
        }
        //System.out.println(receipt1.getItem() + "\t\t\t" + receipt1.getQuantity() + "\t\t\t"  + receipt1.getPricePerUnit() + "\t\t\t"  + receipt1.getSubTotal());
        System.out.println("-------------------------------------------------------");
        System.out.println("                        Sub Total:      " + receipt1.getSubTotal());
        System.out.println("                         Discount:      " + receipt1.getDiscount());
//        System.out.println("                     VAT @ 17.50%:      " + vat);
        System.out.println("=========================================================");
//        System.out.println("                       Bill Total:      " + billTotal);

        }
    }



