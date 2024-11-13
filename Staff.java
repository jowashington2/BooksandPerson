public class Staff extends Person {
    public Staff(String name, String id) {
        super(name, id);
    }

    @Override
    public String describe() {
        return "Library Staff: " + name;
    }

    public void registerMember(Library library, Member member) {
        library.registerMember(member);
    }

    public void registerBook(Library library, Book book) {
        library.addBook(book);
    }
}
