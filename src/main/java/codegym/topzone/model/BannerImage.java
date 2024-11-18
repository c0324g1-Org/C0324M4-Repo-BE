package codegym.topzone.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "banner_image")
public class BannerImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bannerName")
    private String bannerName;

    @Column(name = "isShow")
    private Byte isShow;

    private LocalDateTime created_at = LocalDateTime.now();
    private LocalDateTime updated_at = LocalDateTime.now();
}
