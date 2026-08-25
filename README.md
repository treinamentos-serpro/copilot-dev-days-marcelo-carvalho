🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

<div align="center">

# 🎯 Soc Ops

### Social Bingo for In-Person Mixers

*Find people who match the prompts. Get five in a row. Make real connections.*

[![Lab Guide](https://img.shields.io/badge/📚_Lab_Guide-View_Workshop-4f46e5?style=for-the-badge)](workshop/GUIDE.md)
[![Java 21](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.2-6db33f?style=for-the-badge&logo=spring)](https://spring.io/projects/spring-boot)

</div>

---

## What is Soc Ops?

Soc Ops is a **Social Bingo** web app built to energize in-person events. Each player gets a unique 5×5 board filled with conversation-starter prompts — *"Has lived abroad"*, *"Speaks more than two languages"*, *"Prefers dark mode"* — and races to find real people who match each square. First to get five in a row wins.

It's also the foundation of a **hands-on GitHub Copilot workshop** where you'll use Agent Mode to redesign the UI, create custom quiz themes, and build new features with multi-agent TDD workflows.

---

## 🚀 Workshop

Transform this app from scratch using VS Code Agent Mode with GitHub Copilot:

| Part | Title | What You'll Do |
|------|-------|----------------|
| [**00**](workshop/00-overview.md) | Overview & Checklist | Get oriented and verify your setup |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering | Teach the AI about your codebase |
| [**02**](workshop/02-design.md) | Design-First Frontend | Redesign the UI with creative themes |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master | Create your own quiz themes with custom agents |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development | Build features with TDD and design agents |

> **~1 hour** · Intermediate · Java 21 / Spring Boot / Maven

---

## ⚡ Quick Start

**Prerequisites:** [Java 21 JDK](https://adoptium.net/) · [Maven 3.9+](https://maven.apache.org/) (or use the included wrapper)

```bash
git clone <this-repo>
cd socops
./mvnw spring-boot:run
```

Open [http://localhost:8080](http://localhost:8080) — your board is ready. 🎲

---

## 🛠 Commands

| Task | Command |
|------|---------|
| Run | `cd socops && ./mvnw spring-boot:run` |
| Build | `cd socops && ./mvnw clean package` |
| Test | `cd socops && ./mvnw test` |

> Deploys automatically to GitHub Pages on push to `main`.
