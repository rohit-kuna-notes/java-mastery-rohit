# java.util.concurrent: Executors, Futures, CompletableFuture

## Why not create threads manually
- Thread creation is expensive; pools reuse threads and bound concurrency.

## Executor Service & Thread Pools
- `Executors.newFixedThreadPool(n)`
- `Executors.newCachedThreadPool()`
- `Executors.newSingleThreadExecutor()`
- `submit()` vs `execute()`
    - `execute()`: fire-and-forget `Runnable`, no result
    - `submit()`: returns `Future<V>`, accepts `Runnable` or `Callable`

## Runnable vs Callable vs Future vs CompletableFuture
- `Runnable` — no return value, can't throw checked exceptions from `run()`
- `Callable<V>` — returns a value, can throw checked exceptions
- `Future<V>` — handle to an async result: `get()` (blocking), `get(timeout)`, `isDone()`, `isCancelled()`
- `CompletableFuture<V>` — composable async pipeline:
    - `supplyAsync` / `runAsync`
    - `thenApply` / `thenApplyAsync` (same thread vs different thread)
    - `thenAccept`, `thenRun`, `thenCombine`
    - `exceptionally`, `handle`, `whenComplete`
    - `get()` (checked exception) vs `join()` (unchecked)

## Task Lifecycle (Future)
```
NEW → COMPLETING → NORMAL (done)
                 → EXCEPTIONAL
                 → CANCELLED
```

See: `src/executorService/_1.._7`
