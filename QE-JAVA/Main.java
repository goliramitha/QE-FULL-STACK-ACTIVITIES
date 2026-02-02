

abstract class Book {
    String title;

    abstract void setTitle(String s);

    
    String getTitle() {
        return title;
    }
}


class MyBook extends Book {

    @Override
    void setTitle(String s) {
        title = s;
    }
}


public class Main {
    public static void main(String[] args) {

        
        MyBook newNovel = new MyBook();

        String title = "Harry Potter";   // You can change the name
        newNovel.setTitle(title);

      
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
