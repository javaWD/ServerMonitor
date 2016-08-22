package cn.com.esrichina.ServerMonitor.domain;

// Generated 2016-8-18 11:14:22 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Httpstep generated by hbm2java
 */
public class Httpstep implements java.io.Serializable {

	private long httpstepid;
	private Httptest httptest;
	private String name;
	private int no;
	private String url;
	private int timeout;
	private String posts;
	private String required;
	private String statusCodes;
	private String variables;
	private int followRedirects;
	private int retrieveMode;
	private String headers;
	private Set httpstepitems = new HashSet(0);

	public Httpstep() {
	}

	public Httpstep(long httpstepid, Httptest httptest, String name, int no,
			String url, int timeout, String posts, String required,
			String statusCodes, String variables, int followRedirects,
			int retrieveMode, String headers) {
		this.httpstepid = httpstepid;
		this.httptest = httptest;
		this.name = name;
		this.no = no;
		this.url = url;
		this.timeout = timeout;
		this.posts = posts;
		this.required = required;
		this.statusCodes = statusCodes;
		this.variables = variables;
		this.followRedirects = followRedirects;
		this.retrieveMode = retrieveMode;
		this.headers = headers;
	}

	public Httpstep(long httpstepid, Httptest httptest, String name, int no,
			String url, int timeout, String posts, String required,
			String statusCodes, String variables, int followRedirects,
			int retrieveMode, String headers, Set httpstepitems) {
		this.httpstepid = httpstepid;
		this.httptest = httptest;
		this.name = name;
		this.no = no;
		this.url = url;
		this.timeout = timeout;
		this.posts = posts;
		this.required = required;
		this.statusCodes = statusCodes;
		this.variables = variables;
		this.followRedirects = followRedirects;
		this.retrieveMode = retrieveMode;
		this.headers = headers;
		this.httpstepitems = httpstepitems;
	}

	public long getHttpstepid() {
		return this.httpstepid;
	}

	public void setHttpstepid(long httpstepid) {
		this.httpstepid = httpstepid;
	}

	public Httptest getHttptest() {
		return this.httptest;
	}

	public void setHttptest(Httptest httptest) {
		this.httptest = httptest;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return this.no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getTimeout() {
		return this.timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public String getPosts() {
		return this.posts;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}

	public String getRequired() {
		return this.required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public String getStatusCodes() {
		return this.statusCodes;
	}

	public void setStatusCodes(String statusCodes) {
		this.statusCodes = statusCodes;
	}

	public String getVariables() {
		return this.variables;
	}

	public void setVariables(String variables) {
		this.variables = variables;
	}

	public int getFollowRedirects() {
		return this.followRedirects;
	}

	public void setFollowRedirects(int followRedirects) {
		this.followRedirects = followRedirects;
	}

	public int getRetrieveMode() {
		return this.retrieveMode;
	}

	public void setRetrieveMode(int retrieveMode) {
		this.retrieveMode = retrieveMode;
	}

	public String getHeaders() {
		return this.headers;
	}

	public void setHeaders(String headers) {
		this.headers = headers;
	}

	public Set getHttpstepitems() {
		return this.httpstepitems;
	}

	public void setHttpstepitems(Set httpstepitems) {
		this.httpstepitems = httpstepitems;
	}

}