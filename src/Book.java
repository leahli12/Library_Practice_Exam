public class Book {
    public int numberOfPages;
    public String genre;
    public boolean hasPictures;

    public Book(int xPages, String xGenre, boolean xPictures){
        numberOfPages = xPages;
        genre = xGenre;
        hasPictures = xPictures;
    }

    public void printInfo(){
        System.out.println("This " + genre + " book has " + numberOfPages + " pages and the fact that it has pictures is " + hasPictures + ".");
    }
}
