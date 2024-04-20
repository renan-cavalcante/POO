package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.directory.InvalidAttributeValueException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ContaBancaria;
import model.ContaPoupanca;

@WebServlet("/conta")
public class ContaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("conta"));
		ContaBancaria conta = ContaSalva.getConta(id);

		request.setAttribute("conta", conta);
		RequestDispatcher rd = request.getRequestDispatcher("conta.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> erros = new ArrayList<>();
		ContaBancaria conta = null;
		try {
			int id = Integer.parseInt(request.getParameter("conta"));
			conta = ContaSalva.getConta(id);
			String opcao = request.getParameter("opcao");
			float valor = Float.parseFloat(request.getParameter("valor"));
			if (opcao.equals("saque")) {
				
				conta.sacar(valor);
				if(conta.getClass().getSimpleName().equals("ContaEspecial") && conta.getSaldo() < 0) {
					request.setAttribute("sucess", "Saque efetuado com sucesso, voce usou o seu valor de limite");
				}else {
					request.setAttribute("sucess", "Saque efetuado com sucesso");
				}
				
				
			}
			if (opcao.equals("deposito")) {
				
				conta.depositar(valor);
				request.setAttribute("sucess", "Deposito efetuado com sucesso");
			}
			if (opcao.equals("rendimento")) {
				request.setAttribute("valorAnterior", conta.getSaldo());
				((ContaPoupanca)conta).CalcularNovoSaldo(valor);
				request.setAttribute("sucess", "Rendimento efetuado com sucesso");
			}
		} catch (InvalidAttributeValueException e) {
			erros.add(e.getMessage());
			
		}catch (NumberFormatException e) {
			erros.add("Valor invalido, Digite apenas numeros");
			
		}catch (Exception e) {
			e.printStackTrace();
			erros.add(e.getMessage());
			
		}finally {
			request.setAttribute("erros", erros);
			request.setAttribute("conta", conta);
			RequestDispatcher rd = request.getRequestDispatcher("conta.jsp");
			rd.forward(request, response);
		}

	}

}
