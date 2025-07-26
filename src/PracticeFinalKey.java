public class PracticeFinalKey {
    public static void main(String[] args) {
        final Books Book1 = new Books();
        Book1.title = "Random";//allowed to change variable

    }
}

class Library{
    final String libraryName = "City Library";

// not allowed with final keyword
//    Library(){
//        this.libraryName = "Metro Library";
//    }
}

