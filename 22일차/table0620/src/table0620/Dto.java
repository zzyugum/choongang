package table0620;

public class Dto {

	private int id;
	private String name;
	private String addr;
	private String phon;
	
	public Dto(int id, String name, String addr, String phon) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.phon = phon;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhon() {
		return phon;
	}
	public void setPhon(String phon) {
		this.phon = phon;
	}

	@Override
	public String toString() {
		return "Person id=" + id + ", name=" + name + ", addr=" + addr + ", phon=" + phon + "]";
	}
	
}
