package br.com.fiap.program;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.apache.http.client.ClientProtocolException;

import br.com.fiap.model.Cnpj;
import br.com.fiap.service.ApiCnpjService;

public class Teste {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	public static void main(String[] args) throws ClientProtocolException, IOException {
		ApiCnpjService apiCnpjService = new ApiCnpjService();
		String pj = texto("Digite seu CNPJ: ");
		Cnpj cnpj = apiCnpjService.getCnpj(pj);
		System.out.println(cnpj);
	}

	 
}
