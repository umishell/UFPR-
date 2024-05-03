package veiculo;

import clienteLocacao.Locacao;
import java.util.Calendar;

import cliente.Cliente;

public interface VeiculoInterface {

	// Muda estado para LOCADO. Cria uma instância de Locacao e armazena no atributo
	// locacao.Chama ométodo getValorDiariaLocacaopara calcularo valor da locação.
	public void locar(int dias, Calendar data, Cliente cliente);

	// Muda estado para VENDIDO e não pode mais ser alugado
	public void vender();

	// Muda estado para DISPONIVEL
	public void devolver();

	public Estado getEstado();

	public Marca getMarca();

	public Categoria getCategoria();

	public Locacao getLocacao();

	public String getPlaca();

	public int getAno();

	// Método que calcula um valor para venda. Utilizar o seguinte cálculo:
	// valorParaVenda = valorDeCompra – idadeVeiculoEmAnos*0,15*valorDeCompra
	// Se o resultado for menor do que 10% do valorDeCompra ou negative, então
	// varlorParaVenda = valorDeCompra*0,1
	public double getValorParaVenda();

	// Método que será abstrato na classe Veiculo
	public double getValorDiariaLocacao();
}
