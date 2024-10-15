public class TestLibraryItem{
    public static void main(String[] args){
        Book b1 = new Book("ABC", "he", "12345678", 2024);
        Book b2 = new Book("DEF", "she", "123454321", 2025);
        b1.getDetails();
        System.out.println("------------");
        b2.getDetails();

        Magazine m1 = new Magazine("GHI", "him", 123, 2026);
        Magazine m2 = new Magazine("JKL", "her", 456, 2027);

        m1.getDetails();
        System.out.println("------------");
        m2.getDetails();
    }
}