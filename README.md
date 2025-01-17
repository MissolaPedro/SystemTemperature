# SystemTemperature  

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![POO](https://img.shields.io/badge/POO-Programming%20Paradigm-blue?style=for-the-badge) ![API Integration](https://img.shields.io/badge/API%20Integration-Enabled-brightgreen?style=for-the-badge)  

O **SystemTemperature** é um projeto desenvolvido em Java utilizando conceitos de Programação Orientada a Objetos (POO).  
Seu principal objetivo é integrar-se a uma API de clima para obter dados meteorológicos, como temperatura, umidade e condições do tempo, para uma região específica.  

## 🔍 Funcionalidades  
- **Integração com API de clima**: Consome dados em tempo real fornecidos por uma API externa.  
- **Arquitetura orientada a objetos**: Implementação modular e organizada, garantindo flexibilidade e facilidade de manutenção.  
- **Prático e eficiente**: Focado em simplicidade e aplicabilidade para consumo de APIs e manipulação de dados climáticos.  

## 🚀 Tecnologias Utilizadas  
- **Java**  
- **Programação Orientada a Objetos (POO)**  
- **APIs Meteorológicas**  

## 📦 Estrutura do Projeto  
```plaintext
SystemTemperature/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── models/     # Classes representando os dados do clima
│   │   │   ├── services/   # Lógica de consumo e integração com a API
│   │   │   └── app/        # Classe principal para execução
├── resources/
│   └── application.properties # Configurações do projeto (ex.: chave da API)
├── README.md
└── pom.xml                  # Configurações do Maven
```  

## ⚙️ Como Usar  
1. Clone este repositório:  
   ```bash
   git clone https://github.com/MissolaPedro/SystemTemperature.git
   ```  
2. Configure a chave da API no arquivo `application.properties`.  
3. Compile e execute o projeto com o Maven:  
   ```bash
   mvn clean install
   mvn exec:java
   ```  

## 📋 Pré-requisitos  
- **Java 11+**  
- **Maven**  

## 📜 Licença  
Este projeto é distribuído sob a licença MIT. Consulte o arquivo [LICENSE](./LICENSE) para mais informações.  

---  

> **Nota**: Este projeto é ideal para estudantes ou desenvolvedores interessados em aprender sobre consumo de APIs e boas práticas em POO usando Java.
```  

Se precisar de ajustes ou mais detalhes, como links para a API utilizada, posso adicionar!
