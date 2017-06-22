package unidue.ub.services.settings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Eike on 22.06.2017.
 */
@Entity
public class Stockcontrol {

    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private String subjectID;

    private String systemCode;

    private String collections;

    private String materials;

    private Integer yearsToAverage;

    private Integer minimumYears;

    private Double staticBuffer;

    private Double variableBuffer;

    private Integer threshold;

    private String deletionMailBcc;

    private String stockControl;

    private Integer yearsOfRequests;

    private Integer minimumDaysOfRequest;

    private Double blacklistExpire;

    private boolean groupedAnalysis;

    public Stockcontrol() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID.trim();
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode.trim();
    }

    public String getCollections() {
        return collections;
    }

    public void setCollections(String collections) {
        this.collections = collections.trim();
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials.trim();
    }

    public Integer getYearsToAverage() {
        return yearsToAverage;
    }

    public void setYearsToAverage(Integer yearsToAverage) {
        this.yearsToAverage = yearsToAverage;
    }

    public Integer getMinimumYears() {
        return minimumYears;
    }

    public void setMinimumYears(Integer minimumYears) {
        this.minimumYears = minimumYears;
    }

    public Double getStaticBuffer() {
        return staticBuffer;
    }

    public void setStaticBuffer(Double staticBuffer) {
        this.staticBuffer = staticBuffer;
    }

    public Double getVariableBuffer() {
        return variableBuffer;
    }

    public void setVariableBuffer(Double variableBuffer) {
        this.variableBuffer = variableBuffer;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public String getDeletionMailBcc() {
        return deletionMailBcc;
    }

    public void setDeletionMailBcc(String deletionMailBcc) {
        this.deletionMailBcc = deletionMailBcc.trim();
    }

    public String getStockControl() {
        return stockControl;
    }

    public void setStockControl(String stockControl) {
        this.stockControl = stockControl.trim();
    }

    public Integer getYearsOfRequests() {
        return yearsOfRequests;
    }

    public void setYearsOfRequests(Integer yearsOfRequests) {
        this.yearsOfRequests = yearsOfRequests;
    }

    public Integer getMinimumDaysOfRequest() {
        return minimumDaysOfRequest;
    }

    public void setMinimumDaysOfRequest(Integer minimumDaysOfRequest) {
        this.minimumDaysOfRequest = minimumDaysOfRequest;
    }

    public Double getBlacklistExpire() {
        return blacklistExpire;
    }

    public void setBlacklistExpire(Double blacklistExpire) {
        this.blacklistExpire = blacklistExpire;
    }

    public boolean isGroupedAnalysis() {
        return groupedAnalysis;
    }

    public void setGroupedAnalysis(boolean groupedAnalysis) {
        this.groupedAnalysis = groupedAnalysis;
    }




}
