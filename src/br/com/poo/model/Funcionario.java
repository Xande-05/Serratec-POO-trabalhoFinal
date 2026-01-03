package br.com.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
	private double salarioBruto;
	private double descontoInss;
	private double descontoIR;
	private List<Dependente> dependente = new ArrayList<>();

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public Funcionario() {
		super();
	}

	public Funcionario(double salarioBruto, double descontoInss, double descontoIR) {
		super();
		this.salarioBruto = salarioBruto;
		this.descontoInss = descontoInss;
		this.descontoIR = descontoIR;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Double getDescontoInss() {
		return descontoInss;
	}

	public void setDescontoInss(Double descontoInss) {
		this.descontoInss = descontoInss;
	}

	public Double getDescontoIR() {
		return descontoIR;
	}

	public void setDescontoIR(Double descontoIR) {
		this.descontoIR = descontoIR;
	}

	public List<Dependente> getDependente() {
		return dependente;
	}

	public void adicionarDependente(Dependente dependente) {
		this.dependente.add(dependente);
	}

	public double calcularSalarioLiquido() {
		return salarioBruto - descontoInss - descontoIR;
	}

	@Override
	public String toString() {
		return "Funcionario{" + "  nome = " + getNome() + ", cpf = " + getCpf() + ", salarioBruto = " + salarioBruto
				+ ", descontoInss = " + descontoInss + ", descontoIR = " + descontoIR + '}';
	}
}
