package CodingCaseStudy.Hash_SHA256;

import CodingCaseStudy.Hash_MD5.Hash_MD5_Kotlin;

import java.security.NoSuchAlgorithmException;

public class Case_Hash_SHA256 {
    public static void main(String[] args) {
        StringBuilder stringBuilder;

        stringBuilder = new StringBuilder();
        String timestamp = String.valueOf(System.currentTimeMillis());

        stringBuilder.append("D6368");
        stringBuilder.append(timestamp);
        stringBuilder.append("8d9cb87c83c04a62b4216660f715ce0c");

        String sbString = String.valueOf(stringBuilder);

        // Kotlin
        System.out.println(Hash_SHA256_Kotlin.hashWithAlgorithm("SHA-256", sbString));

        // Java
        try {
            System.out.println(Hash_SHA256.hashSHA256(sbString));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
