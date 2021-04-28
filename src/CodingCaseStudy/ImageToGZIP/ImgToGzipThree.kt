package CodingCaseStudy.ImageToGZIP

import java.util.*

fun main() {
    val a1 = CompressStringToGzip.compressStringToGzip("testkugkhkjhkkgkgjgkjjkhjkhjkhjkhjkhjkhjkhkjhk")
    val a2 = CompressStringToGzip.compress("testkugkhkjhkkgkgjgkjjkhjkhjkhjkhjkhjkhjkhkjhk")
    println("a1: ${Arrays.toString(a1)} - ${a1.size}")
    println("a2: ${Arrays.toString(a2)} - ${a2.size}")
    val a1Encode = Base64.getEncoder().encodeToString(a1)
    val a2Encode = Base64.getEncoder().encodeToString(a2)
    println("a1: ${a1Encode} - size: ${a1Encode.length}")
    println("a2: ${a2Encode} - size: ${a2Encode.length}")
}