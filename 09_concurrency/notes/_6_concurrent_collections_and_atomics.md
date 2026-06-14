# Concurrent Collections & Atomic Variables (no code yet — TODO)

## Concurrent Collections
- `ConcurrentHashMap` vs `HashMap` (segment/bucket-level locking, no full-map lock)
- `CopyOnWriteArrayList` — visualize like git: writes create a new copy/branch, readers see the old snapshot

## Atomic Variables
- `AtomicInteger`, `AtomicLong`, `AtomicReference`
- `volatile` vs `Atomic` (visibility vs visibility + atomicity)
- compare-and-swap (CAS)

## Fork/Join Framework
- `ForkJoinPool`, `RecursiveTask` / `RecursiveAction`
- work-stealing

## Action plan
- [ ] `_1ConcurrentHashMapDemo.java`
- [ ] `_2CopyOnWriteArrayListDemo.java`
- [ ] `_3AtomicIntegerDemo.java` (vs plain `int` race condition)
- [ ] `_4ForkJoinSumDemo.java`
