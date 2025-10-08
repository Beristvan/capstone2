import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class testDataReader {
    private String username;
    private String password;


    public testDataReader(String id) {
        String filePath = "src/test/java/capstoneTestData.txt";
        try {
            loadDataById(filePath, id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadDataById(String filePath, String id) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3 && parts[0].equals(id)) {
                    this.username = parts[1];
                    this.password = parts[2];
                    break;
                }
            }
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
