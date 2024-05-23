public class Main {
    public static void main(String[] args) {
        Author killanAr = new Author("Killan Arnold");
        Book magica = new Book("Magica", 1999, killanAr);
        Author kozlovskiDa = new Author("Danila Kozlovski");
        Book kamonRebyat = new Book("Kamon Rebyat", 2016, kozlovskiDa);
        kamonRebyat.setRelease(2020);
        System.out.println(kamonRebyat.getRelease());
    }
}