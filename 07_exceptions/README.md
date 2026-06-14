# 07 — Exception Handling (new topic)

Robust error handling: exception hierarchy, checked vs unchecked, try-with-resources,
custom exceptions, and best practices seen across the concurrency code (e.g. restoring
the interrupt flag).

## Action Plan
- [ ] Exception hierarchy: `Throwable` → `Error` vs `Exception` → checked vs `RuntimeException`
- [ ] `try`/`catch`/`finally`, multi-catch, try-with-resources (`AutoCloseable`)
- [ ] Custom exceptions: extending `Exception` vs `RuntimeException`
- [ ] Exception chaining (`getCause`, `initCause`)
- [ ] Best practices: don't swallow exceptions, restore interrupt flag (`Thread.currentThread().interrupt()`),
      fail fast vs fail safe
- [ ] `finally` vs `finalize()` vs `try`-with-resources cleanup ordering
- [ ] Stack traces, `printStackTrace`, logging exceptions properly

## Structure
- `notes/` — reference notes per subtopic
- `worksheet/` — `.java` files with `// TODO:` markers to practice each subtopic
- `src/` — completed reference examples
