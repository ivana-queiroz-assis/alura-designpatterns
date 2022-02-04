package com.example.loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlApi = new URL(url);
            URLConnection openConnection = urlApi.openConnection();
            openConnection.connect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao enviar requisicao HTTP");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao enviar requisicao HTTP");
        }
    }
}
