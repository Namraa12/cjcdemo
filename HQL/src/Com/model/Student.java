package Com.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Entity
public class Student 
{
	@Id
	//Genreatedvalue(strategy =GenerationType.IDENTITY)
	private int Rollno;
	private String Name;
	
	
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}
