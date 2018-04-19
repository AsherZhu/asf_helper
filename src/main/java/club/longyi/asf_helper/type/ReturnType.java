package club.longyi.asf_helper.type;

public enum ReturnType implements IEnum {
	
	SUCCESS(0,"成功"),
	
	UNKNOW_USER(1,"用户名密码错误"),
	
	INVALID_USER(2,"用户被禁用"),
	
	UNKNOW_ERROR(3,"未知错误"),
	
	PWD_ERROR(4,"密码错误"),
	
	ADMIN_ERROR(5,"不能删除ADMIN用户和角色"),

	NO_ASSET(6,"没有资源");
	
	private Integer key;
	
	private String value;
	
	ReturnType(Integer key , String value) {
		this.key = key; 
		
		this.value = value;
	}

	@Override
	public int getKey() {
		return this.key;
	}

	@Override
	public String getValue() {
		return this.value;
	}
}
