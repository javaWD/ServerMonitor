package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * DbversionId generated by hbm2java
 */
public class DbversionId implements java.io.Serializable {

	private int mandatory;
	private int optional;

	public DbversionId() {
	}

	public DbversionId(int mandatory, int optional) {
		this.mandatory = mandatory;
		this.optional = optional;
	}

	public int getMandatory() {
		return this.mandatory;
	}

	public void setMandatory(int mandatory) {
		this.mandatory = mandatory;
	}

	public int getOptional() {
		return this.optional;
	}

	public void setOptional(int optional) {
		this.optional = optional;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DbversionId))
			return false;
		DbversionId castOther = (DbversionId) other;

		return (this.getMandatory() == castOther.getMandatory())
				&& (this.getOptional() == castOther.getOptional());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMandatory();
		result = 37 * result + this.getOptional();
		return result;
	}

}