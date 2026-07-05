package SmartGym_ERP.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String gymPackage;

    @Column(nullable = false)
    private String status = "Active";

    // Default Constructor
    public Member() {
    }

    // Constructor with fields
    public Member(String name, String email, String gymPackage, String status) {
        this.name = name;
        this.email = email;
        this.gymPackage = gymPackage;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGymPackage() {
        return gymPackage;
    }

    public void setGymPackage(String gymPackage) {
        this.gymPackage = gymPackage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}