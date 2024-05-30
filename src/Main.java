public class Main {
    public static void main(String[] args) {
        Author killanAr = new Author("Killan"," Arnold","");
        Book magica = new Book("Magica", 1999, killanAr);
        Author kozlovskiDa = new Author("Danila", "Kozlovski","" );
        Author dimaPetr = kozlovskiDa;
        Book kamonRebyat = new Book("Kamon Rebyat", 2016, kozlovskiDa);
        kamonRebyat.setRelease(2022);
        System.out.println(kamonRebyat.getRelease());
        System.out.println(killanAr.getAuthorFullName());
        System.out.println(killanAr);
        System.out.println(magica);
        System.out.println(magica.hashCode());
        System.out.println(killanAr.equals(kozlovskiDa));
        System.out.println(dimaPetr.equals(kozlovskiDa));
    }
}