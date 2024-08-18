# Dependencias
Para que seja possível executar o arquivo no eclipse, é necessário fazer algumas coisas antes:

# 1.Baixe a pasta do projeto no GitHub
[https://github.com/Saady-Crispim/Metropole-verde.]
# 2.Importe para o workspace do eclipse
em botão direito no Package Explorer -> Importar... -> Existing Projects into Workspace -> Colocar o caminho do diretório do arquivo.
# 3.colocar a biblioteca do “JavaFX” no projeto 
em botão direito no projeto -> Build Path -> Configure Build Path... -> Classpath -> Add Library... -> selecionar a biblioteca do javaFX -> apply.
# 4.É necessário colocar os argumentos no projeto:
  Botão direito no arquivo main do projeto -> Run As -> Run Configurations... -> Arguments -> em “VM arguments”	digite “--module-path "(O caminho dos .jar da biblioteca javaFX)" --add-modules javafx.controls,javafx.fxml”.
        Exemplo do Arguments: --module-path C:\java-libs\javafx-sdk\lib --add-modules javafx.controls,javafx.fxml
  Clique em Run.
