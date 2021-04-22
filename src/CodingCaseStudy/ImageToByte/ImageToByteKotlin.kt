package CodingCaseStudy.ImageToByte

import java.io.ByteArrayOutputStream
import java.io.File
import java.util.*
import javax.imageio.ImageIO

fun main() {
    val bImage = ImageIO.read(File("src/assets/sample01.jpg"))
    val bos = ByteArrayOutputStream()
    ImageIO.write(bImage, "jpg", bos)
    val data = bos.toByteArray()

    println("Resolution       : " + bImage.width + " x " + bImage.height)
    println("Data Byte        : $data")
    println("Data Byte Length : " + data.size)
    println("Data Byte Array  : " + Arrays.toString(data))
}