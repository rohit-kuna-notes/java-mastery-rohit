# 03 — Generics (new topic)

Generics let you write type-safe, reusable classes/methods/interfaces. Not yet covered
anywhere in old notes — build this module from scratch.

## Action Plan
- [ ] Generic classes and methods (`<T>`, multiple type params)
- [ ] Bounded type parameters (`<T extends Number>`)
- [ ] Wildcards: `? extends T` (producer) vs `? super T` (consumer) — PECS principle
- [ ] Generic interfaces (e.g. own `Box<T>`, `Pair<K,V>`)
- [ ] Type erasure — what generics look like at runtime, limitations (no `new T()`, no generic arrays)
- [ ] Raw types and why to avoid them
- [ ] Recursive generic bounds (`<T extends Comparable<T>>`)
- [x] Generic helper data structures used across DSA problems: `Pair<K,V>`, `Interval`, `LinkedNode`, `TreeNode` (`src/helpers/Pair.java`, `Interval.java`, `LinkedNode.java`, `TreeNode.java`)

## Structure
- `notes/` — reference notes per subtopic
- `worksheet/` — `.java` files with `// TODO:` markers to practice each subtopic
- `src/` — completed reference examples
