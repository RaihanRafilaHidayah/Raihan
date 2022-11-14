public class method {
    public static void main(String[] args) {
        String[] nama = new String[]{"Jessica", "Cassandra", "Phillip"};
        nama[0] = "Jessica";
        nama[1] = "Cassandra";
        nama[2] = "Phillip";
        String[] strings = {"Jessica", "Cassandra", "Phillip"};
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }
    }
}
