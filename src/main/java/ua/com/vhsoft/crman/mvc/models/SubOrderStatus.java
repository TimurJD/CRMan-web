package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sub_order_statuses")
@NamedQueries({
    @NamedQuery(name = "SubOrderStatus.findAll", query = "SELECT s FROM SubOrderStatus s")})
public class SubOrderStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_status_id")
    private Integer orderStatusId;
    @Size(max = 45)
    @Column(name = "status")
    private String status;
    

    public SubOrderStatus() {
    }

    public SubOrderStatus(Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public Integer getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderStatusId != null ? orderStatusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubOrderStatus)) {
            return false;
        }
        SubOrderStatus other = (SubOrderStatus) object;
        if ((this.orderStatusId == null && other.orderStatusId != null) || (this.orderStatusId != null && !this.orderStatusId.equals(other.orderStatusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SubOrderStatus[ orderStatusId=" + orderStatusId + " ]";
    }
    
}
