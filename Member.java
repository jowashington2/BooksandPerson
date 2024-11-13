public class Member extends Person {
    public Member(String name, String id) {
        super(name, id);
    }

    @Override
    public String describe() {
        return "Library Member: " + name;
    }
}
