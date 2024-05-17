public class principal {

    public static <Livro> void main(String[] args) {
        livro livro1 = new livro("1598FHK", "Core Java 2", "Cay S. Horstmann e Gary Cornell", "0130819336", 2005);
        livro livro2 = new livro("9865PLO", "Java, Como programar", "Harvey Deitel", "0130341517", 2015);

        System.out.println(livro1);
        System.out.println(livro2);
    }
}
