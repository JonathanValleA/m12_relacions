package demojparelacions.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data
@NoArgsConstructor
public class CourseMaterial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String url;

	public CourseMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseMaterial(long id, String url) {
		super();
		this.id = id;
		this.url = url;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "CourseMaterial [id=" + id + ", url=" + url + "]";
	}
	
}
