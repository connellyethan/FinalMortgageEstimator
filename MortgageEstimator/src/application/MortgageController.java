package application;

import javafx.fxml.FXML;

public class MortgageController {

	@FXML
	private double gross_income;

	@FXML
	private double monthly_debt;

	@FXML
	private double interest_rate;

	@FXML
	private int term_years;

	@FXML
	private double down_payment;

	public static double max_payment_allowed(double gross_income){

		if(house_payment_only(gross_income)>payment_with_obligations(gross_income)){
			return payment_with_obligations(gross_income);
		}
		else{
			return house_payment_only(gross_income);
		}

	}

	public static double house_payment_only(double gross_income){

		double house_payment_only;
		house_payment_only = (gross_income)*.18;
		return house_payment_only;

	}

	public static double payment_with_obligations(double gross_income){

		double payment_with_obligations;
		payment_with_obligations = (gross_income)*.36;
		return payment_with_obligations;

	}


}
