package libraryDesign.PO;

import java.util.Date;

public class Document {
	
	private String docID;		// ֤����
	private Date effdate;		// ��Ч����
	private Date expdate;		// ʧЧ����
	private Date appdate;		// ��֤����
	private float owed;			// Ƿ�ѽ��
	private Integer violations;	// Υ�´���
	private String usertypeID;	// ��������ID
	private float deposit;		// Ѻ��
	private Integer credits;	// �ܻ���
	private Integer counts;		// �ۼƽ��Ĵ���
	
	public String getDocID() {
		return docID;
	}
	public void setDocID(String docID) {
		this.docID = docID;
	}
	public Date getEffdate() {
		return effdate;
	}
	public void setEffdate(Date effdate) {
		this.effdate = effdate;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	public Date getAppdate() {
		return appdate;
	}
	public void setAppdate(Date appdate) {
		this.appdate = appdate;
	}
	public float getOwed() {
		return owed;
	}
	public void setOwed(float owed) {
		this.owed = owed;
	}
	public Integer getViolations() {
		return violations;
	}
	public void setViolations(Integer violations) {
		this.violations = violations;
	}
	public String getUsertypeID() {
		return usertypeID;
	}
	public void setUsertypeID(String usertypeID) {
		this.usertypeID = usertypeID;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public Integer getCredits() {
		return credits;
	}
	public void setCredits(Integer credits) {
		this.credits = credits;
	}
	public Integer getCounts() {
		return counts;
	}
	public void setCounts(Integer counts) {
		this.counts = counts;
	}
	
}
