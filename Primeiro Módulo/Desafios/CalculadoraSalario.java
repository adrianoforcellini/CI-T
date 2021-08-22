public class CalculadoraSalario {

	private double calcularInss(double salarioBase) {
		double salarioBruto = 0;

		if (salarioBase <= 1500.00) {
			salarioBruto = salarioBase * 92 / 100;
		} else if (salarioBase <= 4000.00) {
			salarioBruto = salarioBase * 91 / 100;
		} else {
			salarioBruto = salarioBase * 89 / 100;
		}
		return salarioBruto;
	}

	public long calcularSalarioLiquido(double salarioBase) {

		if (salarioBase < 1039) {
			return 0;
		}
		
		double salarioLiquido = 0;
		double bruto = calcularInss(salarioBase);

		if (bruto <= 3000.00) {
			salarioLiquido = bruto;
		} else if (bruto <= 6000.00) {
			salarioLiquido = bruto * 92.5 / 100;
		} else {
			salarioLiquido = bruto * 85 / 100;
		}
		return Math.round(salarioLiquido);
	}

}
