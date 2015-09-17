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

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "sys_permissions")
@NamedQueries({
    @NamedQuery(name = "SysPermission.findAll", query = "SELECT s FROM SysPermission s")})
public class SysPermission implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "permission_id")
    private Integer permissionId;
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysRole roleId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser userId;

    public SysPermission() {
    }

    public SysPermission(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public SysRole getRoleId() {
        return roleId;
    }

    public void setRoleId(SysRole roleId) {
        this.roleId = roleId;
    }

    public SysUser getUserId() {
        return userId;
    }

    public void setUserId(SysUser userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permissionId != null ? permissionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysPermission)) {
            return false;
        }
        SysPermission other = (SysPermission) object;
        if ((this.permissionId == null && other.permissionId != null) || (this.permissionId != null && !this.permissionId.equals(other.permissionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.SysPermission[ permissionId=" + permissionId + " ]";
    }
    
}
