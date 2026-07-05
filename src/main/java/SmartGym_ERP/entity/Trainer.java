package SmartGym_ERP.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "trainers")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String specialization; // උදා: Bodybuilding, Cardio, Yoga

    @Column(nullable = false)
    private String status = "Active";

    public Trainer() {}

    public Trainer(String name, String email, String specialization, String status) {
        this.name = name;
        this.email = email;
        this.specialization = specialization;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}