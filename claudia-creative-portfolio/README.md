# Claudia Creative Portfolio

A responsive portfolio website built with Java 21, Spring Boot, Thymeleaf, HTML, CSS, and JavaScript.

## Run in GitHub Codespaces

1. Create a new GitHub repository.
2. Upload all project files to the repository.
3. Click **Code → Codespaces → Create codespace on main**.
4. In the Codespace terminal, run:

```bash
mvn spring-boot:run
```

5. Open the forwarded port `8080`.

## Customize

- Main page content: `src/main/resources/templates/index.html`
- Styling: `src/main/resources/static/css/style.css`
- Interactions: `src/main/resources/static/js/script.js`
- Project data: `src/main/java/com/claudia/portfolio/controller/HomeController.java`
- Images: `src/main/resources/static/images/`

## Production Build

```bash
mvn clean package
java -jar target/creative-portfolio-0.0.1-SNAPSHOT.jar
```
