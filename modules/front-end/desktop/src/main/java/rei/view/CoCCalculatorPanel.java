package rei.view;

import rei.analysis.PropertyAnalysisReport;
import rei.Model;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;

public class CoCCalculatorPanel extends JPanel {
    private PropertyAnalysisReport propertyAnalysisReport;

    private JLabel lblCashOnCashReturnPercentage;
    private JLabel lblPurchasePrice;
    private JLabel lblDownPaymentPercentage;
    private JLabel lblClosingCosts;
    private JLabel lblRepairsRenovations;
    private JLabel lblInterestRate;
    private JLabel lblLoanYears;
    private JLabel lblPaymentsPerYear;
    private JLabel lblNumberOfUnits;
    private JLabel lblPropertyTaxesPerYear;
    private JLabel lblInsurancePerYear;
    private JLabel lblMonthlyGrossRentalIncome;
    private JLabel lblVacancyRatePercentage;
    private JLabel lblPropertyManagementFeePercentage;
    private JLabel lblLeasingCostPerUnit;
    private JLabel lblAvgOccupancyYears;
    private JLabel lblMaintenanceCostPercentage;
    private JLabel lblMonthlyUtilitiesOther;
    private JLabel lblPrincipalInterest;
    private JLabel lblAverageVacancyCost;
    private JLabel lblNetMonthlyRentalIncome;
    private JLabel lblMonthlyExpenses;
    private JLabel lblNetMonthlyOperatingIncome;
    private JLabel lblDownPayment;
    private JLabel lblMonthlyCashflow;
    private JLabel lblAnnualCashflow;
    private JLabel lblTotalInvestment;



    private JFormattedTextField cashOnCashReturnPercentage;

    // Purchase data
    private JFormattedTextField purchasePrice;
    private JFormattedTextField downPaymentPercentage;
    private JFormattedTextField closingCosts;
    private JFormattedTextField repairsRenovations;

    // Loan data
    private JFormattedTextField interestRate;
    private JFormattedTextField loanYears;
    private JFormattedTextField paymentsPerYear;

    // PropertyAddress data
    private JFormattedTextField numberOfUnits;
    private JFormattedTextField propertyTaxesPerYear;
    private JFormattedTextField insurancePerYear;
    private JFormattedTextField monthlyGrossRentalIncome;
    private JFormattedTextField vacancyRatePercentage;

    // PropertyAddress Management data
    private JFormattedTextField propertyManagementFeePercentage;
    private JFormattedTextField leasingCostPerUnit;
    private JFormattedTextField avgOccupancyYears;
    private JFormattedTextField maintenanceCostPercentage;
    private JFormattedTextField monthlyUtilitiesOther;

    // Internal variables
    private JFormattedTextField principalInterest;
    private JFormattedTextField averageVacancyCost;
    private JFormattedTextField netMonthlyRentalIncome;
    private JFormattedTextField monthlyExpenses;
    private JFormattedTextField netMonthlyOperatingIncome;
    private JFormattedTextField downPayment;
    private JFormattedTextField monthlyCashflow;
    private JFormattedTextField annualCashflow;
    private JFormattedTextField totalInvestment;

