package CodingCaseStudy.ImageToGZIP

import java.io.ByteArrayOutputStream
import java.io.File
import java.nio.charset.StandardCharsets.UTF_8
import java.util.*
import java.util.zip.GZIPOutputStream
import javax.imageio.ImageIO

fun main() {
    val bImage = ImageIO.read(File("src/assets/sample01.jpg"))
    val fplaintxt = File("src/assets/plain.txt")
    val plaintxt = fplaintxt.readText()
    println("plaintxt size : \n ${plaintxt.toByteArray().size}")

    val zipped = gzipku2(plaintxt.toByteArray())
    println("zipped size : \n ${zipped.length}")
    println(zipped)

//
//    val bos = ByteArrayOutputStream()
//    ImageIO.write(bImage, "jpg", bos)
//    val data = bos.toByteArray()
//    val encodeImg = Base64.getEncoder().encodeToString(data)
//    val convertToGzip = gzipku(encodeImg)
//    val encodeGzip = Base64.getEncoder().encodeToString(convertToGzip)
//    println("Gzip Image String : \n $encodeGzip")
//    println("Data Length       : \n ${data.size}")
//    println("Gzip Image Length : \n ${encodeGzip.length}")
}

fun gzipku2(bacontent: ByteArray):String{
    val byteStream = ByteArrayOutputStream(bacontent.size)
    val zipstream = GZIPOutputStream(byteStream)
    zipstream.write(bacontent)

    val compressedData = byteStream.toString()
    return compressedData
}

fun gzipku(content: String): ByteArray {
    val bos = ByteArrayOutputStream()
    GZIPOutputStream(bos).bufferedWriter(UTF_8).use { it.write(content) }
    return bos.toByteArray()
}