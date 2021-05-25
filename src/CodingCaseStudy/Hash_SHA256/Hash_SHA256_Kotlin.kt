package CodingCaseStudy.Hash_SHA256

import java.security.MessageDigest

class Hash_SHA256_Kotlin {
    companion object {
        @JvmStatic
        fun hashWithAlgorithm(algorithm: String, data: String): String {
            val digest = MessageDigest.getInstance(algorithm)
            val bytes = digest.digest(data.toByteArray(Charsets.UTF_8))
            return bytes.fold("", { str, it -> str + "%02x".format(it) })
        }
    }
}