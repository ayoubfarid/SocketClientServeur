package p2;
import java.io.*;


public class Voiture implements Serializable{
private int id;
private String nom;

public Voiture(int id, String nom) {
	super();
	this.id = id;
	this.nom = nom;
}

@Override
public String toString() {
	return "voiture [id=" + id + ", nom=" + nom + "]";
}

public void setId(int id) {
	this.id = id;
}

public void setNom(String nom) {
	this.nom = nom;
}





}
