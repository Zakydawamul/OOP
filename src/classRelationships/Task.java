package classRelationships;

// Class Task buat bikin tugas-tugas kecil dalam suatu project
// Konsepnya mirip kayak to-do list item gitu
public class Task {

    private String taskName;

    // Constructor nerima nama task yang mau dibuat
    // Biasanya dipanggil berkali-kali buat bikin banyak task dalam satu project
    public Task(String taskName) {
        this.taskName = taskName;
    }

    // Method getter standar buat ngambil nama task
    // Kepake waktu mau nampilin list task atau ngecek progress
    public String getTaskName() {
        return taskName;
    }
}