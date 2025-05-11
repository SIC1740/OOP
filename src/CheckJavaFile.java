import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CheckJavaFile {
    public static void main(String[] args) {
        try {
            // 1. Đọc nội dung file
            BufferedReader reader = new BufferedReader(new FileReader("./input.txt"));
            String line = reader.readLine(); // Giả sử chỉ đọc 1 dòng đầu tiên
            reader.close();

            // 2. Kiểm tra kết thúc bằng ".java"
            boolean result = false;
            if (line != null) {
                result = line.endsWith(".java");
            }

            // 3. In ra màn hình
            System.out.println(result);

            // 4. Ghi kết quả vào file output
            FileWriter writer = new FileWriter("./output.txt");
            writer.write(Boolean.toString(result)); // Chuyển kết quả boolean thành String
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
