# 04 — Collections

The Java Collections Framework: lists, sets, maps, queues, sorting, and common conversions.
This is the most-used part of Java day to day.

## Action Plan
- [x] Creating lists: `Arrays.asList`, `List.of`, `new ArrayList<>(...)` and their mutability differences (`_1CreateListTest.java`)
- [x] Sorting: `Arrays.sort`, `Collections.sort`, `list.sort`, `Stream.sorted`, natural vs custom order (`_2InbuiltSortTest.java`, `_2_sort_methods_reference.md`)
- [x] `HashMap`: put/get/getOrDefault/containsKey/entrySet/forEach (`_3HashMapTest.java`)
- [x] Type conversion / boxing-unboxing / widening-narrowing / parsing (`_4TypeConversionTest.java`)
- [x] `Set` implementations: `HashSet`, `LinkedHashSet`, `TreeSet`, `NavigableSet`/`SortedSet` (`src/set/HashSetTest.java`, `InsertionOrder.java`, `TreeSetTest.java`, `SortedSetTest.java`, `NavigableSetTest.java`, `_5_set_guide.md`)
- [x] `Map` implementations: `HashMap` vs `LinkedHashMap` vs `TreeMap` vs `EnumMap` vs `WeakHashMap`, custom object keys, immutable maps, LRU cache via `LinkedHashMap` (`src/map/*.java`, `_6_map_guide.md`)
- [x] `List` implementations: `ArrayList` vs `LinkedList` vs `CopyOnWriteArrayList`, creation methods, CRUD ops, object arrays (`src/list/*.java`, `src/linkedlist/LinkedListTest.java`, `_3_list_operations_reference.md`)
- [x] `Queue`/`Deque`: `ArrayDeque`, `PriorityQueue` (min/max heap), `LinkedList` as queue/deque (`src/queue/*.java`, `_4_queue_deque_guide.md`)
- [x] Iteration: `Iterator`, `Iterable`, fail-fast vs fail-safe (`src/iterator/IterableDemo.java`, `IteratorDemo.java`)
- [x] Immutability/variants: `CopyOnWriteArrayList`, `Collections.unmodifiableMap`/immutable maps, access-order vs insertion-order maps (`src/list/CopyOnArrayWriteListTest.java`, `src/map/ImmutableMapTest.java`, `AccessOrderTrue.java`, `InsertionOrder.java`)
- [x] Stacks: `Stack`, `ArrayDeque`, `LinkedList` as stack (`src/stack/*.java`)

## Structure
- `notes/` — reference notes (`_2_sort_methods_reference.md` covers all built-in sort methods; `_3_list_operations_reference.md`, `_4_queue_deque_guide.md`, `_5_set_guide.md`, `_6_map_guide.md` cover the Collections Framework in depth)
- `worksheet/` — `.java` files with `// TODO:` markers to practice each subtopic, including `list/`, `linkedlist/`, `iterator/`, `stack/`, `queue/`, `set/`, `map/` subfolders mirroring `src/`
- `src/` — completed reference examples (`_1`..`_4` at top level, plus `list/`, `linkedlist/`, `iterator/`, `stack/`, `queue/`, `set/`, `map/` subfolders covering the full Collections Framework)
