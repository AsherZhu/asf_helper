package club.longyi.asf_helper.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_tab")
public class UserEntity extends BaseEntity {

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "valid_flag")
    private Integer validFlag;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BotEntity> botEntities;


}
