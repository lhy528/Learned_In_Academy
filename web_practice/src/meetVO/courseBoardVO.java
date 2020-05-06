package meetVO;

public class courseBoardVO {
	private int bno;
	private String jspname;
	private String img_src;
	private String img_alt;
	private String spotname;
	private int star;
	
	public courseBoardVO() {
		
	}
	
	public courseBoardVO(int bno, String jspname, String img_src, String img_alt, String spotname, int star) {
		super();
		this.bno = bno;
		this.jspname = jspname;
		this.img_src = img_src;
		this.img_alt = img_alt;
		this.spotname = spotname;
		this.star = star;
	}



	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getJspname() {
		return jspname;
	}

	public void setJspname(String jspname) {
		this.jspname = jspname;
	}

	public String getImg_src() {
		return img_src;
	}

	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}

	public String getImg_alt() {
		return img_alt;
	}

	public void setImg_alt(String img_alt) {
		this.img_alt = img_alt;
	}

	public String getSpotname() {
		return spotname;
	}

	public void setSpotname(String spotname) {
		this.spotname = spotname;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	
	
	
	
}
