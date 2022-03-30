<h1 align="center"> Disciplina de Enterprise Java Bean - Especialização em Tecnologia Java UTFPR </h1>

- Versão utilizada do [Jakarta EE 8](https://jakarta.ee/compatibility/#tab-8)

## Configuração da imagem Docker 
   ### Configuração intaladas do ambiente de desenvolvimento:
      - OpenJDK 11
      - Intellij IDE / Netbeans 12.5
      - Payara 5
      - Glassfish 6
      
   ### Executar no linux:

   ```shell
      $ sudo docker run --rm -it --shm-size=1024m -p 6901:6901  -e VNC_PW=password alerario/devee9:1.1
   ```

   ### Forma de Acessar o serviço do Docker:
      - No navegador para acessar o Kasm VNC: https://localhost:6901
      - Login: kasm_user
      - Senha: password 


## Resumo

- [Aula 4]() : importação das configurações do projeto utilizando maven com JSF e EJB e PAYARA.

