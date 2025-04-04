public class Main{
    public static void main(String[] args) {
        String[] tokens = {" (", "x + y", ") ", " * 5"};
        Delimiters Dokens = new Delimiters(" (", ") ");
        System.out.println(Dokens.getDelimitersList(tokens));

        tokens  = new String[] {"<q>", "yy", "</q>", "zz", "</q>"}; 
        Dokens = new Delimiters("<q>", "</q>");
        System.out.println(Dokens.getDelimitersList(tokens));
    }
}