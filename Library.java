import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Staff> staff = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    public void listBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book.describe());
        }
    }

    public void listMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member.describe());
        }
    }

    public void listStaff() {
        System.out.println("Library Staff:");
        for (Staff staffMember : staff) {
            System.out.println(staffMember.describe());
        }
    }
}
