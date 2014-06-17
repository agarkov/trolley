package domain;

// Generated 17.06.2014 13:52:54 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Eventobject generated by hbm2java
 */
@Entity
@Table(name = "eventobject", catalog = "trolley", uniqueConstraints = @UniqueConstraint(columnNames = {
		"eventId", "objType", "objId" }))
public class Eventobject implements java.io.Serializable {

	private EventobjectId id;
	private Event event;
	private Catobject catobject;

	public Eventobject() {
	}

	public Eventobject(EventobjectId id, Event event, Catobject catobject) {
		this.id = id;
		this.event = event;
		this.catobject = catobject;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "eventId", column = @Column(name = "eventId", nullable = false)),
			@AttributeOverride(name = "objType", column = @Column(name = "objType", nullable = false)),
			@AttributeOverride(name = "objId", column = @Column(name = "objId", nullable = false)) })
	public EventobjectId getId() {
		return this.id;
	}

	public void setId(EventobjectId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eventId", nullable = false, insertable = false, updatable = false)
	public Event getEvent() {
		return this.event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "objType", nullable = false, insertable = false, updatable = false)
	public Catobject getCatobject() {
		return this.catobject;
	}

	public void setCatobject(Catobject catobject) {
		this.catobject = catobject;
	}

}
