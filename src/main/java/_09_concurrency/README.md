# 09 — Concurrency & Multithreading

The most developed module — migrated from the old `java-notes/javaMultithreading` repo
(numbered `_1`, `_2`, ... example files, kept as-is). Covers threads, synchronization,
inter-thread communication, executors/futures, and (as TODOs) synchronizers, concurrent
collections, atomics and fork/join.

## Action Plan
- [x] Thread basics — creation, `start` vs `run`, `join`, priority, daemon threads (`notes/_1_thread_basics.md`, `src/createThread`, `src/joinThread`)
- [x] Synchronization — `synchronized` method/block, class vs object lock, deadlock causes (`notes/_2_synchronization.md`, `src/synchronization`)
- [x] Inter-thread communication — `wait`/`notify`, producer-consumer (`notes/_3_inter_thread_communication.md`, `src/interThreadCommunication`)
- [x] Executors & Futures — thread pools, `submit` vs `execute`, `Future`, `CompletableFuture` (`notes/_4_executors_and_futures.md`, `src/executorService`)
- [ ] Synchronizers — `CountDownLatch`, `CyclicBarrier`, `Semaphore` (`notes/_5_synchronizers.md` — code TODO)
- [ ] Concurrent collections & atomics — `ConcurrentHashMap`, `CopyOnWriteArrayList`, `AtomicInteger`, Fork/Join (`notes/_6_concurrent_collections_and_atomics.md` — code TODO)
- [ ] `Locks` package — `ReentrantLock`, `ReadWriteLock`, fair vs unfair (extend `notes/_2_synchronization.md`)

Comparison cheat-sheet for this module lives in [13_comparisons/notes/_1_concurrency.md](../13_comparisons/notes/_1_concurrency.md).

## Structure
- `notes/` — theory notes, one file per subtopic (`_1`.._6`)
- `worksheet/` — `.java` files with `// TODO:` markers to practice each subtopic
- `src/<subtopic>/` — completed reference examples, numbered `_1`, `_2`, ...
