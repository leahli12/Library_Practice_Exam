public class Library {
    public String nameOfLibrary;
    public boolean isOpen;
    public int numberOfBooks;
    // public Library sampleLibrary;
    public static void main(String[] args) {
        Library sampleLibrary = new Library();
        Book bradfordBook = new Book(300, "Magical Realism", false);
        bradfordBook.printInfo();
        Book myBook = new Book(451, "Dystopian", true);
        myBook.printInfo();
    }

    public Library(){
        nameOfLibrary = "Stacks & Syntax: The Logic Library";
        isOpen = true;
        numberOfBooks = 15234;
        System.out.println("Greetings, Bookworms!"); // correct place?
        System.out.println("Welcome to " + nameOfLibrary + ", it is " + isOpen + " that we are open, we have " + numberOfBooks + " on our shelves.");
        numberOfBooks *= 2;
        System.out.println("Welcome to " + nameOfLibrary + ", it is " + isOpen + " that we are open, we have " + numberOfBooks + " on our shelves.");
        randomBooks();
        authorOfTheDay("Toni Morrison");
        countBooks();
        System.out.println();
        deweysChoice();
    }

    public void randomBooks(){
        int randomInt = (int)(Math.random() * 11); // Inclusive?
        System.out.println("We spun the wheel and you get to check out " + randomInt + " books from the Library!");
    }

    public void authorOfTheDay(String author){
        System.out.println("Today's featured author is " + author + ".");
    }

    public void countBooks(){
        for (int i = 0; i < 5; i += 1){
            System.out.println(i);
        }
        for (int j = 3; j < 13; j += 3){
            System.out.println(j);
        }
        for (int k = 12; k > -1; k -= 2){
            System.out.print(k + ", ");
        }
    }

    public void deweysChoice(){
        double randomNum = (int)(Math.random() * 400);
        if (randomNum < 100){
            System.out.println("Dewey recommends a general book.");
        }
        else if (randomNum < 200){
            System.out.println("Dewey recommends a book about philosophy.");
        }
        else if (randomNum < 300){
            System.out.println("Dewey recommends a book about religion.");
        }
        else{
            System.out.println("Dewey recommends a book about social science.");
        }
    }

}
