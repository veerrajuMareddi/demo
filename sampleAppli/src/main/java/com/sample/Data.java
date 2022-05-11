package com.sample;

public class Data {
	public String path;
	public String info;
	public int sno;
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


	public Data( String path, String info) {
		super();
		this.path = path;
		this.info = info;
	}
	public Data(int sno,String info)
	{
		super();
		this.sno=sno;
		this.info=info;
	}

}
