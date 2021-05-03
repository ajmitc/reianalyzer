package rei.analysis;

public class CashOnCashCalculator {
    private double cashOnCashReturnPercentage = 0.0;

    // Purchase data
    private double purchasePrice;
    private double downPaymentPercentage = 0.3;
    private double closingCosts = 0.0;
    private double repairsRenovations = 0.0;

    // Loan data
    private double interestRate = 0.0;
    private int loanYears = 30;
    private int paymentsPerYear = 12;

    // PropertyAddress data
    private int numberOfUnits = 2;
    private double propertyTaxesPerYear = 0.0;
    private double insurancePerYear = 0.0;
    private double monthlyGrossRentalIncome = 0.0;
    private double vacancyRatePercentage = 0.05;

    // PropertyAddress Management data
    private double propertyManagementFeePercentage = 0.10;
    private double leasingCostPerUnit = 0.0;
    private int avgOccupancyYears = 1;
    private double maintenanceCostPercentage = 0.05;
    private double monthlyUtilitiesOther = 200.0;



    // Internal variables
    private double principalInterest;
    private double averageVacancyCost;
    private double netMonthlyRentalIncome;
    private double monthlyExpenses;
    private double netMonthlyOperatingIncome;
    private double downPayment;
    private double monthlyCashflow;
    private double annualCashflow;
    private double totalInvestment;

    public CashOnCashCalculator(){}

    public void recompute(){
        averageVacancyCost = monthlyGrossRentalIncome * vacancyRatePercentage;
        netMonthlyRentalIncome = monthlyGrossRentalIncome - averageVacancyCost;
        netMonthlyOperatingIncome = netMonthlyRentalIncome - monthlyExpenses;

        monthlyExpenses =
                (propertyManagementFeePercentage * netMonthlyRentalIncome) +
                        ((leasingCostPerUnit * numberOfUnits / 12.0) / avgOccupancyYears) +
                        (monthlyGrossRentalIncome * maintenanceCostPercentage) +
                        monthlyUtilitiesOther +
                        (propertyTaxesPerYear / 12.0) +
                        (insurancePerYear / 12.0);

        principalInterest = 0.0;

        monthlyCashflow = netMonthlyOperatingIncome - principalInterest;
        annualCashflow = monthlyCashflow * 12;
        downPayment = purchasePrice * downPaymentPercentage;
        totalInvestment = downPayment + closingCosts + repairsRenovations;
        cashOnCashReturnPercentage = annualCashflow / totalInvestment;
    }

    public double getCashOnCashReturnPercentage() {
        return cashOnCashReturnPercentage;
    }

    public void setCashOnCashReturnPercentage(double cashOnCashReturnPercentage) {
        this.cashOnCashReturnPercentage = cashOnCashReturnPercentage;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getDownPaymentPercentage() {
        return downPaymentPercentage;
    }

    public void setDownPaymentPercentage(double downPaymentPercentage) {
        this.downPaymentPercentage = downPaymentPercentage;
    }

    public double getClosingCosts() {
        return closingCosts;
    }

    public void setClosingCosts(double closingCosts) {
        this.closingCosts = closingCosts;
    }

    public double getRepairsRenovations() {
        return repairsRenovations;
    }

    public void setRepairsRenovations(double repairsRenovations) {
        this.repairsRenovations = repairsRenovations;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanYears() {
        return loanYears;
    }

    public void setLoanYears(int loanYears) {
        this.loanYears = loanYears;
    }

    public int getPaymentsPerYear() {
        return paymentsPerYear;
    }

    public void setPaymentsPerYear(int paymentsPerYear) {
        this.paymentsPerYear = paymentsPerYear;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public double getPropertyTaxesPerYear() {
        return propertyTaxesPerYear;
    }

    public void setPropertyTaxesPerYear(double propertyTaxesPerYear) {
        this.propertyTaxesPerYear = propertyTaxesPerYear;
    }

    public double getInsurancePerYear() {
        return insurancePerYear;
    }

    public void setInsurancePerYear(double insurancePerYear) {
        this.insurancePerYear = insurancePerYear;
    }

    public double getMonthlyGrossRentalIncome() {
        return monthlyGrossRentalIncome;
    }

    public void setMonthlyGrossRentalIncome(double monthlyGrossRentalIncome) {
        this.monthlyGrossRentalIncome = monthlyGrossRentalIncome;
    }

    public double getVacancyRatePercentage() {
        return vacancyRatePercentage;
    }

    public void setVacancyRatePercentage(double vacancyRatePercentage) {
        this.vacancyRatePercentage = vacancyRatePercentage;
    }

    public double getPropertyManagementFeePercentage() {
        return propertyManagementFeePercentage;
    }

    public void setPropertyManagementFeePercentage(double propertyManagementFeePercentage) {
        this.propertyManagementFeePercentage = propertyManagementFeePercentage;
    }

    public double getLeasingCostPerUnit() {
        return leasingCostPerUnit;
    }

    public void setLeasingCostPerUnit(double leasingCostPerUnit) {
        this.leasingCostPerUnit = leasingCostPerUnit;
    }

    public int getAvgOccupancyYears() {
        return avgOccupancyYears;
    }

    public void setAvgOccupancyYears(int avgOccupancyYears) {
        this.avgOccupancyYears = avgOccupancyYears;
    }

    public double getMaintenanceCostPercentage() {
        return maintenanceCostPercentage;
    }

    public void setMaintenanceCostPercentage(double maintenanceCostPercentage) {
        this.maintenanceCostPercentage = maintenanceCostPercentage;
    }

    public double getMonthlyUtilitiesOther() {
        return monthlyUtilitiesOther;
    }

    public void setMonthlyUtilitiesOther(double monthlyUtilitiesOther) {
        this.monthlyUtilitiesOther = monthlyUtilitiesOther;
    }
}
