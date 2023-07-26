package com.one.conversor.latam;

import javax.swing.JOptionPane;

public class ConversorGrafico {
	
	public static void main(String[] args) {
	
		
		int continuar = 1;
		
		
		while (continuar == 1) {
		String Valor1 = "Conversor de divisas";
		String Valor2 = "Conversor de temperatura";
		Object[] possibleValues = { Valor1, Valor2 };

		Object selectedValue = JOptionPane.showInputDialog(null, "Elija el tipo de conversion que desea. Presione Cancel o Cerrar (X) para salir ", "Menú Principal",
		JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
		if (selectedValue == null) {
		JOptionPane.showMessageDialog(null, "Finalizando Programa", "Cancelar", 1);
		System.exit(0);
		}
			
			try {
				if (selectedValue == "Conversor de divisas") {
					
					Object[] Monedas = { "Peso Mexicano a Dolar", "Peso Mexicano a Euro", "Peso Mexicano a Libra Esterlina", "Peso Mexicano a Yen Japonés",
							"Peso Mexicano a Won Sul-Coreano", "Dolar a Peso Mexicano", "Euro a Peso Mexicano", "Libra Esterlina a Peso Mexicano", "Yen Japonés a Peso Mexicano", "Won Sul-Coreano" };

					Object MonedaEscogida = JOptionPane.showInputDialog(null, "Seleccione el tipo de cambio", "Divisas",
							JOptionPane.INFORMATION_MESSAGE, null, Monedas, Monedas[0]);
				if (MonedaEscogida == null) {
						JOptionPane.showMessageDialog(null, "Programa Finalizado", "Finalizado", 1);
						System.exit(0);
					}
					
				double inputValue = Double.parseDouble(JOptionPane.showInputDialog(null,
							"Ingrese la cantidad a convertir", "Conversor de divisas", 3));			
					
				if (MonedaEscogida == "Peso Mexicano a Dolar") {
						double Conversion = inputValue / 16.94;
						JOptionPane.showMessageDialog(null, "Equivale a " + Conversion + " Dolares", "Conversion", 1);
				} else if (MonedaEscogida == "Peso Mexicano a Euro") {
						double Conversion = inputValue / 18.72;
						JOptionPane.showMessageDialog(null, "Equivale a " + Conversion + " Euros", "Conversion", 1);
				} else if (MonedaEscogida == "Peso Mexicano a Libra Esterlina") {
						double Conversion = inputValue / 21.99;
						JOptionPane.showMessageDialog(null, "Equivale a " + Conversion + " Libras Esterlinas", "Conversion",
								1);
				} else if (MonedaEscogida == "Peso Mexicano a Yen Japonés") {
						double Conversion = inputValue / 0.12;
						JOptionPane.showMessageDialog(null, "Equivale a " + Conversion + " Yenes Japoneses", "Conversion", 1);
				} else if (MonedaEscogida == "Peso Mexicano a Won Sul-Coreano"){
						double Conversion = inputValue / 0.013;
						JOptionPane.showMessageDialog(null, "Equivale a " + Conversion + " Won Sul-Coreanos", "Conversor", 1);
				}else if (MonedaEscogida == "Dolar a Peso Mexicano") {
						double Conversion = inputValue / 0.059;
						JOptionPane.showMessageDialog(null, "Equivale a " + Conversion + " Pesos Mexicanos", "Conversion", 1);
				} else if (MonedaEscogida == "Euro a Peso Mexicano") {
						double Conversion = inputValue / 0.053;
						JOptionPane.showMessageDialog(null, "Equivale a " + Conversion + " Pesos Mexicanos", "Conversion", 1);
				} else if (MonedaEscogida == "Libra Esterlina a Peso Mexicano") {
						double Conversion = inputValue / 0.046;
						JOptionPane.showMessageDialog(null, "Equivale a " + Conversion + " Pesos Mexicanos", "Conversion",
								1);
				} else if (MonedaEscogida == "Yen Japonés a Peso Mexicano") {
						double Conversion = inputValue / 8.33;
						JOptionPane.showMessageDialog(null, "Equivale a " + Conversion + " Pesos Mexicanos", "Conversion", 1);
				} else  {
						double Conversion = inputValue / 75.48;
						JOptionPane.showMessageDialog(null, "Equivale a " + Conversion + " Pesos Mexicanos", "Conversor", 1);
				}	
					
					
					

				} else {
					
					Object[] Temperatura = { "Grados Centigrados a Grados Kelvin", "Grados Centigrados a Grados Farenheit", "Grados Kelvin a Grados Centigrados", "Grados Ferenheit a Grados Centigrados" };

					Object TemperaturaEscogida = JOptionPane.showInputDialog(null, "Seleccione La conversion a realizar", "Conversor de Temperatura",
							JOptionPane.INFORMATION_MESSAGE, null, Temperatura, Temperatura[0]);
				if (TemperaturaEscogida == null) {
						JOptionPane.showMessageDialog(null, "Programa Finalizado", "Finalizado", 1);
						System.exit(0);
					}
				double inputValue = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingrese la Temperatura a convertir", "Conversor de Temperatura", 1));
					System.out.println(inputValue);
				if (TemperaturaEscogida == "Grados Centigrados a Grados Kelvin") {
						double Conversion = inputValue + 273.15;
						JOptionPane.showMessageDialog(null, "Tu temperatura equivale a  " + Conversion + " °K",
								"Conversion", 1);
				}

				else if (TemperaturaEscogida == "Grados Centigrados a Grados Ferenheit") {
						double Conversion = (inputValue * 1.8 + 32);
						JOptionPane.showMessageDialog(null, "Tu temperatura aquivale a " + Conversion + " °F",
								"Conversion", 1);
				}
				else if (TemperaturaEscogida == "Grados Kelvin a Grados Centigrados") {
						double Conversion = (inputValue + -273.15);
						JOptionPane.showMessageDialog(null, "Tu temperatura aquivale a " + Conversion + " °C",
								"Conversion", 1);
				}
				else if (TemperaturaEscogida == "Grados Ferenheit a Grados Centigrados") {
						double Conversion = ((inputValue - 32) * 0.555);
						JOptionPane.showMessageDialog(null, "Tu temperatura aquivale a " + Conversion + " °C",
								"Conversion", 1);
					}
				}
				
			}

			catch(NumberFormatException | NullPointerException exception){JOptionPane.showMessageDialog(null, "No se permite texto, caracteres especiales y/o cancelar", "Error",
					0); 
			}
			
			final int eleccion = JOptionPane.showInternalConfirmDialog(null, "¿Desea continuar con el programa?",
					"Repetir programa", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (eleccion == JOptionPane.OK_OPTION) {
				continuar = 1;

			} 
			else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado", "Finalizado", 1);
				System.exit(0);
			}
		}

	}


	
}

