package library.PO;

public class Usertype {
	
	private String usertypeID;	// ��������ID
	private String usertype;	// ����������
	private Integer maxbooknum;	// ���ɽ�ͼ����Ŀ
	private Integer maxorder;	// ����ԤԼ
	private Integer maxentrust;	// ����ί��
	
	public String getUsertypeID() {
		return usertypeID;
	}
	public void setUsertypeID(String usertypeID) {
		this.usertypeID = usertypeID;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public Integer getMaxbooknum() {
		return maxbooknum;
	}
	public void setMaxbooknum(Integer maxbooknum) {
		this.maxbooknum = maxbooknum;
	}
	public Integer getMaxorder() {
		return maxorder;
	}
	public void setMaxorder(Integer maxorder) {
		this.maxorder = maxorder;
	}
	public Integer getMaxentrust() {
		return maxentrust;
	}
	public void setMaxentrust(Integer maxentrust) {
		this.maxentrust = maxentrust;
	}
	
}
