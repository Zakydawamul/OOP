package classRelationships;

// Manager itu sebenernya juga Employee, cuma dia punya tanggung jawab lebih
// Dia bisa handle project, makanya ada relasi tambahan ke class Project
public class Manager extends Employee {

    // Variabel buat nyimpen project yang di-manage sama manager ini
    private Project project;

    // Constructor manager simpel, cuma butuh nama
    // Sisanya ngandalin constructor dari Employee (yang juga ngandalin Person)
    public Manager(String name) {
        super(name);
    }

    // Method buat assign project ke manager tertentu
    // Satu manager bisa pegang satu project
    public void setProject(Project project) {
        this.project = project;
    }

    // Method buat ngecek project apa yang lagi di-handle manager ini
    // Bakal return objek Project-nya langsung
    public Project getProject() {
        return project;
    }
}