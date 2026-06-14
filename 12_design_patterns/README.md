# 12 — Design Patterns

Practical design patterns, demonstrated with small real-world-ish examples
(banking adapter, student builder). Migrated from `javainone/systemdesign`.

## Action Plan
- [x] Adapter pattern — adapting incompatible bank APIs (Axis/Yes Bank) behind a common
      `ExternalBankExposedAPIHandler` interface, using dependency inversion (`src/adapter/_1.._6`)
- [x] Builder pattern — `Student`/`StudentBuilder`, immutable object with validation before
      construction (`src/builder/_1`, `_2`)
- [ ] Singleton pattern — eager/lazy/double-checked locking/enum singleton
- [ ] Factory & Abstract Factory pattern
- [ ] Observer pattern
- [ ] Strategy pattern
- [ ] Decorator pattern

## Structure
- `notes/` — one file per pattern: intent, structure, when to use, trade-offs
- `worksheet/` — `.java` files with `// TODO:` markers to implement each pattern from scratch
- `src/<pattern>/` — completed reference examples
