import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFromFile_InputStream{
    private String myDataString;

    public ReadFromFile_InputStream(String filePath){
        ClassLoader CLDR = this.getClass().getClassLoader();
        InputStream inputStream = CLDR.getResourceAsStream(filePath);

        myDataString = getStringFromInputStream(inputStream);
    }

    private static String getStringFromInputStream(InputStream is) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    public String getDataString(){
        return myDataString;
    }
}
