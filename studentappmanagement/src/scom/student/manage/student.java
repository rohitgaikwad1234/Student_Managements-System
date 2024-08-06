package scom.student.manage;

public class student {
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String studentname, String studentphone, String studentcity) {
		super();
		this.studentname = studentname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	public student(int studetnid, String studentname, String studentphone, String studentcity) {
		super();
		this.studetnid = studetnid;
		this.studentname = studentname;
		this.studentphone = studentphone;
		this.studentcity = studentcity;
	}
	private int studetnid;
	private String studentname;
	private String studentphone;
	private String studentcity;
	
	
	public int getStudetnid() {
		return studetnid;
	}
	public void setStudetnid(int studetnid) {
		this.studetnid = studetnid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentphone() {
		return studentphone;
	}
	public void setStudentphone(String studentphone) {
		this.studentphone = studentphone;
	}
	public String getStudentcity() {
		return studentcity;
	}
	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	@Override
	public String toString() {
		return "student [studetnid=" + studetnid + ", studentname=" + studentname + ", studentphone=" + studentphone
				+ ", studentcity=" + studentcity + "]";
	}
	
	
	

}
