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
@Table(name = "tbl_leads")
@NamedQueries({
    @NamedQuery(name = "TblLead.findAll", query = "SELECT t FROM TblLead t")})
public class TblLead implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lead_id")
    private Integer leadId;
    @Size(max = 60)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 60)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 60)
    @Column(name = "middle_name")
    private String middleName;
    @Size(max = 100)
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "employees_count")
    private Integer employeesCount;
    @Column(name = "annual_revenue")
    private Long annualRevenue;
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
    @Column(name = "is_qualified")
    private Boolean isQualified;
    @Column(name = "record_state")
    private Boolean recordState;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser createdBy;
    @JoinColumn(name = "industry_id", referencedColumnName = "industry_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubIndustry industryId;
    @JoinColumn(name = "modified_by", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser modifiedBy;
    @JoinColumn(name = "lead_owner_id", referencedColumnName = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SysUser leadOwnerId;
    @JoinColumn(name = "relation_type_id", referencedColumnName = "relation_type_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubRelationType relationTypeId;
    @JoinColumn(name = "sex_id", referencedColumnName = "sex_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubSex sexId;
    @JoinColumn(name = "lead_source_id", referencedColumnName = "lead_source_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubLeadSource leadSourceId;
    @OneToMany(mappedBy = "leadId", fetch = FetchType.EAGER)
    private Set<TblCommunication> tblCommunicationSet;
    @OneToMany(mappedBy = "leadId", fetch = FetchType.EAGER)
    private Set<TblAddress> tblAddressSet;

    public TblLead() {
    }

    public TblLead(Integer leadId) {
        this.leadId = leadId;
    }

    public Integer getLeadId() {
        return leadId;
    }

    public void setLeadId(Integer leadId) {
        this.leadId = leadId;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(Integer employeesCount) {
        this.employeesCount = employeesCount;
    }

    public Long getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(Long annualRevenue) {
        this.annualRevenue = annualRevenue;
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

    public Boolean getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(Boolean isQualified) {
        this.isQualified = isQualified;
    }

    public Boolean getRecordState() {
        return recordState;
    }

    public void setRecordState(Boolean recordState) {
        this.recordState = recordState;
    }

    public SysUser getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(SysUser createdBy) {
        this.createdBy = createdBy;
    }

    public SubIndustry getIndustryId() {
        return industryId;
    }

    public void setIndustryId(SubIndustry industryId) {
        this.industryId = industryId;
    }

    public SysUser getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(SysUser modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public SysUser getLeadOwnerId() {
        return leadOwnerId;
    }

    public void setLeadOwnerId(SysUser leadOwnerId) {
        this.leadOwnerId = leadOwnerId;
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

    public SubLeadSource getLeadSourceId() {
        return leadSourceId;
    }

    public void setLeadSourceId(SubLeadSource leadSourceId) {
        this.leadSourceId = leadSourceId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (leadId != null ? leadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblLead)) {
            return false;
        }
        TblLead other = (TblLead) object;
        if ((this.leadId == null && other.leadId != null) || (this.leadId != null && !this.leadId.equals(other.leadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ua.com.vhsoft.crman.mvc.models.TblLead[ leadId=" + leadId + " ]";
    }
    
}
