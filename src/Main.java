import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) throws ParseException
    {
        try(Scanner sc = new Scanner(System.in).useLocale(Locale.US))
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            List<Product> products = new ArrayList<>();
            System.out.print("Enter the number of products: ");
            int n = sc.nextInt();
            sc.nextLine();
            for(int i = 0; i < n; i++)
            {
                System.out.printf("Product #%d data: \n", i+1);
                System.out.print("Common, used or imported (c/u/i)? ");
                char ch = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();
                if(ch == 'u')
                {
                    System.out.print("Manufacture date (DD/MM/YYYY) ");
                    String date = sc.nextLine();
                    products.add(new UsedProduct(name, price, sdf.parse(date)));
                }
                else if(ch == 'i')
                {
                    System.out.print("Customs fee: ");
                    Double customFee = sc.nextDouble();
                    products.add(new ImportedProduct(name, price, customFee));
                }
                else
                {
                    products.add(new Product(name, price));
                }
            }
            System.out.println();
            System.out.println("PRICE TAGS: ");
            for(Product p : products)
            {
                System.out.println(p.priceTag());
            }
        }
    }
}