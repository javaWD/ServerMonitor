package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

/**
 * Trends generated by hbm2java
 */
public class Trends implements java.io.Serializable {

	private TrendsId id;
	private int num;
	private double valueMin;
	private double valueAvg;
	private double valueMax;

	public Trends() {
	}

	public Trends(TrendsId id, int num, double valueMin, double valueAvg,
			double valueMax) {
		this.id = id;
		this.num = num;
		this.valueMin = valueMin;
		this.valueAvg = valueAvg;
		this.valueMax = valueMax;
	}

	public TrendsId getId() {
		return this.id;
	}

	public void setId(TrendsId id) {
		this.id = id;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getValueMin() {
		return this.valueMin;
	}

	public void setValueMin(double valueMin) {
		this.valueMin = valueMin;
	}

	public double getValueAvg() {
		return this.valueAvg;
	}

	public void setValueAvg(double valueAvg) {
		this.valueAvg = valueAvg;
	}

	public double getValueMax() {
		return this.valueMax;
	}

	public void setValueMax(double valueMax) {
		this.valueMax = valueMax;
	}

}
