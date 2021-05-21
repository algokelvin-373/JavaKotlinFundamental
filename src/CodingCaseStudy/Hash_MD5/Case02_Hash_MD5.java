package CodingCaseStudy.Hash_MD5;

import java.security.NoSuchAlgorithmException;

import static CodingCaseStudy.Hash_MD5.Hash_MD5.hashMD5;

public class Case02_Hash_MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        StringBuilder stringBuilder = new StringBuilder();
        String strTrace = String.format("%06d", 1);
        String timestamp = String.valueOf(System.currentTimeMillis());
        String merchantOrderId = timestamp + strTrace;

        stringBuilder.append("D6368");
        stringBuilder.append(merchantOrderId);
        stringBuilder.append("10000");
        stringBuilder.append("1ee1f3cfcbccfd22b37b808b89e3ee6e");

        String sbString = String.valueOf(stringBuilder);
        System.out.println("String Builder: \n" + sbString);

        String resultHashMD5 = hashMD5(sbString.getBytes());

        System.out.print(resultHashMD5.toLowerCase()); // Using Java
    }
}
