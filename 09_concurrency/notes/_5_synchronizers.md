# Synchronizers (no code yet — TODO)

- `CountDownLatch` — one-time event: N threads wait until a count reaches zero
- `CyclicBarrier` — reusable sync point: all threads wait for each other, then proceed together
- `Semaphore` — permit manager: limits concurrent access to a resource

## Action plan
- [ ] Write `_1CountDownLatchDemo.java` — multiple workers signal completion, main waits
- [ ] Write `_2CyclicBarrierDemo.java` — threads in phases, all wait at barrier
- [ ] Write `_3SemaphoreDemo.java` — limit concurrent access (e.g. simulate connection pool)
