package rcavalcante.entradadedados.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan implements Input {
	Scanner sc = new Scanner(System.in);

	private void exibeTexto(String texto) {
		System.out.println(texto);
	}

	private void exibeErro(String texto) {
		System.err.println(texto);
	}

	public String next(String texto) {
		exibeTexto(texto);
		return sc.next();
	}

	public String next(String texto, String erro) {
		exibeErro(erro);
		exibeTexto(texto);
		return sc.next();
	}

	public String nextLine(String texto) {
		if (sc.hasNextLine()) sc.nextLine();
		
		exibeTexto(texto);
		return sc.nextLine();
	}
	
	public String nextLine(String texto, String erro) {
		if (sc.hasNextLine()) sc.nextLine();
		
		exibeErro(erro);
		exibeTexto(texto);
		return sc.nextLine();
	}

	public Double nextDouble(String texto) {
		try {
			exibeTexto(texto);
			return sc.nextDouble();
		} catch (InputMismatchException e) {
			if (sc.hasNextLine()) sc.nextLine();
			return nextDouble(texto, "O valor digitado não é do tipo double");
		}
	}
	
	public Double nextDouble(String texto, String erro) {
		try {
			exibeErro(erro);
			exibeTexto(texto);
			return sc.nextDouble();
		} catch (InputMismatchException e) {
			if (sc.hasNextLine()) sc.nextLine();
			return null;
		}
	}
	
	public Integer nextInt(String texto) {
		try {
			exibeTexto(texto);
			return sc.nextInt();
		} catch (InputMismatchException e) {
			if (sc.hasNextLine()) sc.nextLine();
			return nextInt(texto, "O valor digitado não é do tipo integer");
		}
	}
	
	public Integer nextInt(String texto, String erro) {
		try {
			exibeErro(erro);
			exibeTexto(texto);
			return sc.nextInt();
		} catch (InputMismatchException e) {
			if (sc.hasNextLine()) sc.nextLine();
			return null;
		}
	}

	@Override
	public Float nextFloat(String texto) {
		try {
			exibeTexto(texto);
			return sc.nextFloat();
		} catch (InputMismatchException e) {
			if (sc.hasNextLine()) sc.nextLine();
			return nextFloat(texto,  "O valor digitado não é do tipo Float");
		}
	}

	@Override
	public Float nextFloat(String texto, String erro) {
		try {
			exibeErro(erro);
			exibeTexto(texto);
			return sc.nextFloat();
		} catch (InputMismatchException e) {
			if (sc.hasNextLine()) sc.nextLine();
			return null;
		}
	}

	@Override
	public Long nextLong(String texto) {
		try {
			exibeTexto(texto);
			return sc.nextLong();
		} catch (InputMismatchException e) {
			if (sc.hasNextLine()) sc.nextLine();
			return null;
		}
	}

	@Override
	public Long nextLong(String texto, String erro) {
		try {
			exibeErro(erro);
			exibeTexto(texto);
			return sc.nextLong();
		} catch (InputMismatchException e) {
			if (sc.hasNextLine()) sc.nextLine();
			return null;
		}
	}

}
