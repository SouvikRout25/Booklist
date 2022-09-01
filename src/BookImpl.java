import java.util.ArrayList;
import java.util.List;

public class BookImpl {
    public static void main(String[] args) {
        List<Book> List = new ArrayList<>();
        Book book = new Book("NARUTO","MASASHI KISIMOTO", 2545552, 25.50);
        Book book1 = new Book("BLEACH","TITE KUBO", 8758585, 35.54);
        Book book2 = new Book("JUJUTSU KAISEN","GEGE AKUTAMI", 254545455, 15.58);
        Book book3 = new Book("DEMON SLAYER","KOYOHARU GOTOUGE",5465625,22.54);
        Book book4 = new Book("PARASYTE","HITOSHI IWAAKI", 2547525, 22.30);

        List.add(book);
        List.add(book1);
        List.add(book2);
        List.add(book3);
        List.add(book4);
        for (Book element : List){
            System.out.println(element);
        }
        for (int i = 0; i <List.size(); i++) {
            for (int j = 0; j < List.size()-1-i; j++) {
                if(List.get(j).getPrice()>List.get(j+1).getPrice()){
                    Book temp = List.get(j);
                    List.set(j, List.get(j+1));
                    List.set(j+1, temp);
                }

            }

        }
        System.out.println();
        System.out.println("SORTED LIST");
        System.out.println("---------------------");
        for (Book element : List){
            System.out.println(element);
        }
    }
}
