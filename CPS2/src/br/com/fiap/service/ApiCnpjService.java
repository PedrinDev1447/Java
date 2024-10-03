package br.com.fiap.service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import br.com.fiap.model.Cnpj;
import com.google.gson.Gson;

public class ApiCnpjService {

	public Cnpj getCnpj(String pj) throws ClientProtocolException, IOException {
		Cnpj cnpj = null;

		HttpGet request = new HttpGet("https://api.cnpjs.dev/v1/" + pj);

		CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

		CloseableHttpResponse response = httpClient.execute(request);

		HttpEntity entity = response.getEntity();

		if (entity != null) {
			String result = EntityUtils.toString(entity);
			Gson gson = new Gson();
			cnpj = gson.fromJson(result, Cnpj.class);
		}

		return cnpj;
	}
}
