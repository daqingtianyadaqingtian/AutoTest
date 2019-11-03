
import com.alibaba.fastjson.JSON;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GetByteArray {
   static String s = "/Users/wangchunyan/Downloads/";
    public static void main(String[] args) throws IOException {

        File file1 = new File(s + ".pdf");
        GetByteArray getByteArray = new GetByteArray();
       getByteArray.should_generate_byte_array_from_file(file1);
    }
    public void should_generate_byte_array_from_file(File file) throws IOException {
        System.out.println("#################");
        byte[] x =Files.readAllBytes(Paths.get("/Users/wangchunyan/Downloads/OAD-99.xlsx"));
//        Files.write("/Users/wangchunyan/Downloads/2.txt",x);
        ;
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : x) {
            stringBuilder.append(b).append(", ");
        }
        Files.write(Paths.get(s + "2.txt"), stringBuilder.toString().getBytes());
;    }
}

