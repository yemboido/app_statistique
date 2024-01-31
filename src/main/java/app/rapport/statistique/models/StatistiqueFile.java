package app.rapport.statistique.models;

public class StatistiqueFile {
  private String base64;
  private String typeFile;
  
  
public StatistiqueFile() {
	super();
}
public StatistiqueFile(String base64, String typeFile) {
	super();
	this.base64 = base64;
	this.typeFile = typeFile;
}
public String getBase64() {
	return base64;
}
public void setBase64(String base64) {
	this.base64 = base64;
}
public String getTypeFile() {
	return typeFile;
}
public void setTypeFile(String typeFile) {
	this.typeFile = typeFile;
}
  
}
