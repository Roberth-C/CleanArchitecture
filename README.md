# Crear Base de datos docker
docker run --name CLeanArchitecture -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=admin1234 -e POSTGRES_DB=AutorLibro -p 5432:5432 -d postgres

# DBeaver
![image](https://github.com/user-attachments/assets/29b225c6-352e-4c09-8663-8cd1b7512134 | width="50%") 



# CleanArchitecture
# Instalar
mvn clean install

# Ejecución

mvn spring-boot:run





# Pruebas desde Postman Autores
# Listar los autores (GET)
http://localhost:8080/autores 

# Crear autor  (POST)
http://localhost:8080/autores

{
    "nombre": "Juanito",
    "apellido": "Pérez"
}

![Captura de pantalla 2025-02-14 233502](https://github.com/user-attachments/assets/e595df87-eded-4947-9d20-8ad3a037fc25)

# Obtener por Id (GET)
http://localhost:8080/autores/1

# Eliminar por Id (DELETE)
http://localhost:8080/autores/1

------------------------------------------------------------------------------
# Pruebas desde Postman Libros
# Listar los autores (GET)
http://localhost:8080/libros 

# Crear libro  (POST)
http://localhost:8080/libros

{
    "titulo": "La Sombra del Viento",
    "autor": "Carlos Ruiz Zafón",
    "isbn": "978-3-16-148410-0"
}
![image](https://github.com/user-attachments/assets/93f82023-e71e-4950-8bf4-00d030bfb955)

# Obtener por Id (GET)
http://localhost:8080/libros/1

# Eliminar por Id (DELETE)
http://localhost:8080/libros/1




