package classRelationships;

// Class buat representasi project atau proyek yang lagi dikerjain
// Tiap project punya nama unik buat identifikasi
public class Project {

    private String projectName;

    // Constructor langsung nerima nama project waktu bikin objek baru
    // Nama ini gabisa diubah lagi soalnya gak ada setter
    public Project(String projectName) {
        this.projectName = projectName;
    }

    // Method buat dapetin nama project yang udah disimpen
    // Read-only karena cuma ada getter tanpa setter
    public String getProjectName() {
        return projectName;
    }
}