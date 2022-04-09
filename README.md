# bancodados-jpa-hibernate
## Descrição
Código para criação de um banco de dados, a fim, de aplicar conhecimentos básicos de JPA e Hibernate. 

Configurado com Sql Server.

## Passos
1. [Arquivo pow.xml com propiedades e dependências](https://github.com/pliniopereira10/bancodados-jpa-hibernate/blob/main/pom.xml)

    Nesse arquivo informo compilador **java 11** como padrão.

    Dependência **HIbernate core** e **Hibenate EntityManager** para notações, mapeamento e criação da tabela.

    Importante não esquecer o **driver jdbc** utilizado, nesse caso **mssql-jdbc** para sql server.

2. [Criação da pasta META-INF e arquivo persistence.xml](https://github.com/pliniopereira10/bancodados-jpa-hibernate/blob/main/src/main/resources/META-INF/persistence.xml)

    Pasta e arquivo com as **configurações para conexão** com Banco de Dados.
    
    **Aqui temos:**
       * url de conexão
       * usuário
       * password
       * driver de conexão
       * dialeto de comunicação
       * propriedade para criação do banco
       * propriedades para exibição das querys

3. [Criação do pacote entidade e a classe para mapeamento da tabela](https://github.com/pliniopereira10/bancodados-jpa-hibernate/blob/main/src/main/java/entidades/Cliente.java)

    **Classe** identifica _tabela_ e **atributos** as _colunas_.

    Há necessidade das notações:

    * **@Entity** identificar a **_classe Cliente_** como _tabela_
    * **@Table** informar _carcterísticas_ e _nomear_ tabela
      
    * **@Id** identifica chave primária
    * 
      **@GeneratedValue** forma que será identificada alimentada a chave
      
    * **@Column** informa nome e propriedades da coluna

    
