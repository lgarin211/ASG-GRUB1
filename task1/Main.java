public class Main {
    public static void main(String[] args) {
        Library library = new Library(100);

        User admin = new Admin("A001", "Admin Perpus");
        User member = new Member("M001", "Anggota Satu");

        User[] users = { admin, member };

        for (User u : users) {
            System.out.println("\nUser: " + u.getName());
            u.showMenu();
            u.interactWithSystem(library);
        }
    }
}
