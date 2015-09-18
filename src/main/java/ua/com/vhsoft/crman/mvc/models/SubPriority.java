package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sub_priorities")
@NamedQueries({
    @NamedQuery(name = "SubPriority.findAll", query = "SELECT s FROM SubPriority s")})
public class SubPriority implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "priority_id")
    private Integer priorityId;
    @Size(max = 45)
    @Column(name = "priority")
    private String priority;
    
    public SubPriority() {
    }

    public SubPriority(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (priorityId != null ? priorityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubPriority)) {
            return false;
        }
        SubPriority other = (SubPriority) object;
        if ((this.priorityId == null && other.priorityId != null) || (this.priorityId != null && !this.priorityId.equals(other.priorityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubPriority[ priorityId=" + priorityId + " ]";
    }
    
}
