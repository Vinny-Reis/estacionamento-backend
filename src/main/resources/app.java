
public @interface app {

		spring.datasource.url=jdbc:mysql://localhost/estacionamento?createDatabaseIfNotExist=true&serverTimezone=America/Sao_Paulo
		spring.datasource.username=root
		spring.datasource.password=Uvhr_669212345
		spring.jpa.database=MYSQL
		spring.jpa.hibernate.ddl-auto=create
		spring.jpa.show-sql=true
		spring.jpa.properties.hibernate.format_sql=true
		server.port=9094
		spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL57Dialect
	
	
		//H2
		server.port=8081
		spring.datasource.url=jdbc:h2:mem:testdb
		spring.datasource.username=sa
		spring.datasource.password=
		spring.jpa.show-sql=true
		spring.jpa.properties.hibernate.format_sql=true
				jdbc:mysql://localhost:3306/?user=root
}