    public CoCCalculatorPanel(Model model, View view){
        super();
        lblCashOnCashReturnPercentage = new JLabel("CoC Return");
        lblPurchasePrice = new JLabel("Purchase Price");
        lblDownPaymentPercentage = new JLabel("Down Payment %");
        lblClosingCosts = new JLabel("Closing Costs");
        lblRepairsRenovations = new JLabel("Repairs/Renovations");
        lblInterestRate = new JLabel("Interest Rate");
        lblLoanYears = new JLabel("Loan Term (Years)");
        lblPaymentsPerYear = new JLabel("Payments/Year");
        lblNumberOfUnits = new JLabel("Number Units");
        lblPropertyTaxesPerYear = new JLabel("Property Taxes/Year");
        lblInsurancePerYear = new JLabel("Insurance/Year");
        lblMonthlyGrossRentalIncome = new JLabel("Monthly Gross Rental Income");
        lblVacancyRatePercentage = new JLabel("Vacancy Rate %");
        lblPropertyManagementFeePercentage = new JLabel("Property Management Fee %");
        lblLeasingCostPerUnit = new JLabel("Leasing Cost/Unit");
        lblAvgOccupancyYears = new JLabel("Avg Occupancy (Years)");
        lblMaintenanceCostPercentage = new JLabel("Maintenance Cost %");
        lblMonthlyUtilitiesOther = new JLabel("Monthly Utilities/Other");
        lblPrincipalInterest = new JLabel("Principal & Interest");
        lblAverageVacancyCost = new JLabel("Avg Vacancy Cost");
        lblNetMonthlyRentalIncome = new JLabel("Net Monthly Rental Income");
        lblMonthlyExpenses = new JLabel("Monthly Expenses");
        lblNetMonthlyOperatingIncome = new JLabel("Net Monthly Operating Income");
        lblDownPayment = new JLabel("Down Payment");
        lblMonthlyCashflow = new JLabel("Monthly Cashflow");
        lblAnnualCashflow = new JLabel("");
        lblTotalInvestment = new JLabel("");

        NumberFormat percentFormat = NumberFormat.getNumberInstance();
        percentFormat.setMinimumFractionDigits(2);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        NumberFormat scalarFormat = NumberFormat.getNumberInstance();

        cashOnCashReturnPercentage = new JFormattedTextField(percentFormat);
        cashOnCashReturnPercentage.setValue(0.0);
        cashOnCashReturnPercentage.setColumns(7);
        cashOnCashReturnPercentage.setEditable(false);
        cashOnCashReturnPercentage.setForeground(Color.RED);

        // Purchase data
        purchasePrice = new JFormattedTextField(currencyFormat);
        purchasePrice.setValue(0.0);
        purchasePrice.setColumns(7);
        purchasePrice.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setPurchasePrice((double) purchasePrice.getValue());
                update();
            }
        });

        downPaymentPercentage = new JFormattedTextField(percentFormat);
        downPaymentPercentage.setValue(0.0);
        downPaymentPercentage.setColumns(7);
        downPaymentPercentage.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setDownPaymentPercentage((double) downPaymentPercentage.getValue());
                update();
            }
        });

        closingCosts = new JFormattedTextField(currencyFormat);
        closingCosts.setValue(0.0);
        closingCosts.setColumns(7);
        closingCosts.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setClosingCosts((double) closingCosts.getValue());
                update();
            }
        });

        repairsRenovations = new JFormattedTextField(currencyFormat);
        repairsRenovations.setValue(0.0);
        repairsRenovations.setColumns(7);
        repairsRenovations.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setRepairsRenovations((double) repairsRenovations.getValue());
                update();
            }
        });

        // Loan data
        interestRate = new JFormattedTextField(percentFormat);
        interestRate.setValue(5.0);
        interestRate.setColumns(7);
        interestRate.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setInterestRate((double) interestRate.getValue());
                update();
            }
        });

        loanYears = new JFormattedTextField(scalarFormat);
        loanYears.setValue(30);
        loanYears.setColumns(7);
        loanYears.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setInterestRate((int) loanYears.getValue());
                update();
            }
        });

        paymentsPerYear = new JFormattedTextField(scalarFormat);
        paymentsPerYear.setValue(12);
        paymentsPerYear.setColumns(7);
        paymentsPerYear.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setPaymentsPerYear((int) paymentsPerYear.getValue());
                update();
            }
        });

        // PropertyAddress data
        numberOfUnits = new JFormattedTextField(scalarFormat);
        numberOfUnits.setValue(0);
        numberOfUnits.setColumns(7);
        numberOfUnits.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setNumberOfUnits((int) numberOfUnits.getValue());
                update();
            }
        });

        propertyTaxesPerYear = new JFormattedTextField(currencyFormat);
        propertyTaxesPerYear.setValue(0.0);
        propertyTaxesPerYear.setColumns(7);
        propertyTaxesPerYear.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setPropertyTaxesPerYear((double) propertyTaxesPerYear.getValue());
                update();
            }
        });

        insurancePerYear = new JFormattedTextField(currencyFormat);
        insurancePerYear.setValue(0.0);
        insurancePerYear.setColumns(7);
        insurancePerYear.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setInsurancePerYear((double) insurancePerYear.getValue());
                update();
            }
        });

        monthlyGrossRentalIncome = new JFormattedTextField(currencyFormat);
        monthlyGrossRentalIncome.setValue(0.0);
        monthlyGrossRentalIncome.setColumns(7);
        monthlyGrossRentalIncome.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setMonthlyGrossRentalIncome((double) monthlyGrossRentalIncome.getValue());
                update();
            }
        });

        vacancyRatePercentage = new JFormattedTextField(percentFormat);
        vacancyRatePercentage.setValue(0.0);
        vacancyRatePercentage.setColumns(7);

        // PropertyAddress Management data
        propertyManagementFeePercentage = new JFormattedTextField(percentFormat);
        propertyManagementFeePercentage.setValue(0.0);
        propertyManagementFeePercentage.setColumns(7);

        leasingCostPerUnit = new JFormattedTextField(currencyFormat);
        leasingCostPerUnit.setValue(0.0);
        leasingCostPerUnit.setColumns(7);

        avgOccupancyYears = new JFormattedTextField(scalarFormat);
        avgOccupancyYears.setValue(1);
        avgOccupancyYears.setColumns(7);
        avgOccupancyYears.addPropertyChangeListener(evt -> {
            if (propertyAnalysisReport != null){
                propertyAnalysisReport.getCashOnCashCalculator().setAvgOccupancyYears((int) avgOccupancyYears.getValue());
                update();
            }
        });

        maintenanceCostPercentage = new JFormattedTextField(percentFormat);
        maintenanceCostPercentage.setValue(5.0);
        maintenanceCostPercentage.setColumns(7);

        monthlyUtilitiesOther = new JFormattedTextField(currencyFormat);
        monthlyUtilitiesOther.setValue(200.0);
        monthlyUtilitiesOther.setColumns(7);

        // Internal variables
        principalInterest = new JFormattedTextField(currencyFormat);
        principalInterest.setValue(0.0);
        principalInterest.setColumns(7);
        principalInterest.setEditable(false);

        averageVacancyCost = new JFormattedTextField(currencyFormat);
        averageVacancyCost.setValue(0.0);
        averageVacancyCost.setColumns(7);
        averageVacancyCost.setEditable(false);

        netMonthlyRentalIncome = new JFormattedTextField(currencyFormat);
        netMonthlyRentalIncome.setValue(0.0);
        netMonthlyRentalIncome.setColumns(7);
        netMonthlyRentalIncome.setEditable(false);

        monthlyExpenses = new JFormattedTextField(currencyFormat);
        monthlyExpenses.setValue(0.0);
        monthlyExpenses.setColumns(7);
        monthlyExpenses.setEditable(false);

        netMonthlyOperatingIncome = new JFormattedTextField(currencyFormat);
        netMonthlyOperatingIncome.setValue(0.0);
        netMonthlyOperatingIncome.setColumns(7);
        netMonthlyOperatingIncome.setEditable(false);

        downPayment = new JFormattedTextField(currencyFormat);
        downPayment.setValue(0.0);
        downPayment.setColumns(7);
        downPayment.setEditable(false);

        monthlyCashflow = new JFormattedTextField(currencyFormat);
        monthlyCashflow.setValue(0.0);
        monthlyCashflow.setColumns(7);
        monthlyCashflow.setEditable(false);

        annualCashflow = new JFormattedTextField(currencyFormat);
        annualCashflow.setValue(0.0);
        annualCashflow.setColumns(7);
        annualCashflow.setEditable(false);

        totalInvestment = new JFormattedTextField(currencyFormat);
        totalInvestment.setValue(0.0);
        totalInvestment.setColumns(7);
        totalInvestment.setEditable(false);

        JPanel fieldpanel = new JPanel();
        new GridBagLayoutHelper(fieldpanel, true)
                .add(lblCashOnCashReturnPercentage).add(cashOnCashReturnPercentage).nextRow()
                .add(lblPurchasePrice).add(purchasePrice).nextRow()
                .add(lblDownPaymentPercentage).add(downPaymentPercentage).nextRow()
                .add(lblClosingCosts).add(closingCosts).nextRow()
                .add(lblRepairsRenovations).add(repairsRenovations).nextRow()
                .add(lblInterestRate).add(interestRate).nextRow()
                .add(lblLoanYears).add(loanYears).nextRow()
                .add(lblPaymentsPerYear).add(paymentsPerYear).nextRow()
                .add(lblNumberOfUnits).add(numberOfUnits).nextRow()
                .add(lblPropertyTaxesPerYear).add(propertyTaxesPerYear).nextRow()
                .add(lblInsurancePerYear).add(insurancePerYear).nextRow()
                .add(lblMonthlyGrossRentalIncome).add(monthlyGrossRentalIncome).nextRow()
                .add(lblVacancyRatePercentage).add(vacancyRatePercentage).nextRow()
                .add(lblPropertyManagementFeePercentage).add(propertyManagementFeePercentage).nextRow()
                .add(lblLeasingCostPerUnit).add(leasingCostPerUnit).nextRow()
                .add(lblAvgOccupancyYears).add(avgOccupancyYears).nextRow()
                .add(lblMaintenanceCostPercentage).add(maintenanceCostPercentage).nextRow()
                .add(lblMonthlyUtilitiesOther).add(monthlyUtilitiesOther).nextRow()
                .add(lblPrincipalInterest).add(principalInterest).nextRow()
                .add(lblAverageVacancyCost).add(averageVacancyCost).nextRow()
                .add(lblNetMonthlyRentalIncome).add(netMonthlyRentalIncome).nextRow()
                .add(lblMonthlyExpenses).add(monthlyExpenses).nextRow()
                .add(lblNetMonthlyOperatingIncome).add(netMonthlyOperatingIncome).nextRow()
                .add(lblDownPayment).add(downPayment).nextRow()
                .add(lblMonthlyCashflow).add(monthlyCashflow).nextRow()
                .add(lblAnnualCashflow).add(annualCashflow).nextRow()
                .add(lblTotalInvestment).add(totalInvestment).nextRow()
        ;
    }

    public void setPropertyAnalysisReport(PropertyAnalysisReport propertyAnalysisReport) {
        this.propertyAnalysisReport = propertyAnalysisReport;
    }

    public void update(){
        if (this.propertyAnalysisReport != null){
            this.propertyAnalysisReport.getCashOnCashCalculator().recompute();
        }
    }
}
