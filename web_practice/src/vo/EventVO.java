package vo;

public class EventVO {
	private int bno, status, hits;
	private String title, contents, date, img_url, date_start, date_end;
	public EventVO() {
		
	}
	
	public String getDate_start() {
		return date_start;
	}

	public void setDate_start(String date_start) {
		this.date_start = date_start;
	}

	public String getDate_end() {
		return date_end;
	}

	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}

	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
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
	public EventVO(int bno, int status, int hits, String title,
			String contents, String date, String img_url, String date_start, String date_end) {
		super();
		this.bno = bno;
		this.status = status;
		this.hits = hits;
		this.title = title;
		this.contents = contents;
		this.date = date;
		this.img_url = img_url;
		this.date_start = date_start;
		this.date_end = date_end;
	}
	
	
}
