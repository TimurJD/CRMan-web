package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "tbl_communications")
@NamedQueries({
    @NamedQuery(name = "TblCommunication.findAll", query = "SELECT t FROM TblCommunication t")})
public class TblCommunication implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "communication_id")
    private Integer communicationId;
    @Size(max = 100)
    @Column(name = "value")
    private String value;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modified_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "is_main")
    private Boolean isMain;
    @Column(name = "record_state")
    private Boolean recordState;
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblAccount accountId;
    @JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblContact contactId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser createdBy;
    @JoinColumn(name = "lead_id", referencedColumnName = "lead_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblLead leadId;
    @JoinColumn(name = "modified_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser modifiedBy;
    @JoinColumn(name = "communication_type_id", referencedColumnName = "communication_type_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private SubCommunicationType communicationTypeId;

    public TblCommunication() {
    }

    public TblCommunication(Integer communicationId) {
        this.communicationId = communicationId;
    }

    public Integer getCommunicationId() {
        return communicationId;
    }

    public void setCommunicationId(Integer communicationId) {
        this.communicationId = communicationId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    public Boolean getRecordState() {
        return recordState;
    }

    public void setRecordState(Boolean recordState) {
        this.recordState = recordState;
    }

    public TblAccount getAccountId() {
        return accountId;
    }

    public void setAccountId(TblAccount accountId) {
        this.accountId = accountId;
    }

    public TblContact getContactId() {
        return contactId;
    }

    public void setContactId(TblContact contactId) {
        this.contactId = contactId;
    }

    public SysUser getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(SysUser createdBy) {
        this.createdBy = createdBy;
    }

    public TblLead getLeadId() {
        return leadId;
    }

    public void setLeadId(TblLead leadId) {
        this.leadId = leadId;
    }

    public SysUser getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(SysUser modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public SubCommunicationType getCommunicationTypeId() {
        return communicationTypeId;
    }

    public void setCommunicationTypeId(SubCommunicationType communicationTypeId) {
        this.communicationTypeId = communicationTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (communicationId != null ? communicationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCommunication)) {
            return false;
        }
        TblCommunication other = (TblCommunication) object;
        if ((this.communicationId == null && other.communicationId != null) || (this.communicationId != null && !this.communicationId.equals(other.communicationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblCommunication[ communicationId=" + communicationId + " ]";
    }
    
}
