public class PracticeTwo {
    public static void main(String[] args) {
        Books Book1 = new Books();
        Books Book2 = new Books("Anything", "Anyone", 699);
        System.out.println(Book2.Author);
        System.out.println(Book2.price);
        System.out.println(Book2.title);

        System.out.println(Book1.Author);
        System.out.println(Book1.price);
        System.out.println(Book1.title);
    }
}
class Books{
    String title;
    String Author;
    int price;

    Books(){

    }

    Books(String ttl, String au, int pr){
         this.title = ttl;
        this.Author = au;
        this.price = pr;
    }
}