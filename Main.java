public class Main{
    public static void main(String[] args) {
        String[] tokens = {" (", "x + y", ") ", " * 5"};
        Delimiters Dokens = new Delimiters(" (", ") ");
        System.out.println(Dokens.getDelimitersList(tokens));

        tokens = new String[] {"<q>", "yy", "</q>", "zz", "</q>"}; 
        Dokens = new Delimiters("<q>", "</q>");
        System.out.println(Dokens.getDelimitersList(tokens));

        Dokens = new Delimiters("<sup>", "</sup>");
        tokens = new String[] {"<sup>", "<sup>", "</sup>", "<sup>","</sup>", "</sup>"};
        System.out.println(Dokens.getDelimitersList(tokens));
        System.out.println(Dokens.isBalanced(Dokens.getDelimitersList(tokens)));
        tokens = new String[] {"<sup>", "</sup>", "</sup>", "<sup>"};
        System.out.println(Dokens.getDelimitersList(tokens));
        System.out.println(Dokens.isBalanced(Dokens.getDelimitersList(tokens)));
        tokens = new String[] {"</sup>"};
        System.out.println(Dokens.getDelimitersList(tokens));
        System.out.println(Dokens.isBalanced(Dokens.getDelimitersList(tokens)));
        tokens = new String[] {"<sup>", "<sup>", "</sup>"};
        System.out.println(Dokens.getDelimitersList(tokens));
        System.out.println(Dokens.isBalanced(Dokens.getDelimitersList(tokens)));
    }
}