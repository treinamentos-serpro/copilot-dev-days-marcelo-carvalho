# Repository Guide

## Mandatory checklist

- [ ] Lint: inspect changed JavaScript/CSS/HTML for syntax and formatting issues; no lint tool is configured.
- [ ] Build: `cd socops && ./mvnw clean package`
- [ ] Test: `cd socops && ./mvnw test`

Run Maven commands from `socops/`; the root has no Maven project.

```bash
cd socops
./mvnw test
./mvnw clean package
./mvnw spring-boot:run
```

The local game is served at `http://localhost:8080/`.

## Architecture and contracts

- The runnable app is under `socops/`; `docs/` is the separate static workshop site.
- Stack: Java 21, Spring Boot 3.4.2, Spring MVC, Thymeleaf, and vanilla JavaScript. There is no database, authentication, persistence layer, or server-side game state.
- `BingoRestController` serves `game.html` at `/` and returns fresh boards from `/api/bingo/fresh-board`.
- `BoardAssembler` is static pure logic for 25-cell boards, flipping, and row/column/diagonal detection. Domain types are under `socops/src/main/java/com/socops/model/`.
- Keep `BoardAssembler` and `socops/src/main/resources/templates/game.html` synchronized: 25 positions, center free cell at index 12, IDs, selection, winning lines, and `localStorage` key `socops-bingo-snapshot`.
- Keep prompts at 24 or more. Add board-logic tests in `socops/src/test/java/com/socops/service/BoardAssemblerTests.java`; browser and controller coverage is limited.
- Follow [.github/instructions/css-utilities.instructions.md](.github/instructions/css-utilities.instructions.md) and [.github/instructions/frontend-design.instructions.md](.github/instructions/frontend-design.instructions.md). Reuse [.github/agents/](.github/agents/) and [.github/prompts/](.github/prompts/) when relevant.

## Documentation

- Overview and commands: [README.md](README.md)
- Workshop index: [workshop/GUIDE.md](workshop/GUIDE.md)
- Setup, design, prompts, and agents: [workshop/01-setup.md](workshop/01-setup.md), [workshop/02-design.md](workshop/02-design.md), [workshop/03-quiz-master.md](workshop/03-quiz-master.md), [workshop/04-multi-agent.md](workshop/04-multi-agent.md)

Link to existing documentation instead of duplicating it here.
