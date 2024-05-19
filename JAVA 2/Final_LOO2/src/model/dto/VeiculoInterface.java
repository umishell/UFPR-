package model.dto;

import java.util.Calendar;



public interface VeiculoInterface {

	// Muda estado para LOCADO. Cria uma instância de Locacao e armazena no atributo
	// locacao.Chama ométodo getValorDiariaLocacaopara calcularo valor da locação.
	public void locar(int dias, Calendar data, Cliente cliente);

	// Muda estado para VENDIDO e não pode mais ser alugado
	public void vender();

	// Muda estado para DISPONIVEL
	public void devolver();

	public String getEstado();

	public String getMarca();

	public String getCategoria();

	public Locacao getLocacao();

	public String getPlaca();

	public int getAno();

	// Método que calcula um valor para venda. Utilizar o seguinte cálculo:
	// valorParaVenda = valorDeCompra – idadeVeiculoEmAnos*0,15*valorDeCompra
	// Se o resultado for menor do que 10% do valorDeCompra ou negative, então
	// varlorParaVenda = valorDeCompra*0,1
	public double getValorParaVenda();

	// Método que será abstrato na classe Veiculo
	//public double getValorDiariaLocacao();
}
