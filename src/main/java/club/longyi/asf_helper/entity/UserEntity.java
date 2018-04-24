package club.longyi.asf_helper.entity;

import club.longyi.asf_helper.module.base.entity.BaseEntity;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "user_tab")
public class UserEntity extends BaseEntity {

    @Column(name = "user_name", unique = true)
    @NotEmpty(message = "用户名不能为空")
    @Size(min = 2,max = 20,message = "用户名长度必须大于 2 且小于 20 字")
    @UniqueElements
    private String userName;

    @NotNull(message = "密码不能为空")
    @Size(min = 6,max = 20,message = "用户名长度必须大于 6 且小于 20 字")
    @Column(name = "password")
    private String password;



    @NotEmpty(message = "邮箱不能为空")
    @Column(name = "email" ,unique = true)
    @UniqueElements
    private String email;

    @Column(name = "valid_flag")
    private Integer validFlag;

    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BotEntity> botEntities;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Integer validFlag) {
        this.validFlag = validFlag;
    }

    public List<BotEntity> getBotEntities() {
        return botEntities;
    }

    public void setBotEntities(List<BotEntity> botEntities) {
        this.botEntities = botEntities;
    }
}
