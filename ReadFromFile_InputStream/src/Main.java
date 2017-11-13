public class Main {
    public static void main(String[] args) {
        ReadFromFile_InputStream rff = new ReadFromFile_InputStream("data/myData.txt");
        String s = rff.getDataString();

        System.out.println(s);
    }
}
