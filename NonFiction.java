public class NonFiction extends Book {
    public NonFiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    @Override
    public String describe() {
        return "Non-Fiction: " + title + " by " + author;
    }
}
