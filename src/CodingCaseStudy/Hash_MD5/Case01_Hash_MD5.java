package CodingCaseStudy.Hash_MD5;

import java.security.NoSuchAlgorithmException;

import static CodingCaseStudy.Hash_MD5.Hash_MD5.hashMD5;

public class Case01_Hash_MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password = "ILoveJava";
        String resultHashMD5 = hashMD5(password.getBytes());
        String resultHashMD5Kotlin = Hash_MD5_Kotlin.hashMD5Kotlin(password.getBytes());

        System.out.println(resultHashMD5); // Using Java
        System.out.println(resultHashMD5Kotlin); // Using Kotlin

        Hash_MD5_Kotlin hashMD5 = new Hash_MD5_Kotlin();
        System.out.println(hashMD5.toMD5(password)); // Version Two Kotlin

        System.out.println(resultHashMD5.toLowerCase()); // Using Java
        System.out.println(resultHashMD5Kotlin.toLowerCase()); // Using Kotlin
    }
}
