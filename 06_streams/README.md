# 06 — Stream API

Functional-style operations on collections: creation, intermediate ops, terminal ops,
collectors, and `flatMap`.

## Action Plan
- [x] Creating streams: `Arrays.stream`, `Collection.stream`/`parallelStream`, `Stream.of`, `Stream.iterate` (`_1CreateStream.java`)
- [x] Intermediate ops: `filter`, `map`, `peek`, `distinct`, `skip`, `limit`, `sorted` (`_2StreamTest.java`)
- [x] Terminal ops: `anyMatch`/`allMatch`/`noneMatch`, `min`/`max`, `count`, `reduce`, `collect` (`_2StreamTest.java`)
- [x] `Collectors`: `toList`, `joining`, `groupingBy`, `partitioningBy` (`_2StreamTest.java`, `_4TestCollectors.java`)
- [x] `flatMap`: flattening nested collections (`_3FlatMapTest.java`)
- [ ] `Collectors.toMap`, `counting`, `summarizingInt`, `averagingInt`, downstream collectors
- [ ] Parallel streams: when they help vs hurt, common pitfalls
- [ ] `Optional`: creation, `map`/`filter`/`orElse`/`orElseGet`/`ifPresent`
- [ ] Primitive streams: `IntStream`, `LongStream`, `DoubleStream`, boxing cost

## Structure
- `notes/` — reference notes per subtopic
- `worksheet/` — `.java` files with `// TODO:` markers to practice each subtopic
- `src/` — completed reference examples (`_1`.._4`, `Employee.java` helper class)
