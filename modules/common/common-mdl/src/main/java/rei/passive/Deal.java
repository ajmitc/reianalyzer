package rei.passive;

import java.util.ArrayList;
import java.util.List;
import rei.passive.market.Market;

/**
 * This class represents a single deal posted by a Sponsor
 * @author aaron.mitchell
 */
public class Deal {
    private Sponsor sponsor;
    private Market market; // Census Data
    private Market sponsorMarketClaims;

    private String name;    // Tower Place Apartments
    private String source;  // EquityMultiple, CrowdStreet
    private String link;    // Link to on-line deal

    private String reType;    // Multifamily, Commercial
    private String investmentType;  // Equity, Debt

    private String propertyClass;   // A, A/B, B, etc
    private Integer numUnits;
    private String yearBuilt;
    private String yearRenovated;
    private Float purchasePrice;
    private Integer holdYears;

    // Senior Loan
    private String loanType;
    private Float loanAmount;
    private Float ltv;
    private Float ltc;
    private Float currentLibor;
    private Float loanRate;
    private String prepaymentPenalty;
    private Float principlePlusInterestPayment;

    // Capital Stack (Sources)
    private List<FundingSource> fundingSources = new ArrayList<>();

    // Returns
    private Float targetedIRR;
    private Float targetedEM;
    private Float targetedAvgCashYield;
    private Boolean classAOrPreferredEquity;
    private String paymentSchedule; // Quarterly, Yearly

    // Fees
    private Float acquisitionFee;
    private Float dispositionFee;
    private Float assetManagementFee;
    private Float constructionManagementFee;
    private Float propertyManagementFee;
    private Float equityPlacementFee;
    private Float guarantyFee;
    private Float refinancingFee; // financing/refinancing fee

    // Returns timeline
    private List<TimelineEntry> returnsTimeline = new ArrayList<>();

    // Expenses/Vacancy
    private Float netOperatingIncome;
    private Float totalExpensesAtEnd;
    private Float effectiveGrossIncome;
    private Float expenseRatio;
    private Float vacancyAtYear1;
    private Float badDebt;
    private Float grossPotentialRents;
    private Float economicVacancy;

    // Waterfall Structure
    private List<WaterfallEntry> waterfall = new ArrayList<>();


    // Calculated values
    private Float pricePerUnit = null;
    private Float dscr;

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getReType() {
        return reType;
    }

    public void setReType(String reType) {
        this.reType = reType;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }

    public String getPropertyClass() {
        return propertyClass;
    }

    public void setPropertyClass(String propertyClass) {
        this.propertyClass = propertyClass;
    }

    public Integer getNumUnits() {
        return numUnits;
    }

