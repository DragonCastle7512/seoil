package hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;


//@Component
@ToString
public class Student implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator
	(name = "student_seq",sequenceName ="student_seq",allocationSize = 1 )
	@GeneratedValue
	(strategy = GenerationType.SEQUENCE, generator = "student_seq")
	//@Column(name="id", unique = true, nullable = false)
	private Integer id;

	private String sid;

	private String name;

	private String hp;

	public Student() {
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSid() {
		return this.sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getHp() {
		return this.hp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}