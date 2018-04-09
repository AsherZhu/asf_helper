package club.longyi.asf_helper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user_tab")
public class UserEntity extends BaseEntity {

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;


    @Column(name = "validFlag")
    private Integer validFlag;


}
