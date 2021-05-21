package CodingCaseStudy.Hash_MD5

import java.security.MessageDigest
import javax.xml.bind.DatatypeConverter

class Hash_MD5_Kotlin {
    companion object {
        @JvmStatic
        fun hashMD5Kotlin(bytes: ByteArray): String {
            val md = MessageDigest.getInstance("MD5")
            md.update(bytes)
            val digest = md.digest()
            return DatatypeConverter.printHexBinary(digest)
        }
    }
    fun toMD5(txt: String): String {
        val bytes = MessageDigest.getInstance("MD5").digest(txt.toByteArray())
        return bytes.toHex()
    }
    private fun ByteArray.toHex(): String {
        return joinToString("") { "%02x".format(it) }
    }
}