public class LibrarySystemAdapter implements SystemAdapter {
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public void integrateSystem() {
        librarySystem.manageBooks();
    }
}
