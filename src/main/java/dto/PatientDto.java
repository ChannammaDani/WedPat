package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Patient_details")
public class PatientDto {
	@Id
private int id;
private String name;
private String b_group;
private long phn_no;
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
public String getB_group() {
	return b_group;
}
public void setB_group(String b_group) {
	this.b_group = b_group;
}
public long getPhn_no() {
	return phn_no;
}
public void setPhn_no(long phn_no) {
	this.phn_no = phn_no;
}

}
