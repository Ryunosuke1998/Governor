package model;

public class Governor {
	private String name;
	private String q1;
	private String q2;
	private String q3;
	private String q4;
	private String q5;

	public Governor(String name, String q1, String q2, String q3, String q4, String q5) {
		this.name = name;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
	}
	public Governor(String q1, String q2, String q3, String q4, String q5) {
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
	}
	//getter
	public String getName() {
		return name;
	}

	public String getQ1() {
		return q1;
	}

	public String getQ2() {
		return q2;
	}

	public String getQ3() {
		return q3;
	}

	public String getQ4() {
		return q4;
	}

	public String getQ5() {
		return q5;
	}


}
