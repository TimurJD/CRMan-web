package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sys_filters")
@NamedQueries({
    @NamedQuery(name = "SysFilter.findAll", query = "SELECT s FROM SysFilter s")})
public class SysFilter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "filter_id")
    private Integer filterId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser userId;
    @Size(max = 45)
    @Column(name = "table_name")
    private String tableName;
    @Size(max = 45)
    @Column(name = "column_name")
    private String columnName;
    @Size(max = 45)
    @Column(name = "condition")
    private String condition;
    @Size(max = 100)
    @Column(name = "value")
    private String value;

    public SysFilter() {
    }

    public SysFilter(Integer filterId) {
        this.filterId = filterId;
    }

    public Integer getFilterId() {
        return filterId;
    }

    public void setFilterId(Integer filterId) {
        this.filterId = filterId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filterId != null ? filterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysFilter)) {
            return false;
        }
        SysFilter other = (SysFilter) object;
        if ((this.filterId == null && other.filterId != null) || (this.filterId != null && !this.filterId.equals(other.filterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SysFilter[ filterId=" + filterId + " ]";
    }

    public SysUser getUserId() {
        return userId;
    }

    public void setUserId(SysUser userId) {
        this.userId = userId;
    }
    
}
