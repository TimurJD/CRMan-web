package ua.com.vhsoft.crman.mvc.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@Entity
@Table(name = "tbl_contacts")
@NamedQueries({
    @NamedQuery(name = "TblContact.findAll", query = "SELECT t FROM TblContact t")})
public class TblContact implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "contact_id")
    private Integer contactId;
    @Size(max = 60)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 60)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 60)
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modified_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    @Column(name = "record_state")
    private Boolean recordState;
    @OneToMany(mappedBy = "contactId", fetch = FetchType.EAGER)
    private Set<TblOrder> tblOrderSet;
    @OneToMany(mappedBy = "contactId", fetch = FetchType.EAGER)
    private Set<TblCommunication> tblCommunicationSet;
    @OneToMany(mappedBy = "contactId", fetch = FetchType.EAGER)
    private Set<TblAddress> tblAddressSet;
    @OneToMany(mappedBy = "relContactId", fetch = FetchType.EAGER)
    private Set<TblActivity> tblActivitySet;
    @OneToMany(mappedBy = "contactId", fetch = FetchType.EAGER)
    private Set<TblContract> tblContractSet;
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TblAccount accountId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser createdBy;
    @JoinColumn(name = "modified_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser modifiedBy;
    @JoinColumn(name = "position_id", referencedColumnName = "position_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysPosition positionId;
    @JoinColumn(name = "relation_type_id", referencedColumnName = "relation_type_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubRelationType relationTypeId;
    @JoinColumn(name = "sex_id", referencedColumnName = "sex_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubSex sexId;
    @OneToMany(mappedBy = "contactId", fetch = FetchType.EAGER)
    private Set<TblQuote> tblQuoteSet;
    @OneToMany(mappedBy = "contactId", fetch = FetchType.EAGER)
    private Set<TblOpportunity> tblOpportunitySet;

    public TblContact() {
    }

    public TblContact(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRecordState() {
        return recordState;
    }

    public void setRecordState(Boolean recordState) {
        this.recordState = recordState;
    }

    public Set<TblOrder> getTblOrderSet() {
        return tblOrderSet;
    }

    public void setTblOrderSet(Set<TblOrder> tblOrderSet) {
        this.tblOrderSet = tblOrderSet;
    }

    public Set<TblCommunication> getTblCommunicationSet() {
        return tblCommunicationSet;
    }

    public void setTblCommunicationSet(Set<TblCommunication> tblCommunicationSet) {
        this.tblCommunicationSet = tblCommunicationSet;
    }

    public Set<TblAddress> getTblAddressSet() {
        return tblAddressSet;
    }

    public void setTblAddressSet(Set<TblAddress> tblAddressSet) {
        this.tblAddressSet = tblAddressSet;
    }

    public Set<TblActivity> getTblActivitySet() {
        return tblActivitySet;
    }

    public void setTblActivitySet(Set<TblActivity> tblActivitySet) {
        this.tblActivitySet = tblActivitySet;
    }

    public Set<TblContract> getTblContractSet() {
        return tblContractSet;
    }

    public void setTblContractSet(Set<TblContract> tblContractSet) {
        this.tblContractSet = tblContractSet;
    }

    public TblAccount getAccountId() {
        return accountId;
    }

    public void setAccountId(TblAccount accountId) {
        this.accountId = accountId;
    }

    public SysUser getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(SysUser createdBy) {
        this.createdBy = createdBy;
    }

    public SysUser getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(SysUser modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public SysPosition getPositionId() {
        return positionId;
    }

    public void setPositionId(SysPosition positionId) {
        this.positionId = positionId;
    }

    public SubRelationType getRelationTypeId() {
        return relationTypeId;
    }

    public void setRelationTypeId(SubRelationType relationTypeId) {
        this.relationTypeId = relationTypeId;
    }

    public SubSex getSexId() {
        return sexId;
    }

    public void setSexId(SubSex sexId) {
        this.sexId = sexId;
    }

    public Set<TblQuote> getTblQuoteSet() {
        return tblQuoteSet;
    }

    public void setTblQuoteSet(Set<TblQuote> tblQuoteSet) {
        this.tblQuoteSet = tblQuoteSet;
    }

    public Set<TblOpportunity> getTblOpportunitySet() {
        return tblOpportunitySet;
    }

    public void setTblOpportunitySet(Set<TblOpportunity> tblOpportunitySet) {
        this.tblOpportunitySet = tblOpportunitySet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactId != null ? contactId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblContact)) {
            return false;
        }
        TblContact other = (TblContact) object;
        if ((this.contactId == null && other.contactId != null) || (this.contactId != null && !this.contactId.equals(other.contactId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblContact[ contactId=" + contactId + " ]";
    }
    
}
