package CodingCaseStudy.CurrencyRupiah

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    print("Input price: ")
    val price = input.nextInt()

    val kursIndonesia = DecimalFormat.getCurrencyInstance() as DecimalFormat
    val formatRp = DecimalFormatSymbols()

    formatRp.currencySymbol = "Rp. "
    formatRp.monetaryDecimalSeparator = ','
    formatRp.groupingSeparator = '.'

    kursIndonesia.decimalFormatSymbols = formatRp
    val priceFormat = kursIndonesia.format(price.toLong())

    println("Price : $priceFormat")
}