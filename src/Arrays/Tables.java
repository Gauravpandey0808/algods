package Arrays;

public class Tables {

    public void writeTable(int n ) {

        for(int i=1 ; i <= 10 ; i++) {
            for(int j=1 ; j <=n ; j++) {
                System.out.print(j + "*" + i + "=" + (j*i)+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Tables tables = new Tables();
        tables.writeTable(10);
    }
}
