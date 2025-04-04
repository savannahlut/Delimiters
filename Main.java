public class Main{
    public static void main(String[] args) {
        String[] tokens = {" (", "x + y", ") ", " * 5"};
        Delimiters Dokens = new Delimiters(" (", ") ");
        System.out.println(Dokens.getDelimitersList(tokens));

        
    }
}