package Object;

import java.io.Serializable;


public class Voiture implements Serializable{
	private static  final long serialVersionUID=1L;
private int id;
private String name;

public Voiture(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

@Override
public String toString() {
	return "voiture [id=" + id + ", nom=" + name + "]";
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
