package CodingCaseStudy.CurrencyRupiah;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class CurrencyRupiahJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input price: ");
        int price = input.nextInt();

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        String priceFormat = kursIndonesia.format(price);

        System.out.println("Price : "+priceFormat);
    }
}
