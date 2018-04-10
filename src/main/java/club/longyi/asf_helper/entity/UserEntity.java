package club.longyi.asf_helper.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
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

    @OneToMany(mappedBy = "bot_entity_id")
//    @JoinColumn(name = "user_tab_id" )
    private List<BotEntity> botEntities = new ArrayList<>();


}