    public void setNumUnits(Integer numUnits) {
        this.numUnits = numUnits;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getYearRenovated() {
        return yearRenovated;
    }

    public void setYearRenovated(String yearRenovated) {
        this.yearRenovated = yearRenovated;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getHoldYears() {
        return holdYears;
    }

    public void setHoldYears(Integer holdYears) {
        this.holdYears = holdYears;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Float getLtv() {
        return ltv;
    }

    public void setLtv(Float ltv) {
        this.ltv = ltv;
    }

    public Float getLtc() {
        return ltc;
    }

    public void setLtc(Float ltc) {
        this.ltc = ltc;
    }

    public Float getCurrentLibor() {
        return currentLibor;
    }

    public void setCurrentLibor(Float currentLibor) {
        this.currentLibor = currentLibor;
    }

    public Float getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(Float loanRate) {
        this.loanRate = loanRate;
    }

    public String getPrepaymentPenalty() {
        return prepaymentPenalty;
    }

    public void setPrepaymentPenalty(String prepaymentPenalty) {
        this.prepaymentPenalty = prepaymentPenalty;
    }

    public Float getPrinciplePlusInterestPayment() {
        return principlePlusInterestPayment;
    }

    public void setPrinciplePlusInterestPayment(Float principlePlusInterestPayment) {
        this.principlePlusInterestPayment = principlePlusInterestPayment;
    }

    public List<FundingSource> getFundingSources() {
        return fundingSources;
    }

    public void setFundingSources(List<FundingSource> fundingSources) {
        this.fundingSources = fundingSources;
    }

    public Float getTargetedIRR() {
        return targetedIRR;
    }

    public void setTargetedIRR(Float targetedIRR) {
        this.targetedIRR = targetedIRR;
    }

    public Float getTargetedEM() {
        return targetedEM;
    }

    public void setTargetedEM(Float targetedEM) {
        this.targetedEM = targetedEM;
    }

    public Float getTargetedAvgCashYield() {
        return targetedAvgCashYield;
    }

    public void setTargetedAvgCashYield(Float targetedAvgCashYield) {
        this.targetedAvgCashYield = targetedAvgCashYield;
    }

    public Boolean getClassAOrPreferredEquity() {
        return classAOrPreferredEquity;
    }

    public void setClassAOrPreferredEquity(Boolean classAOrPreferredEquity) {
        this.classAOrPreferredEquity = classAOrPreferredEquity;
    }

    public String getPaymentSchedule() {
        return paymentSchedule;
    }

    public void setPaymentSchedule(String paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }

    public Float getAcquisitionFee() {
        return acquisitionFee;
    }

    public void setAcquisitionFee(Float acquisitionFee) {
        this.acquisitionFee = acquisitionFee;
    }

    public Float getDispositionFee() {
        return dispositionFee;
    }

    public void setDispositionFee(Float dispositionFee) {
        this.dispositionFee = dispositionFee;
    }

    public Float getAssetManagementFee() {
        return assetManagementFee;
    }

    public void setAssetManagementFee(Float assetManagementFee) {
        this.assetManagementFee = assetManagementFee;
    }

    public Float getConstructionManagementFee() {
        return constructionManagementFee;
    }

    public void setConstructionManagementFee(Float constructionManagementFee) {
        this.constructionManagementFee = constructionManagementFee;
    }

    public Float getPropertyManagementFee() {
        return propertyManagementFee;
    }

    public void setPropertyManagementFee(Float propertyManagementFee) {
        this.propertyManagementFee = propertyManagementFee;
    }

    public Float getEquityPlacementFee() {
        return equityPlacementFee;
    }

    public void setEquityPlacementFee(Float equityPlacementFee) {
        this.equityPlacementFee = equityPlacementFee;
    }

    public Float getGuarantyFee() {
        return guarantyFee;
    }

    public void setGuarantyFee(Float guarantyFee) {
        this.guarantyFee = guarantyFee;
    }

    public Float getRefinancingFee() {
        return refinancingFee;
    }

    public void setRefinancingFee(Float refinancingFee) {
        this.refinancingFee = refinancingFee;
    }

    public List<TimelineEntry> getReturnsTimeline() {
        return returnsTimeline;
    }

    public void setReturnsTimeline(List<TimelineEntry> returnsTimeline) {
        this.returnsTimeline = returnsTimeline;
    }

    public Float getNetOperatingIncome() {
        return netOperatingIncome;
    }

    public void setNetOperatingIncome(Float netOperatingIncome) {
        this.netOperatingIncome = netOperatingIncome;
    }

    public Float getTotalExpensesAtEnd() {
        return totalExpensesAtEnd;
    }

    public void setTotalExpensesAtEnd(Float totalExpensesAtEnd) {
        this.totalExpensesAtEnd = totalExpensesAtEnd;
    }

    public Float getEffectiveGrossIncome() {
        return effectiveGrossIncome;
    }

    public void setEffectiveGrossIncome(Float effectiveGrossIncome) {
        this.effectiveGrossIncome = effectiveGrossIncome;
    }

    public Float getExpenseRatio() {
        return expenseRatio;
    }

    public void setExpenseRatio(Float expenseRatio) {
        this.expenseRatio = expenseRatio;
    }

    public Float getVacancyAtYear1() {
        return vacancyAtYear1;
    }

    public void setVacancyAtYear1(Float vacancyAtYear1) {
        this.vacancyAtYear1 = vacancyAtYear1;
    }

    public Float getBadDebt() {
        return badDebt;
    }

    public void setBadDebt(Float badDebt) {
        this.badDebt = badDebt;
    }

    public Float getGrossPotentialRents() {
        return grossPotentialRents;
    }

    public void setGrossPotentialRents(Float grossPotentialRents) {
        this.grossPotentialRents = grossPotentialRents;
    }

    public Float getEconomicVacancy() {
        return economicVacancy;
    }

    public void setEconomicVacancy(Float economicVacancy) {
        this.economicVacancy = economicVacancy;
    }

    public List<WaterfallEntry> getWaterfall() {
        return waterfall;
    }

    public void setWaterfall(List<WaterfallEntry> waterfall) {
        this.waterfall = waterfall;
    }

    public Float getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public Float getDscr() {
        return dscr;
    }

    public void setDscr(Float dscr) {
        this.dscr = dscr;
    }
}
