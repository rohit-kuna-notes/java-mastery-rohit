# 10 — JVM Internals (new topic)

Understanding what happens "under the hood" — important for debugging performance,
memory leaks, and concurrency issues.

## Action Plan
- [ ] JVM architecture overview: ClassLoader, Runtime Data Areas, Execution Engine
- [ ] Memory areas: Heap (young/old gen), Stack, Metaspace, PC registers, native method stacks
- [ ] Garbage Collection basics: when objects become eligible, GC roots, generational GC,
      common collectors (Serial, G1) at a conceptual level
- [ ] Classloading: bootstrap/platform/application classloaders, loading-linking-initialization
- [ ] JIT compilation: interpreter vs JIT, HotSpot tiers (conceptual)
- [ ] `String` pool and interning, revisit with [13_comparisons/_2_oop_and_core.md](../13_comparisons/notes/_2_oop_and_core.md)
- [ ] Memory leaks in Java despite GC (static references, listeners, ThreadLocal)
- [ ] Useful tools: `jps`, `jstack`, `jmap`, `VisualVM` (just enough to inspect a running JVM)

## Structure
- `notes/` — reference notes per subtopic (mostly conceptual, light on code)
- `worksheet/` — small `.java` programs to demonstrate concepts (e.g. OOM, memory leak demo) with `// TODO:`
- `src/` — completed reference examples
