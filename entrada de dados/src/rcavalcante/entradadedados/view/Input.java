package rcavalcante.entradadedados.view;

public interface Input {

	public String next(String texto);
	public String next(String texto, String erro);
	public String nextLine(String texto);
	public String nextLine(String texto, String erro);
	public Double nextDouble(String texto);
	public Double nextDouble(String texto, String erro);
	public Float nextFloat(String texto);
	public Float nextFloat(String texto, String erro);
	public Integer nextInt(String texto);
	public Integer nextInt(String texto, String erro);
	public Long nextLong(String texto);
	public Long nextLong(String texto, String erro);

}
