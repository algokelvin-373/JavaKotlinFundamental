package CodingCaseStudy.CsvToArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvToArray {
    public static void main(String[] args) {
        readBooksFromCSV("src/assets/biller_pdam.txt");
    }
    private static void readBooksFromCSV(String fileName) {
        List<PDAM> books = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                createPDAM(attributes);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    private static void createPDAM(String[] metadata) {
        System.out.println(metadata[0]+"-"+metadata[1]+"-"+metadata[2]+"-"+metadata[3]);
    }

}

class PDAM {
    private String provider_id;
    private String provider_name;
    private int biller_code;
    private String pdam_type;
    private int admin_fee_flag;

    public PDAM(String provider_id, String provider_name, int biller_code, String pdam_type, int admin_fee_flag) {
        this.provider_id = provider_id;
        this.provider_name = provider_name;
        this.biller_code = biller_code;
        this.pdam_type = pdam_type;
        this.admin_fee_flag = admin_fee_flag;
    }

    public String getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(String provider_id) {
        this.provider_id = provider_id;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public int getBiller_code() {
        return biller_code;
    }

    public void setBiller_code(int biller_code) {
        this.biller_code = biller_code;
    }

    public String getPdam_type() {
        return pdam_type;
    }

    public void setPdam_type(String pdam_type) {
        this.pdam_type = pdam_type;
    }

    public int getAdmin_fee_flag() {
        return admin_fee_flag;
    }

    public void setAdmin_fee_flag(int admin_fee_flag) {
        this.admin_fee_flag = admin_fee_flag;
    }
}