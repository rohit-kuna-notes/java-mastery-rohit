# java-mastery-rohit

A single, structured repository to take Java from syntax basics to advanced/JVM/concurrency
topics — consolidated from several previous notes repos (`javainone`, `java-notes`,
`java-multithreading`, `java-mastery`).

## How it's organized

Every module follows the same shape:

```
NN_module_name/
  README.md     # what this topic covers + an action-plan checklist (progress tracker)
  notes/         # markdown reference notes, numbered _1, _2, ... per subtopic
  worksheet/     # .java files mirroring notes/src, with // TODO: markers for hands-on practice
  src/           # completed reference implementations (the "answer key")
```

Work through modules roughly in order. Use `worksheet/` to practice from scratch, then
compare against `src/`. Build with `mvn compile` (uses `build-helper-maven-plugin` to
register each module's `src/` as a source root).

## Roadmap

| # | Module | Status |
|---|--------|--------|
| 01 | [Basics](01_basics) — syntax, types, operators, control flow, strings | in progress |
| 02 | [OOP](02_oop) — classes, inheritance, polymorphism, abstraction | in progress |
| 03 | [Generics](03_generics) — generic types, bounds, wildcards | in progress |
| 04 | [Collections](04_collections) — List/Set/Map, sorting, conversions | in progress |
| 05 | [Functional Interfaces](05_functional_interfaces) — Predicate/Function/Comparator/Comparable | in progress |
| 06 | [Streams](06_streams) — Stream API, Collectors, flatMap | in progress |
| 07 | [Exceptions](07_exceptions) — checked/unchecked, try-with-resources, custom exceptions | todo (new) |
| 08 | [I/O & NIO](08_io_nio) — file I/O, NIO, serialization | todo (new) |
| 09 | [Concurrency](09_concurrency) — threads, sync, executors, futures, atomics | in progress (most complete) |
| 10 | [JVM Internals](10_jvm_internals) — memory model, GC, classloading, JIT | todo (new) |
| 11 | [Modern Java](11_modern_java) — records, sealed types, pattern matching, virtual threads | todo (new) |
| 12 | [Design Patterns](12_design_patterns) — adapter, builder, + more | in progress |
| 13 | [Comparisons](13_comparisons) — "X vs Y" cheat sheet, cross-links every module | in progress |

Modules marked **(new)** are gaps identified during consolidation — not covered in any
previous notes repo, and worth building up to round out Java mastery.
