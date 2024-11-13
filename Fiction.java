public class Fiction extends Book {
    public Fiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    @Override
    public String describe() {
        return "Fiction: " + title + " by " + author;
    }
}
