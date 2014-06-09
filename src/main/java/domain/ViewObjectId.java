package domain;

// Generated 09.06.2014 23:05:54 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewObjectId generated by hbm2java
 */
@Embeddable
public class ViewObjectId implements java.io.Serializable {

	private int viewId;
	private int objType;
	private int objId;
	private BigDecimal pos;

	public ViewObjectId() {
	}

	public ViewObjectId(int viewId, int objType, int objId, BigDecimal pos) {
		this.viewId = viewId;
		this.objType = objType;
		this.objId = objId;
		this.pos = pos;
	}

	@Column(name = "viewID", nullable = false)
	public int getViewId() {
		return this.viewId;
	}

	public void setViewId(int viewId) {
		this.viewId = viewId;
	}

	@Column(name = "objType", nullable = false)
	public int getObjType() {
		return this.objType;
	}

	public void setObjType(int objType) {
		this.objType = objType;
	}

	@Column(name = "objID", nullable = false)
	public int getObjId() {
		return this.objId;
	}

	public void setObjId(int objId) {
		this.objId = objId;
	}

	@Column(name = "pos", nullable = false, precision = 4)
	public BigDecimal getPos() {
		return this.pos;
	}

	public void setPos(BigDecimal pos) {
		this.pos = pos;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewObjectId))
			return false;
		ViewObjectId castOther = (ViewObjectId) other;

		return (this.getViewId() == castOther.getViewId())
				&& (this.getObjType() == castOther.getObjType())
				&& (this.getObjId() == castOther.getObjId())
				&& ((this.getPos() == castOther.getPos()) || (this.getPos() != null
						&& castOther.getPos() != null && this.getPos().equals(
						castOther.getPos())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getViewId();
		result = 37 * result + this.getObjType();
		result = 37 * result + this.getObjId();
		result = 37 * result
				+ (getPos() == null ? 0 : this.getPos().hashCode());
		return result;
	}

}