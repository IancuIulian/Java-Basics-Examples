import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String file_path = "C:\\Users\\iulia\\IdeaProjects\\Read From File\\src\\my_data.txt";

        try{
            ReadFromFile file = new ReadFromFile(file_path);
            ArrayList<String> lines = file.openFile();

            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
