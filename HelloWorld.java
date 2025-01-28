import java.util.Locale;

public class HelloWorld {
    public static void main(String[] args){

       String product1 = "Computer";
       String product2 = "Office Desk";

       int age = 30; 
       int code = 5290;
       char gender = 'F';
       
       double price1 = 2100.0;
       double price2 = 650.50;
       double measure = 53.234567;

            System.out.printf(" Products: %s, %s. %n", product1, product2);
            System.out.printf("%s, which price is %.2f%n", product1, price1);
            System.out.printf("%s, which price is %.2f%n", product2, price2);
            System.out.printf("%n Record: %d years old, code %d and: %c%n", age, code, gender);
            System.out.printf("%nMeasure with eigth decimal places: %.2f%nRouded (Three decimal places): %.3f%n", measure, measure);

       Locale.setDefault(Locale.US);

            System.out.printf("US decimal point: %.3f%n", measure);


    }
}
