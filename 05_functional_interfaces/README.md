# 05 — Functional Interfaces

`java.util.function` interfaces plus `Comparable`/`Comparator` — the building blocks of
lambdas, method references, and the Stream API.

## Action Plan
- [x] `Predicate<T>`: `test`, `and`, `or`, `negate`, `isEqual` (`_1PredicateTest.java`)
- [x] `Comparator<T>`: anonymous class vs lambda vs `Comparator.comparing`, `reversed`, `thenComparing`,
      `comparingInt/Long/Double`, `nullsFirst/nullsLast`, `naturalOrder`/`reverseOrder` (`_2ComparatorTest.java`)
- [x] Additional `Comparator` progressions — from a basic `Comparator<int[]>` implementation through anonymous classes,
      lambdas, and `Comparator.comparing`/`thenComparing` chains on custom objects
      (`comparator/ComparatorTest1.java` .. `ComparatorTest5.java`)
- [x] `Comparable<T>`: natural ordering via `compareTo`, when to use vs `Comparator` (`_3ComparableTest.java`)
- [ ] `Function<T,R>`, `BiFunction`, `UnaryOperator`, `BinaryOperator`, composition (`andThen`, `compose`) (`_4FunctionTest.java` — empty, fill in)
- [ ] `Consumer<T>`, `BiConsumer<T,U>`, `andThen`
- [ ] `Supplier<T>`
- [ ] Method references: `Class::staticMethod`, `instance::method`, `Class::instanceMethod`, `Class::new`
- [ ] Custom functional interfaces (`@FunctionalInterface`)

## Structure
- `notes/` — reference notes per subtopic
- `worksheet/` — `.java` files with `// TODO:` markers to practice each subtopic
- `src/` — completed reference examples (`_1`.._4`)
