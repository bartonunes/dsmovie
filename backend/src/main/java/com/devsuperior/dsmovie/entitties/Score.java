package com.devsuperior.dsmovie.entitties;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="tb_score")
public class Score implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ScorePk id = new ScorePk();
	private Double value;

	private Score() {
	}
	
	/*associar filme com o score*/
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	/*associar user com o score*/
	public void setUser(User user) {
		id.setUser(user);
	}
	
	public ScorePk getId() {
		return id;
	}

	public void setId(ScorePk id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	

}

