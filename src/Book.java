public class Book {
    private String BOOKNAME;
    private String AUTHOR;
    private long ISBN;
    private double price;

    public Book(String BOOKNAME, String AUTHOR, long ISBN, double price){
        this.BOOKNAME = BOOKNAME;
        this.AUTHOR = AUTHOR;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getBOOKNAME() {
        return BOOKNAME;
    }

    public void setBOOKNAME(String BOOKNAME) {
        this.BOOKNAME = BOOKNAME;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(String AUTHOR) {
        this.AUTHOR = AUTHOR;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Book{" +
                "BOOKNAME=" + BOOKNAME +'\''+
                ", AUTHOR=" + AUTHOR +'\''+
                ", ISBN=" + ISBN +
                ", PRICE=" + price +
                "}";
    }
}
