## ASF_Helper开发文档
数据库结构：

#### 用户表

|Field|Type|Null|Key|Default|Extra|Comment|
|---|---|---|---|---|---|---|
|id|lang|NO|PRI|(NULL)|AUTO|主键ID，自动生成|
|user_name|varchar(50)|NO| |(NULL)| |用户名|
|password|varchar(50)|NO| |(NULL)| |密码|
|validFlag|tinyint|NO| |1| |是否有效0:无效1:有效|
|create_time|datetime|NO| |(NULL)| |创建时间|
|create_user_ip|varchar(39)|NO| |(NULL)| |创建IP|
|last_login_time|datetime|NO| |(NULL)| |最后登陆时间|
|last_login_ip|varchar(39)|NO| |(NULL)| |最后登陆IP|


#### BOT配置表

|Field|Type|Null|Key|Default|Extra|Comment|
|---|---|---|---|---|---|---|
|id|UUID|NO|PRI|(NULL)|AUTO|主键ID，自动生成|
|user_id|UUID|NO|FOR|NUll| |外键ID，用户UUID|
|SteamLogin|varchar(64)|NO| |NULL|UNIQUE|Steam账号|
|SteamPassword|varchar(64)|NO| |NULL| |Steam密码|
|Enabled|tinyint|NO| |0| |是否启用BOT 0:不启用1:启用|
|FarmOffline|tinyint|NO| |0| |是否启用离线模式 0:不启用1:启用|


