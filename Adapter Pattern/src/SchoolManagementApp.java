public class SchoolManagementApp {
    private SystemAdapter attendanceAdapter;
    private SystemAdapter gradingAdapter;
    private SystemAdapter libraryAdapter;

    public SchoolManagementApp(SystemAdapter attendanceAdapter, SystemAdapter gradingAdapter, SystemAdapter libraryAdapter) {
        this.attendanceAdapter = attendanceAdapter;
        this.gradingAdapter = gradingAdapter;
        this.libraryAdapter = libraryAdapter;
    }

    public void integrateAllSystems() {
        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
    }

    public static void main(String[] args) {
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SystemAdapter attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SystemAdapter gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SystemAdapter libraryAdapter = new LibrarySystemAdapter(librarySystem);

        SchoolManagementApp app = new SchoolManagementApp(attendanceAdapter, gradingAdapter, libraryAdapter);
        app.integrateAllSystems();
    }
}