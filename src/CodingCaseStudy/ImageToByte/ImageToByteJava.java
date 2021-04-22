package CodingCaseStudy.ImageToByte;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ImageToByteJava {
    public static void main(String[] args) throws IOException {
        BufferedImage bImage = ImageIO.read(new File("src/assets/sample02.png"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(bImage, "png", bos);
        byte [] data = bos.toByteArray();

        System.out.println("Resolution       : "+bImage.getWidth()+" x "+bImage.getHeight());
        System.out.println("Data Byte        : "+data.toString());
        System.out.println("Data Byte Length : "+data.length);
        System.out.println("Data Byte Array  : "+Arrays.toString(data));
    }
}
