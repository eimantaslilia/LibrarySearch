import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Library Library = new Library();

        Library.addBook(new Book("Rendezvous with Rama", "Harcourt Brace Jovanovih", 1973));
        Library.addBook(new Book("The Loser", "Alfred A. Knopf", 1983));
        Library.addBook(new Book("The Death of Ivan Ilyich", "Penguin Random House", 2008));
        Library.addBook(new Book("The Road to Wigan Pier", "Victor Gollancz", 1937));
        Library.addBook(new Book("Slaughterhouse-Five", "Delacorte", 1969));


        System.out.println("Enter your search term: ");
        String searchWord = userInput.nextLine();

        for (Book book : Library.searchByTitle(searchWord))
            System.out.println(book);

        for (Book book : Library.searchByPublisher(searchWord)) {
            System.out.println(book);
        }
    }
}
