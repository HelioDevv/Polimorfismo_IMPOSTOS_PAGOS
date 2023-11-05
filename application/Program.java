package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisisca;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do #" + (i + 1) + " contribuinte: ");
			System.out.print("Pessoa Física ou Pessoa Jurídica (f / j)?");
			char fj = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			if(fj == 'f') {
				System.out.print("Gastos com saúde: ");
				double saude = sc.nextDouble();
				list.add(new PessoaFisisca(name, renda, saude));
			}else {
				System.out.print("Numero de Empregados: ");
				int empregados = sc.nextInt();
				list.add(new PessoaJuridica(name, renda, empregados));
			}
					
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		for(Contribuintes c : list) {
			double impost = c.imposto();
			System.out.println(c.getNome() + ": " + "$ " + String.format("%.2f", impost));
			sum += impost;
		}
		System.out.println();
		System.out.println("IMPOSTOS TOTAIS:  $ " + String.format("%.2f", sum));
		
		
		sc.close();
		}

	}
