package vo;

public class WinnerVO {
	private int bno, status, hits;
	private String title, contents, date;
	public WinnerVO() {
		
	}
	public int getBno() {
		return bno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public WinnerVO(int bno, int status, int hits, String title,
			String contents, String date) {
		super();
		this.bno = bno;
		this.status = status;
		this.hits = hits;
		this.title = title;
		this.contents = contents;
		this.date = date;
	}
	
	
}
