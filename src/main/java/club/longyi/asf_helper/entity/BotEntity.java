package club.longyi.asf_helper.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bot_tab")
public class BotEntity extends BaseEntity {
    @Column(name = "steam_login")
    private String SteamLogin;
    @Column(name = "steam_password")
    private String SteamPassword;
    @Column(name = "enabled")
    private boolean Enabled;
    @Column(name = "farm_offline")
    private boolean FarmOffline;

//    @Column(name = "user_entity")
    @OneToMany
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}
