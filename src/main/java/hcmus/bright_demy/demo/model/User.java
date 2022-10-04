package hcmus.bright_demy.demo.model;
import javax.persistence.*;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="mssv")
    private long mssv;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name="full_name", nullable = false)
    private String fullName;

    @Column(name="phone")
    private String phone;
}
