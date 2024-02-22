# Projeto de Exemplo de Relacionamentos entre Entidades com Spring Data JPA

Este é um projeto de exemplo que ilustra o uso de diferentes tipos de relacionamentos entre entidades usando Spring Data JPA. O foco principal é fornecer exemplos práticos de configurações e implementações para os seguintes tipos de relacionamentos:

1. **One-to-One (Um para Um):**
   - Demonstração de um relacionamento One-to-One entre duas entidades, onde uma entidade está associada a exatamente uma outra entidade.

2. **Many-to-One (Muitos para Um):**
   - Implementação de um relacionamento Many-to-One entre duas entidades, onde várias instâncias de uma entidade podem estar associadas a uma única instância da outra entidade.
  
   **
   - CREATE TABLE posts (
   - id INT AUTO_INCREMENT PRIMARY KEY,
   - title VARCHAR(255),
   - content TEXT

);

___________________________________________________

   - CREATE TABLE comments (
    - id INT AUTO_INCREMENT PRIMARY KEY,
    - author VARCHAR(255),
    - content TEXT,
    - id_post INT,
    - FOREIGN KEY (id_post) REFERENCES posts(id)
);
**
3. **Many-to-Many (Muitos para Muitos):**
   - Exemplo prático de um relacionamento Many-to-Many entre duas entidades, mostrando como configurar e utilizar esse tipo de relacionamento.
