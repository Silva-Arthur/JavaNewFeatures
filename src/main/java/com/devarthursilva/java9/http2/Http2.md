# Definição 

O Http 2.0 passou a ser um protocolo de rede binário ao invés de texto, podendo ter inumeras conexões em uma requisição tcp


# Sintaxe

```

module NomeProjeto {
	requires java.net.http;
}


HttpClient client = HttpClient.newHttpClient(); // tem que ser importado na cláusula requires no arquivo module-info.java

```