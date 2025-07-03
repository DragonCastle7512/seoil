package school;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.ToString;


@Entity
@ToString
public class Student implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** �닚踰�. */
	private Integer id;

	/** �븰踰�. */
	private String sid;

	/** �씠由�. */
	private String name;

	/** �쟾�솕踰덊샇. */
	private String hp;

	/**
	 * �깮�꽦�옄.
	 */
	public Student() {
	}

	/**
	 * �닚踰덉쓣 �꽕�젙�빀�땲�떎..
	 * 
	 * @param id
	 *            �닚踰�
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * �닚踰덉쓣 媛��졇�샃�땲�떎..
	 * 
	 * @return �닚踰�
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * �븰踰덉쓣 �꽕�젙�빀�땲�떎..
	 * 
	 * @param sid
	 *            �븰踰�
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * �븰踰덉쓣 媛��졇�샃�땲�떎..
	 * 
	 * @return �븰踰�
	 */
	public String getSid() {
		return this.sid;
	}

	/**
	 * �씠由꾩쓣 �꽕�젙�빀�땲�떎..
	 * 
	 * @param name
	 *            �씠由�
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * �씠由꾩쓣 媛��졇�샃�땲�떎..
	 * 
	 * @return �씠由�
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * �쟾�솕踰덊샇�쓣 �꽕�젙�빀�땲�떎..
	 * 
	 * @param hp
	 *            �쟾�솕踰덊샇
	 */
	public void setHp(String hp) {
		this.hp = hp;
	}

	/**
	 * �쟾�솕踰덊샇�쓣 媛��졇�샃�땲�떎..
	 * 
	 * @return �쟾�솕踰덊샇
	 */
	public String getHp() {
		return this.hp;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
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
