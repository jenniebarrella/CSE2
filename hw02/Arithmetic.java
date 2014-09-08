// Jennie-rose Barrella
// CSE2 HW02
// September 5, 2014
//
// Task: you go shopping at walmart and want to compute the cost of the items you bought including the 6% sales tax
// define a class
public class Arithmetic {
    // add a main method
    public static void main(String[ ] args) {
        // input variables
        //
        // number of pairs of socks
        int nSocks=3;  
        // cost per pair of socks
        // ('$' is part of the variable name)
        double sockCost$=2.58;
        //
        // number of drinking glasses
        int nGlasses=6;
        // cost per glass
        double glassCost$=2.29;
        //
        // number of boxes of envelopes
        int nEnvelopes=1;
        // cost per box of envelopes
        double envelopeCost$=3.25;
        //
        double taxPercent=0.06;
        //
        // need to calculate:
        // total cost of each kind of item and sales tax for the total cost
        // total cost of purchase before tax
        // total paid for the transaction, including tax
        //
        // declare variables
        double totalSockCost$;     // total cost of socks
        double totalGlassCost$;    // total cost of glasses
        double totalEnvelopeCost$; // total cost of envelopes
        double sockCost=0, glassesCost=0, envelopeCost=0;
        double salesTaxSocks=0, salesTaxGlasses=0, salesTaxEnvelopes=0;
        double sockCostTax=0, glassesCostTax=0, envelopeCostTax=0;
        double totalCostNoTax=0, totalSalesTax=0, totalCost=0;
        //
        // print numbers stores
        System.out.println("3 pairs of socks were bought and cost $2.58 each");
        System.out.println("6 glasses were bought and cost $2.29 each");
        System.out.println("1 envelope was bought and cost $3.25 each");
        System.out.println("---------------------------------------");
        //
        // calculations
        //
        // cost of each item before tax
        // sales tax for each item
        // cost of each item with tax
        // total cost before tax
        // total sales tax
        // total cost with tax
        //
        // cost of each item before tax
        sockCost=nSocks*sockCost$;
        glassesCost=nGlasses*glassCost$;
        envelopeCost=nEnvelopes*envelopeCost$;
        // sales tax for each item
        salesTaxSocks=sockCost*taxPercent;
        double salesTaxSocks100=(int)(salesTaxSocks*100);
        double finalSalesTaxSocks=(salesTaxSocks100/100);
        salesTaxGlasses=glassesCost*taxPercent;
        double salesTaxGlasses100=(int)(salesTaxGlasses*100);
        double finalSalesTaxGlasses=(salesTaxGlasses100/100);
        salesTaxEnvelopes=envelopeCost*taxPercent;
        double salesTaxEnvelopes100=(int)(salesTaxEnvelopes*100);
        double finalSalesTaxEnvelopes=(salesTaxEnvelopes100/100);
        // cost of each item with tax
        sockCostTax=sockCost+finalSalesTaxSocks;
        double sockCostTax1=sockCostTax-.000000000000001;
        glassesCostTax=glassesCost+finalSalesTaxGlasses;
        envelopeCostTax=envelopeCost+finalSalesTaxEnvelopes;
        // total cost before tax
        totalCostNoTax=sockCost+glassesCost+envelopeCost;
        // total sales tax
        totalSalesTax=finalSalesTaxSocks+finalSalesTaxGlasses+finalSalesTaxEnvelopes;
        // total cost with tax
        totalCost=totalCostNoTax+totalSalesTax;
        //
        // print the output data
        System.out.println("the cost of each item before tax is:");
        System.out.println("socks = $"+sockCost);
        System.out.println("glasses = $"+glassesCost);
        System.out.println("envelopes = $"+envelopeCost);
        System.out.println("---------------------------------------");
        System.out.println("the sales tax for each item is:");
        System.out.println("socks = $"+finalSalesTaxSocks);
        System.out.println("glasses = $"+finalSalesTaxGlasses);
        System.out.println("envelopes = $"+finalSalesTaxEnvelopes);
        System.out.println("---------------------------------------");
        System.out.println("the cost of each item with tax is:");
        System.out.println("socks = $"+sockCostTax1);
        System.out.println("glasses = $"+glassesCostTax);
        System.out.println("envelopes = $"+envelopeCostTax);
        System.out.println("---------------------------------------");
        System.out.println("the total cost before tax is: $"+totalCostNoTax);
        System.out.println("the total sales tax is: $"+totalSalesTax);
        System.out.println("the total cost with tax is: $"+totalCost);
        
        
    } // end of main method
} // end of class