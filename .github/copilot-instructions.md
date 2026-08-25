# Repository Instructions

## Design Guide

The Soc Ops web experience uses a distinctive pixel-arcade visual language. Preserve this direction when changing the frontend:

- Use a warm paper/cream base with near-black ink and high-contrast red, blue, yellow, and green accents.
- Prefer blocky geometry, square corners, thick borders, hard offset shadows, grid patterns, and restrained arcade-inspired motion.
- Use expressive display typography for headings and a robust monospace fallback for interface text. Avoid generic dashboard styling and default blue/gray utility palettes.
- Keep the lobby focused on the SOC OPS title, mission briefing, and primary start action. Keep the active game focused on the 5x5 board and its compact status HUD.
- Make unselected, selected, free, and winning cells visually distinct. Maintain readable prompt wrapping and stable tile dimensions on mobile and desktop.
- Preserve the existing Thymeleaf and vanilla JavaScript architecture. Do not add a frontend framework or dependency for visual changes.
- Keep these DOM IDs unchanged: `lobbyView`, `activeView`, `gridContainer`, `bingoBanner`, and `victoryOverlay`.
- Keep the game contracts unchanged: 25 row-major cells, free cell at index 12, `/api/bingo/fresh-board`, localStorage key `socops-bingo-snapshot`, and the existing phase and accessibility behavior.
- Provide visible `:focus-visible` states, touch-friendly controls, sufficient contrast, and reduced-motion fallbacks for animations.
- Avoid decorative elements that obscure prompts, controls, or the board. Check narrow mobile layouts for overflow and text overlap before finishing.

When making a substantial design change, update this guide so the documented visual direction remains aligned with the application.
