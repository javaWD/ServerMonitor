package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * Opconditions generated by hbm2java
 */
public class Opconditions implements java.io.Serializable {

	private long opconditionid;
	private Operations operations;
	private int conditiontype;
	private int operator;
	private String value;

	public Opconditions() {
	}

	public Opconditions(long opconditionid, Operations operations,
			int conditiontype, int operator, String value) {
		this.opconditionid = opconditionid;
		this.operations = operations;
		this.conditiontype = conditiontype;
		this.operator = operator;
		this.value = value;
	}

	public long getOpconditionid() {
		return this.opconditionid;
	}

	public void setOpconditionid(long opconditionid) {
		this.opconditionid = opconditionid;
	}

	public Operations getOperations() {
		return this.operations;
	}

	public void setOperations(Operations operations) {
		this.operations = operations;
	}

	public int getConditiontype() {
		return this.conditiontype;
	}

	public void setConditiontype(int conditiontype) {
		this.conditiontype = conditiontype;
	}

	public int getOperator() {
		return this.operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
