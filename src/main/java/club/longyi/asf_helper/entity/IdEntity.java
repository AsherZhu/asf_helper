package club.longyi.asf_helper.entity;

import javax.persistence.*;

@MappedSuperclass
public class IdEntity {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
