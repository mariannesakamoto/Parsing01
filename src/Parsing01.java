public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
              String gibberish = "887ds7nds87dsfs";
        int shirtPriceInt = 15;
        
        System.out.println("O preco da camisa e: " + shirtPriceInt);
        double taxaRateDouble = 0.05;
        
        System.out.println("A taxa de imposto e: " + taxaRateDouble);
        
        try{
            int gibberishInt = Integer.parseInt (gibberish);
            System.out.println("O valor gibberish convertido para int e: " + gibberishInt);
        }    catch (NumberFormatException e) {
            System.out.println("Erro ao converter gibberish para int: " + e.getMessage());
        }
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
        
    }
    
}
